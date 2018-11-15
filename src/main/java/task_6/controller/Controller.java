package task_6.controller;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import task_2.task_2_1.model.Books;
import task_2.task_2_1.model.entity.Book;
import task_6.service.BookStringProcessor;
import task_6.service.FileHandling;
import task_6.model.BookFields;
import task_6.view.View;

public class Controller {
    private FileHandling fileHandling = new FileHandling();
    private BookStringProcessor stringProcessor = new BookStringProcessor();
    private List<Book> books;
    private BookController bookController = new BookController();
    private View view = new View();


    public void run() throws FileNotFoundException, UnsupportedEncodingException {
       // "static/InitialFile_task6.txt"
        // "static/FinalFile_task6.txt"

        view.printMessage(View.ENTER_PATH_READ);
        String initialPath = view.getString();

        view.printMessage(View.ENTER_PATH_WRITE);
        String finalPath = view.getString();

        fileHandling.write(initialPath);
        String text = fileHandling.read(initialPath);
        books = stringProcessor.getBookList(text);
        bookController.run(books);
        books = bookController.getModels();
        fileHandling.write(finalPath, books);
    }

}














//    public static Book getBook(String str){
//      //  System.out.println(str);
//        char[] chars = str.toCharArray();
//
//        HashMap<BookFields,String> newMap = new HashMap<>();
//
//        int counter = 1;
//        String temp = "";
//
//        for(char c: chars){
//            switch (c){
//                case '\t':
//                    newMap.put(BookFields.getBookField(counter), temp);
//                    counter++;
//                    temp = "";
//                    break;
//                default:
//                     temp += c;
//                     break;
//            }
//        }
//        System.out.println();
//
//        int year = Integer.parseInt(newMap.get(BookFields.YEAR));
//        double price = Double.parseDouble(newMap.get(BookFields.PRICE));
//        int pages = Integer.parseInt(newMap.get(BookFields.PAGES));
//        String author = newMap.get(BookFields.AUTHOR);
//        String publisher = newMap.get(BookFields.PUBLISHER);
//        String name = newMap.get(BookFields.NAME);
//
//        return new Book(name,publisher,author,year,pages,price);
//    }












//        BufferedReader br = new BufferedReader(new FileReader("InitialFile.txt"));
//        List <Book>books2 = new ArrayList();
//
//        try {
//            StringBuilder sb = new StringBuilder();
//            String line = br.readLine();
//
//            while (line != null) {
//                sb.append(line);
//                sb.append(System.lineSeparator());
//                books2.add(getBook(line));
//                line = br.readLine();
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                br.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//



