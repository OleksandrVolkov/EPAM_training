package task_2.task_2_2.model;

import task_2.task_2_2.model.base.Shape;
import task_2.task_2_2.model.entities.*;


public class DataSource {
    public static Shape[] getShapes(){
        return new Shape[]{
                new Triangle("Blue",5,4,2),
                new Circle("Red",2),
                new Rectangle("Violet",3,9),
                new Circle("Yellow",5),
                new Triangle("Green",9,5,7),
                new Rectangle("Black",8,9),
                new Rectangle("Pink",7,9),
                new Triangle("White",3,5,6),
                new Circle("Silver",8),
                new Rectangle("Orange",4,5)
        };
    }
}
