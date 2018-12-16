package task_11.task_11_2.model.dao.factory;


import task_11.task_11_2.model.dao.daoimpl.BookDAO;
import task_11.task_11_2.model.dao.factory.impl.MySqlDaoFactory;

import java.sql.Connection;

public abstract class DaoFactory {
        private static volatile DaoFactory daoFactory;

    public abstract BookDAO createBookDao(Connection connection);

    /**
     * @return DaoFactory
     */
    public static DaoFactory getInstance() {
        if( daoFactory == null ){
            synchronized (DaoFactory.class){
                if(daoFactory == null){
                    DaoFactory temp = new MySqlDaoFactory();
                    daoFactory = temp;
                }
            }
        }
        return daoFactory;
    }
}