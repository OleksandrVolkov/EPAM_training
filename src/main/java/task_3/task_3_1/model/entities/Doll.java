package task_3.task_3_1.model.entities;

import task_3.task_3_1.model.base.Size;
import task_3.task_3_1.model.base.Toy;

public class Doll extends Toy {

    public Doll(String color, Size size, double price) {
        super(color, size, price);
    }

    public Doll() {
    }

    @Override
    public String toString() {
        return "Doll: " + super.toString();
    }
}
