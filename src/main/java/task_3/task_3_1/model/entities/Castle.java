package task_3.task_3_1.model.entities;

import task_3.task_3_1.model.base.Size;
import task_3.task_3_1.model.base.Toy;

public class Castle extends Toy {

    public Castle(String color, Size size, double price) {
        super(color, size, price);
    }

    public Castle() {
    }

    @Override
    public String toString() {
        return "Castle: " + super.toString();
    }
}
