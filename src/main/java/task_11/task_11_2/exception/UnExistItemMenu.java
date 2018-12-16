package task_11.task_11_2.exception;

public class UnExistItemMenu extends RuntimeException {
    public UnExistItemMenu(String message) {
        super(message);
    }
}
