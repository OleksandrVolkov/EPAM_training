package task_11.task_11_2.controller.command;

public class ExitCommand extends Command {
    @Override
    public String execute() {
        System.exit(0);
        return null;
    }
}
