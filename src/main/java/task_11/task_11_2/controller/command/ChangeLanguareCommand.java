package task_11.task_11_2.controller.command;


import task_11.task_11_2.exception.UnExistItemMenu;
import task_11.task_11_2.util.InputUtility;

public class ChangeLanguareCommand extends Command {
    @Override
    public String execute() {
        view.printMessage(manager.getMessage("LANGUARE"));
        while (true) {
            try {
                serviceBooks.changeLanguare(
                        InputUtility.inputInt(view, manager));
                break;
            } catch (UnExistItemMenu exp) {
                view.printError(exp.getMessage());
            }
        }
        return null;
    }
}
