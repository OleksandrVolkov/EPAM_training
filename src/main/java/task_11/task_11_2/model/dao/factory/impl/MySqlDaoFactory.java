package task_11.task_11_2.model.dao.factory.impl;


import task_11.task_11_2.model.dao.daoimpl.BookDAO;
import task_11.task_11_2.model.dao.factory.DaoFactory;

import java.sql.Connection;

public class MySqlDaoFactory extends DaoFactory {
    @Override
    public BookDAO createBookDao(Connection connection) {
        return new BookDAO(connection);
    }
}
