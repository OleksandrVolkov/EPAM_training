package task_11.task_11_2.model.dao;


import task_11.task_11_2.model.entity.Book;

public interface Dao {
    Book[] getAll();
    void addBook(Book book);
    Book getBookById(int id);
}
