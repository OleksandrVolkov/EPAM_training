package task_6.service;

import task_2.task_2_1.model.entity.Book;
import task_6.model.BookFields;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BookStringProcessor {

        public List<Book> getBookList(String text){
            List<Book> books = new ArrayList<>();
            String subLine = "";
            for(int i=0;i<text.length();i++){
                if(text.charAt(i) == '\n'){
                    books.add(this.getBook(subLine));
                    subLine = "";
                }
                else{
                    subLine += text.charAt(i);
                }
            }
            return books;
        }





    public Book getBook(String str){
        char[] chars = str.toCharArray();

        HashMap<BookFields,String> newMap = new HashMap<>();

        int counter = 1;
        String temp = "";

        for(char c: chars){
            switch (c){
                case '\t':
                    newMap.put(BookFields.getBookField(counter), temp);
                    counter++;
                    temp = "";
                    break;
                default:
                    temp += c;
                    break;
            }
        }

        int year = Integer.parseInt(newMap.get(BookFields.YEAR));
        double price = Double.parseDouble(newMap.get(BookFields.PRICE));
        int pages = Integer.parseInt(newMap.get(BookFields.PAGES));
        String author = newMap.get(BookFields.AUTHOR);
        String publisher = newMap.get(BookFields.PUBLISHER);
        String name = newMap.get(BookFields.NAME);

        return new Book(name,publisher,author,year,pages,price);
    }

}


