package task_10.exception;

public class UnExistItemMenu extends RuntimeException {
    public UnExistItemMenu(String message) {
        super(message);
    }
}
