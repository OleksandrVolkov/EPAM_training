package task_2.task_2_1.controller;
import task_2.task_2_1.model.*;
import task_2.task_2_1.model.entity.Book;
import task_2.task_2_1.view.*;

import java.util.Arrays;
import java.util.Scanner;


public class Controller {
    private Books model = new Books();
    private BooksView view = new BooksView();
    private Scanner scn;

    public void run(){
        model.setBooks(DataSource.getBooks());
        view.printBooks(BooksView.ALL_BOOKS,model.getBooks());

        while(true) {
            view.printMessage(BooksView.MENU_STRING);

            switch (enterOptionValue()) {
                case SEARCH_BY_AUTHOR:
                    view.printMessage(BooksView.GET_BOOKS_BY_AUTHOR);
                    searchBooksByAuthor(enterStringValue());
                    break;
                case GET_BOOKS_AFTER_PERIOD:
                    view.printMessage(BooksView.GET_BOOKS_AFTER_PERIOD);
                    getBooksAfterPeriod(enterIntValue());
                    break;
                case GET_BOOKS_BY_PUBLISHER:
                    view.printMessage(BooksView.GET_BOOKS_BY_PUBLISHER);
                    getBooksByPublisher(enterStringValue());
                    break;
                case SORT_BY_PUBLISHERS:
                    sortBooksByPublisher(BooksView.SORT_BY_PUBLISHERS);
                    break;
                case ERROR_VAL:
                    return;
                default:
                    view.printMessage(BooksView.ERROR_VAL);
                    break;
            }
        }

    }


    private void searchBooksByAuthor(String author){
        Book[] result = model.getByAuthor(author);
        if(result.length == 0){
            view.printMessage(BooksView.NO_BOOKS + author);
        }else{
               view.printBooks(BooksView.AUTHOR + author + ": ",result);
        }
    }

    private void getBooksAfterPeriod(int year){
        Book[] result = model.getByDate(year);
        if(result.length == 0){
            view.printMessage(BooksView.NO_BOOKS + year);
        }else{
            view.printBooks(BooksView.YEAR + year,result);
        }
    }

    private void getBooksByPublisher(String publisher){
        Book[] result = model.getByPublisher(publisher);
        if(result.length == 0) {
            view.printMessage(BooksView.NO_BOOKS + publisher);
        }else{
            view.printBooks(BooksView.PUBLISHER + publisher, result);
        }
    }


    private void sortBooksByPublisher(String mes){
        Arrays.sort(model.getBooks(), new PublishersComparator());
        view.printBooks(mes+"\n",model.getBooks());
    }




    public Options enterOptionValue(){
        scn = new Scanner(System.in);
        int val = 0;


        while(true){
            if(scn.hasNextInt()){
                val = scn.nextInt();

                if(val>0 && val<6)
                    return Options.searchForOption(val);
                else {
                    view.printMessage(view.ERROR_VAL);
                    scn = new Scanner(System.in);
                }
            }else{
                view.printMessage(view.ERROR_VAL);
                scn = new Scanner(System.in);
            }
        }
    }


    public int enterIntValue(){
        scn = new Scanner(System.in);
        int val = 0;

        while(true){
            if(scn.hasNextInt()){
                val = scn.nextInt();

                if(val>0)
                    return val;
                else {
                    view.printMessage(view.ERROR_VAL);
                    scn = new Scanner(System.in);
                }
            }else{
                view.printMessage(view.ERROR_VAL);
                scn = new Scanner(System.in);
            }
        }
    }


    public String enterStringValue(){
        scn = new Scanner(System.in);
        String val = "";

        while(true){
            if(scn.hasNextLine()){
                val = scn.nextLine();

                if(!val.equals("") || !val.equals(" "))
                    return val;
                else {
                    view.printMessage(view.ERROR_VAL);
                    scn = new Scanner(System.in);
                }

            }else{
                view.printMessage(view.ERROR_VAL);
                scn = new Scanner(System.in);
            }
        }
    }


}
