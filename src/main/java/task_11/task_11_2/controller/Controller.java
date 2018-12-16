package task_11.task_11_2.controller;

//import com.epam.task11.controller.command.Command;
//import com.epam.task11.controller.command.ItemMenu;
//import com.epam.task11.util.InputUtility;
//import com.epam.task11.util.ResourceManager;
//import com.epam.task11.view.BookView;
//import com.epam.task11.exception.UnExistItemMenu;

import task_11.task_11_2.controller.command.Command;
import task_11.task_11_2.controller.command.ItemMenu;
import task_11.task_11_2.exception.UnExistItemMenu;
import task_11.task_11_2.util.InputUtility;
import task_11.task_11_2.util.ResourceManager;
import task_11.task_11_2.view.BookView;

public class Controller {
    ResourceManager manager = ResourceManager.INSTANCE;
    private BookView view = new BookView();

    public void run() {
        while (true) {
            try {
                view.printMessage(manager.getMessage("mainMenu"));
                int number = InputUtility.inputInt(view, manager);
                Command command = defineCommand(number);
                view.printMessage(command.execute());
            } catch (UnExistItemMenu exp) {
                view.printError(exp.getMessage());
            }
        }
    }

    private Command defineCommand(int number) throws UnExistItemMenu {
        ItemMenu[] itemMenus = ItemMenu.values();
        if (number < 0 || number >= itemMenus.length) {
            throw new UnExistItemMenu(manager.getMessage("WRONG_INPUT_DATA"));
        }
        return itemMenus[number].getCommand();
    }
}
