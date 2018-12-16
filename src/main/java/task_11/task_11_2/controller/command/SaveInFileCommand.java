package task_11.task_11_2.controller.command;

public class SaveInFileCommand extends Command {
    @Override
    public String execute() {
        serviceBooks.saveBooks();
        return null;
    }
}
