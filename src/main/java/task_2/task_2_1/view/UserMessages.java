package task_2.task_2_1.view;

public interface UserMessages {
    String ERROR_VAL = "Error, enter a valid value ";
    String ALL_BOOKS = "All books: ";
    String NO_BOOKS = "No books - ";
    String AUTHOR = "Author - ";
    String YEAR = "Year - ";
    String PUBLISHER = "Publisher - ";
    String GET_BOOKS_BY_AUTHOR = "Get books by chosen author: ";
    String GET_BOOKS_BY_PUBLISHER = "Get books by chosen publisher: ";
    String GET_BOOKS_AFTER_PERIOD = "Get books published after certain period of time(year of publishing): ";
    String SORT_BY_PUBLISHERS = "Sorting books by publishers: ";
    String MENU_STRING = "Enter a relative number \n\t1 - " + GET_BOOKS_BY_AUTHOR +
            "\n\t2 - " + GET_BOOKS_AFTER_PERIOD + "\n\t3 - " + GET_BOOKS_BY_PUBLISHER +
            "\n\t4 - " + SORT_BY_PUBLISHERS + "\n\t5 - Exit";
}
