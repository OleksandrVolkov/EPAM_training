package task_6.controller;

import task_2.task_2_1.model.Books;
import task_2.task_2_1.model.DataSource;
import task_2.task_2_1.model.entity.Book;
import task_2.task_2_1.service.BooksService;
import task_2.task_2_1.view.BooksView;

import java.util.Arrays;
import java.util.List;

public class BookController {
    private Books model;
    private BooksView view;
    private BooksService service;



    public void run(List<Book> books){
        this.model = new Books(books);

        view = new BooksView();
        service = new BooksService(view, model);

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

    public List<Book> getModels(){
        return Arrays.asList(model.getBooks());
    }
}

