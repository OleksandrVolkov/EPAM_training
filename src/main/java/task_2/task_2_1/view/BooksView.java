package task_2.task_2_1.view;


import task_2.task_2_1.model.Options;
import task_2.task_2_1.model.entity.Book;

public class BooksView implements UserMessages{
    UserInput input = new UserInput();

    public BooksView(){}

    public void printBooks(String message, Book[] books){
        System.out.println(message);

        for(Book book:books)
            System.out.println(book);
    }

    public void printMessage(String message){
        System.out.println(message);
    }

    public String enterStringValue(){
        return input.enterStringValue(this);
    }

    public int enterIntValue(){
        return input.enterIntValue(this);
    }

    public Options enterOptionValue(){
        return input.enterOptionValue(this);
    }
}
