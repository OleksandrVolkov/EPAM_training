package task_11.task_11_2.service;



import task_11.task_11_2.exception.UnExistItemMenu;
import task_11.task_11_2.model.dao.connection.ConnectionMySql;
import task_11.task_11_2.model.dao.daoimpl.BookDAO;
import task_11.task_11_2.model.dao.factory.DaoFactory;
import task_11.task_11_2.model.entity.Book;
import task_11.task_11_2.util.OutputFile;
import task_11.task_11_2.util.ResourceManager;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;

public class ServiceBooks {
    private BookDAO dao;
    private ResourceManager manager = ResourceManager.INSTANCE;

    public ServiceBooks() {
        dao = DaoFactory.getInstance()
                .createBookDao(ConnectionMySql.getConnection());
    }

    private boolean isEmpty(Book[] books) {
        return (books == null || books.length == 0);
    }
    public String showAllBooks() {
        Book[] books = dao.getAll();
        if ( isEmpty(books) ) {
            return manager.getMessage("ERROR") + "\n";
        }
        return convertBooksInString(books);
    }

    private String convertBooksInString(Book[] books) {
        StringBuilder str = new StringBuilder();
        for (Book book : books ) {
            str.append(book);
            str.append("\n");
        }
        return str.toString();
    }

    public String searchBooksByAuthor(String type, String author){
        Book[] books = dao.findByString(type, author);
        if ( isEmpty(books)) {
            return manager.getMessage("NO_BOOKS")
                    + author + "\n";
        }
        return manager.getMessage("BOOKS_AUTHOR")
                + author + "\n"
                + convertBooksInString(books);
    }

    public String searchBooksByPublisher(String type, String publisher){
        Book[] books = dao.findByString(type, publisher);
        if ( isEmpty(books)) {
            return manager.getMessage("NO_BOOKS")
                    + publisher + "\n";
        }
        return manager.getMessage("BOOKS_PUBLISH")
                + publisher
                + "\n" + convertBooksInString(books);
    }

    public String searchBooksAfterYear(String type, int year){
        Book[] books = dao.findByInt(type, year);
        if ( isEmpty(books)) {
            return manager.getMessage("NO_BOOKS_YEAR")
                    + year + "\n";
        }
        return manager.getMessage("BOOKS_AFTER_YEAR")
                + year + "\n"
                + convertBooksInString(books);
    }

    public String sortByPublisher() {
        Book[] books = dao.getAll();
        if ( isEmpty(books)) {
            return manager.getMessage("ERROR") + "\n";
        }
        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPublish().compareTo(o2.getPublish());
            }
        });
        return convertBooksInString(books);
    }

    public void changeLanguare(int choise) throws UnExistItemMenu {
        manager.changeLocale(defineLocale(choise));
    }

    private Locale defineLocale(int number) throws UnExistItemMenu {
        Languare[] languares = Languare.values();
        if (number <= 0 || number > languares.length) {
            throw new UnExistItemMenu(manager.getMessage("WRONG_INPUT_DATA"));
        }
        return languares[number - 1].getLocale();
    }

    public void saveBooks() {
        Book[] books = dao.getAll();
        if ( isEmpty(books) ) {
           return;
        }
        OutputFile.save(books);
    }
}
