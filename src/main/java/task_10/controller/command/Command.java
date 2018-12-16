package task_10.controller.command;


import task_10.service.ServiceBooks;
import task_10.util.ResourceManager;
import task_10.view.BookView;

abstract public class Command {
    protected ServiceBooks serviceBooks = new ServiceBooks();
    protected BookView view = new BookView();
    protected ResourceManager manager = ResourceManager.INSTANCE;
    public abstract String execute();
}
