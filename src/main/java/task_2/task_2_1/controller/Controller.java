package task_2.task_2_1.controller;
import task_2.task_2_1.model.*;
import task_2.task_2_1.model.entity.Book;
import task_2.task_2_1.service.BooksService;
import task_2.task_2_1.view.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Controller {
    private Books model = new Books();
    private BooksView view = new BooksView();
    private BooksService service = new BooksService(view, model);


    public Controller(){}

    public void run(){
        model.setBooks(DataSource.getBooks());
        view.printBooks(BooksView.ALL_BOOKS,model.getBooks());

        while(true) {
            view.printMessage(BooksView.MENU_STRING);

            switch (view.enterOptionValue()) {
                case SEARCH_BY_AUTHOR:
                    view.printMessage(BooksView.GET_BOOKS_BY_AUTHOR);
                    service.searchBooksByAuthor(view.enterStringValue());
                    break;
                case GET_BOOKS_AFTER_PERIOD:
                    view.printMessage(BooksView.GET_BOOKS_AFTER_PERIOD);
                    service.getBooksAfterPeriod(view.enterIntValue());
                    break;
                case GET_BOOKS_BY_PUBLISHER:
                    view.printMessage(BooksView.GET_BOOKS_BY_PUBLISHER);
                    service.getBooksByPublisher(view.enterStringValue());
                    break;
                case SORT_BY_PUBLISHERS:
                    service.sortBooksByPublisher(BooksView.SORT_BY_PUBLISHERS);
                    break;
                case ERROR_VAL:
                    return;
                default:
                    view.printMessage(BooksView.ERROR_VAL);
                    break;
            }
        }
    }
}
