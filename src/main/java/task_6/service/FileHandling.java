package task_6.service;

import task_2.task_2_1.model.DataSource;
import task_2.task_2_1.model.entity.Book;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHandling {
    PrintWriter writer;

    public void write(String path, List<Book> books) throws FileNotFoundException, UnsupportedEncodingException {
        writer = new PrintWriter(path, "UTF-8");
        for(Book b: books)
            writer.write(b.getPublisher() + "\t" + b.getAuthor() + "\t" + b.getName() +
                    "\t" + b.getYear() + "\t" + b.getPages() + "\t" + b.getPrice() + "\t" + "\n");

        writer.close();
    }


    public void write(String path) throws FileNotFoundException, UnsupportedEncodingException {
        writer = new PrintWriter(path, "UTF-8");
        Book[] books = DataSource.getBooks();
        for(Book b: books)
            writer.write(b.getPublisher()+"\t" + b.getAuthor() + "\t" + b.getName()+
                    "\t" + b.getYear() + "\t" + b.getPages()  + "\t" + b.getPrice() + "\t" +"\n");
        writer.close();
    }

    public String read(String path) throws FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader(path));

        StringBuilder sb = new StringBuilder();
        String line;
        try {
            line = br.readLine();
            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return sb.toString();
    }


}
