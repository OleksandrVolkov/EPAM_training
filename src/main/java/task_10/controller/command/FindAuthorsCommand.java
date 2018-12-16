package task_10.controller.command;


import task_10.util.InputUtility;

public class FindAuthorsCommand extends Command {
    @Override
    public String execute() {
        return serviceBooks.searchBooksByAuthor(
                            InputUtility.inputString(view, manager));
    }
}
