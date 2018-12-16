package task_10.util;


import org.apache.log4j.Logger;
import task_10.model.data.DataSource;
import task_10.model.entity.Book;

import java.io.*;


public class InputOutputFile {
    final static Logger logger =
            Logger.getLogger(InputOutputFile.class);
    private static File file =
            new File(".\\src\\main\\resources\\data.ser");

    public static Book[] load() {
        try (ObjectInput oi = new ObjectInputStream(
                new FileInputStream(file))){
            return (Book[])oi.readObject();
        } catch (FileNotFoundException exp) {
            logger.info("File not found!");
            return DataSource.getBooks();
        } catch (IOException | ClassNotFoundException exp) {
            logger.error("Error read");
            return new Book[0];
        }
    }

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
