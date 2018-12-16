package task_11.task_11_2.model.dao.daoimpl;


import task_11.task_11_2.model.dao.Dao;

import java.sql.Connection;

public abstract class AbstractDAO implements Dao {
        protected Connection connection;

    public AbstractDAO(Connection connection) {
        this.connection = connection;
    }
}
