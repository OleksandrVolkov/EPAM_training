package task_10.controller.command;


import task_10.exception.UnExistItemMenu;
import task_10.util.InputUtility;

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
