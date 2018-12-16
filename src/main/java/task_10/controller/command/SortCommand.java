package task_10.controller.command;

public class SortCommand extends Command {
    @Override
    public String execute() {
        view.printMessage(manager.getMessage("SORTED_BOOKS"));
        return  serviceBooks.sortByPublisher();
    }
}
