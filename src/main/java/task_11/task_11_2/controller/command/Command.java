package task_11.task_11_2.controller.command;



import task_11.task_11_2.service.ServiceBooks;
import task_11.task_11_2.util.ResourceManager;
import task_11.task_11_2.view.BookView;

import java.sql.SQLException;

abstract public class Command {
    protected ServiceBooks serviceBooks;
    protected BookView view = new BookView();
    protected ResourceManager manager = ResourceManager.INSTANCE;

    protected Command() {
        serviceBooks = new ServiceBooks();
    }
    public abstract String execute();
}
