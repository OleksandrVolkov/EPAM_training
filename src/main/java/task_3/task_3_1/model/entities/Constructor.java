package task_3.task_3_1.model.entities;

import task_3.task_3_1.model.base.Size;
import task_3.task_3_1.model.base.Toy;

public class Constructor extends Toy {
    public Constructor(String color, Size size, double price) {
        super(color, size, price);
    }

    public Constructor() {
    }

    @Override
    public String toString() {
        return "Constructor: " + super.toString();
    }
}
