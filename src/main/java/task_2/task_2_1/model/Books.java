package task_2.task_2_1.model;

import task_2.task_2_1.model.entity.Book;

import java.util.Arrays;
import java.util.List;

public class Books {
    private Book[] books;

    public Books(){}
    public Books(List<Book> books){
        this.books = new Book[books.size()];

        for(int i = 0;i<books.size();i++){
            this.books[i] = books.get(i);
        }
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public Book[] sortByAuthor(String publisher){
        return null;
    }

}

