package task_2.task_2_1.model;

import task_2.task_2_1.model.entity.Book;

import java.util.Arrays;

public class Books {
    private Book[] books;

    public Books(){

    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public Book[] getByAuthor(String author){
        Book[] temp = new Book[books.length];

        int counter=0;
        for(int i=0; i<books.length; i++)
            if(books[i].getAuthor().equals(author))
                temp[counter++]=books[i];

        return Arrays.copyOf(temp, counter);
    }


    public Book[] getByDate(int year){
        Book[] temp =new Book[books.length];
        int counter = 0;
        for(Book book: books)
            if(book.getYear() > year)
                temp[counter++] = book;
        return Arrays.copyOf(temp,counter);
    }

    public Book[] getByPublisher(String publisher){
        Book[] temp = new Book[books.length];
        int counter = 0;
        for(Book book:books)
            if(book.getPublisher().equals(publisher))
                temp[counter++] = book;
        return Arrays.copyOf(temp,counter);
    }

    public Book[] sortByAuthor(String publisher){
        return null;
    }



}
//model
//  entity
//      Book
//  Books
//
