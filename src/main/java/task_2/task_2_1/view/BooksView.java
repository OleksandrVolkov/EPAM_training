package task_2.task_2_1.view;


import task_2.task_2_1.model.entity.Book;

public class BooksView {
    final public static String ERROR_VAL = "Error, enter a valid value ";
    final public static String ALL_BOOKS = "All books: ";
    final public static String NO_BOOKS = "No books - ";
    final public static String AUTHOR = "Author - ";
    final public static String YEAR = "Year - ";
    final public static String PUBLISHER = "Publisher - ";
    final public static String GET_BOOKS_BY_AUTHOR = "Get books by chosen author: ";
    final public static String GET_BOOKS_BY_PUBLISHER = "Get books by chosen publisher: ";
    final public static String GET_BOOKS_AFTER_PERIOD = "Get books published after certain period of time(year of publishing): ";
    final public static String SORT_BY_PUBLISHERS = "Sorting books by publishers: ";

    final public static String MENU_STRING = "Enter a relative number \n\t1 - " + GET_BOOKS_BY_AUTHOR +
            "\n\t2 - " + GET_BOOKS_BY_PUBLISHER + "\n\t3 - " + GET_BOOKS_AFTER_PERIOD +
            "\n\t4 - " + SORT_BY_PUBLISHERS + "\n\t5 - Exit";




    public void printBooks(String message, Book[] books){
        System.out.println(message);

        for(Book book:books)
            System.out.println(book);
    }

    public void printMessage(String message){
        System.out.println(message);
    }
}
