package task_6.view;

import task_2.task_2_1.model.entity.Book;

import java.util.List;

public class View extends UserInput implements UserInterface{
    public void printMessage(String str){
        System.out.println(str);
    }

    public void printBooks(List<Book> books){
        for(Book book: books)
            System.out.println(book);
    }
    public String getString(){
        return super.enterStringValue(this);
    }


}
