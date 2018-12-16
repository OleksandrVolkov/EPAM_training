package task_10.controller.command;

public class ExitCommand extends Command {
    @Override
    public String execute() {
        serviceBooks.saveBooks();
        System.exit(0);
        return null;
    }
}
