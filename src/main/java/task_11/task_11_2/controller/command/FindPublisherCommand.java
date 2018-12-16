package task_11.task_11_2.controller.command;


import task_11.task_11_2.util.InputUtility;

public class FindPublisherCommand extends Command {
    @Override
    public String execute() {
        return serviceBooks.searchBooksByPublisher("publisher",
                            InputUtility.inputString(view, manager));
    }
}
