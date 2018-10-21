package task_3.task_3_1.model.entities;

import task_3.task_3_1.model.base.Size;
import task_3.task_3_1.model.base.Toy;

public class Ball extends Toy {

    public Ball(String color, Size size, double price) {
        super(color, size, price);
    }

    public Ball() {
    }

    @Override
    public String toString() {
        return "Ball: " + super.toString();
    }
}
