package task_2_1;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import task_2.task_2_1.model.Books;
import task_2.task_2_1.model.DataSource;
import task_2.task_2_1.model.entity.Book;
import task_2.task_2_1.service.BooksService;
import org.junit.Test;
import task_2.task_2_1.view.BooksView;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.*;



@RunWith(Parameterized.class)
public class BookTest {
    BooksService service;
    Books model;

    @Parameterized.Parameter
    public String author;

    @Parameterized.Parameter(1)
    public int year;

    @Parameterized.Parameter(2)
    public String publisher;

    @Parameterized.Parameter(3)
    public static Book[] booksByAuthor;

    @Parameterized.Parameter(4)
    public static Book[] booksAfterPeriod;

    @Parameterized.Parameter(5)
    public static Book[] booksByPublisher;

    @Parameterized.Parameter(6)
    public static Book[] sortByPublisher;



    @Before
    public void init(){
        model = new Books();
        model.setBooks(DataSource.getBooks());
        service = new BooksService(new BooksView(), model);
    }

    @Parameterized.Parameters
    public static Collection data(){
        return Arrays.asList( new Object[][]{
                    {"Shevchenko", 2010, "Word",
                            ExpectedValues.getArrayExpectedByAuthor(),
                            ExpectedValues.getArrayExpectedAfterPeriod(),
                            ExpectedValues.getArrayExpectedByPublisher(),
                            ExpectedValues.getSortedByPublisher()},
                }
        );
    }

    @Test
    public void testGetByAuthor(){
        Book[] actual = service.getByAuthor(author);
        assertArrayEquals(booksByAuthor, actual);
    }

    @Test
    public void testGetAfterPeriod(){
        Book[] actual = service.getByDate(year);
        assertArrayEquals(booksAfterPeriod, actual);
    }

    @Test
    public void testGetByPublisher(){
        Book[] actual = service.getByPublisher(publisher);
        assertArrayEquals(booksByPublisher, actual);
    }

    @Test
    public void sortBooksByPublisher(){
        service.sortByPublisher();
        Book[] actual = model.getBooks();
        assertArrayEquals(sortByPublisher, actual);
    }

}


