package task_3.task_3_1.model.entities;

import task_3.task_3_1.model.base.Size;
import task_3.task_3_1.model.base.Toy;

public class Car extends Toy {

    public Car(String color, Size size, double price) {
        super(color, size, price);
    }

    public Car() {
    }

    @Override
    public String toString() {
        return "Car: " + super.toString();
    }
}
