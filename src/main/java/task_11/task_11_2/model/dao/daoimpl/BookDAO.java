package task_11.task_11_2.model.dao.daoimpl;

import task_11.task_11_2.model.entity.Book;
import org.apache.log4j.Logger;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookDAO extends AbstractDAO {
    final static Logger logger = Logger.getLogger(BookDAO.class);

    private static final String ALL_BOOKS = "select * from book";

    public BookDAO(Connection connection) {
        super(connection);
    }

    @Override
    public Book[] getAll() {
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(ALL_BOOKS);
            return parseSet(resultSet);
        } catch (SQLException exp) {
            logger.error("Error statement books");
        }
        return null;
    }

    private Book[] parseSet(ResultSet resultSet) throws SQLException {
        List<Book> books = new ArrayList<>();
        while (resultSet.next()){
            Book newBook = new Book();
            newBook.setAuthor(resultSet.getString(2));
            newBook.setTitul(resultSet.getString(3));
            newBook.setPublish(resultSet.getString(4));
            newBook.setYear(resultSet.getInt(5));
            newBook.setPages(resultSet.getInt(6));
            newBook.setPrice(resultSet.getDouble(7));
            books.add(newBook);
        }
        return books.toArray(new Book[0]);
    }

    public Book[] findByString(String type, String value) {
        String currentSQL = getSelectQuery(type);
        try (PreparedStatement preparedStatement =
                     connection.prepareStatement(currentSQL)) {
            preparedStatement.setString(1, value);
            ResultSet resultSet = preparedStatement.executeQuery();
            return parseSet(resultSet);
        } catch (SQLException exp) {
            logger.error("Error preparedStatement books by author");
        }
        return null;
    }

    private String getSelectQuery(String type) {
        return ALL_BOOKS + " where " + type + " = ?";
    }

    public Book[] findByInt(String type, int value) {
        String currentSQL = getSelectQuery1(type);
        try (PreparedStatement preparedStatement = connection.prepareStatement(currentSQL)) {
            preparedStatement.setInt(1, value);
            ResultSet resultSet = preparedStatement.executeQuery();
            return parseSet(resultSet);
        } catch (SQLException exp) {
            logger.error("Error preparedStatement books by author");
        }
        return null;
    }

    private String getSelectQuery1(String type) {
        return ALL_BOOKS + " where " + type + " > ?";
    }


    @Override
    public void addBook(Book book) {

    }

    @Override
    public Book getBookById(int id) {
        return null;
    }

}
