package task_10.controller.command;


import task_10.util.InputUtility;

public class FindPublisherCommand extends Command {
    @Override
    public String execute() {
        return serviceBooks.searchBooksByPublisher(
                            InputUtility.inputString(view, manager));
    }
}
