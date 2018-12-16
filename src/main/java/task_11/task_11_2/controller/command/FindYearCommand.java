package task_11.task_11_2.controller.command;


import task_11.task_11_2.util.InputUtility;

public class FindYearCommand extends Command {
    @Override
    public String execute() {
        return serviceBooks.searchBooksAfterYear("year",
                            InputUtility.inputYear(view, manager));
    }
}
