package task_2.task_2_1.service;

import task_2.task_2_1.controller.Controller;
import task_2.task_2_1.model.Books;
import task_2.task_2_1.model.Options;
import task_2.task_2_1.model.PublishersComparator;
import task_2.task_2_1.model.entity.Book;
import task_2.task_2_1.view.BooksView;

import java.util.Arrays;
import java.util.Scanner;

public class BooksService{
    Books model;
    BooksView view;

    public BooksService(){}
    public BooksService(BooksView view, Books model){
        this.view = view;
        this.model = model;
    }


    public void searchBooksByAuthor(String author){
        Book[] result = getByAuthor(author);
        if(result.length == 0)
            view.printMessage(BooksView.NO_BOOKS + author);
        else
            view.printBooks(BooksView.AUTHOR + author + ": ",result);
    }

    public void getBooksAfterPeriod(int year){
        Book[] result = getByDate(year);
        if(result.length == 0)
            view.printMessage(BooksView.NO_BOOKS + year);
        else
            view.printBooks(BooksView.YEAR + year,result);
    }

    public void getBooksByPublisher(String publisher){
        Book[] result = getByPublisher(publisher);
        if(result.length == 0)
            view.printMessage(BooksView.NO_BOOKS + publisher);
        else
            view.printBooks(BooksView.PUBLISHER + publisher, result);
    }


    public void sortBooksByPublisher(String mes){
        this.sortByPublisher();
        view.printBooks(mes+"\n",model.getBooks());
    }

    public void sortByPublisher(){
        Arrays.sort(model.getBooks(), new PublishersComparator());
    }


    public Book[] getByAuthor(String author){
        Book[] temp = new Book[model.getBooks().length];

        int counter=0;
        for(int i=0; i<model.getBooks().length; i++)
            if(model.getBooks()[i].getAuthor().equals(author))
                temp[counter++]=model.getBooks()[i];

        return Arrays.copyOf(temp, counter);
    }


    public Book[] getByDate(int year){
        Book[] temp =new Book[model.getBooks().length];
        int counter = 0;
        for(Book book: model.getBooks())
            if(book.getYear() > year)
                temp[counter++] = book;
        return Arrays.copyOf(temp,counter);
    }

    public Book[] getByPublisher(String publisher){
        Book[] temp = new Book[model.getBooks().length];
        int counter = 0;
        for(Book book : model.getBooks())
            if(book.getPublisher().equals(publisher))
                temp[counter++] = book;
        return Arrays.copyOf(temp,counter);
    }

}
