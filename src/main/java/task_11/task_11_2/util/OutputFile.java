package task_11.task_11_2.util;


import org.apache.log4j.Logger;
import task_11.task_11_2.model.entity.Book;

import java.io.*;


public class OutputFile {
    final static Logger logger =
            Logger.getLogger(OutputFile.class);
    private static File file =
            new File(".\\src\\main\\data.ser");

    public static void save(Book[] books) {
        try (ObjectOutput oo = new ObjectOutputStream(
                new FileOutputStream(file))){
            oo.writeObject(books);
        } catch (FileNotFoundException exp) {
            logger.info("File not found");
        } catch (IOException exp) {
            logger.error("Error write");
        }
    }
}
