package task_11.task_11_2.controller.command;


import task_11.task_11_2.util.InputUtility;

public class FindAuthorsCommand extends Command {
    @Override
    public String execute() {
        return serviceBooks.searchBooksByAuthor("author",
                            InputUtility.inputString(view, manager));
    }
}
