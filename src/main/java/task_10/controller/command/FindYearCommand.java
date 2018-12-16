package task_10.controller.command;


import task_10.util.InputUtility;

public class FindYearCommand extends Command {
    @Override
    public String execute() {
        return serviceBooks.searchBooksAfterYear(
                            InputUtility.inputInt(view, manager));
    }
}
