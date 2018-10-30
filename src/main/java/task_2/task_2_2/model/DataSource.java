package task_2.task_2_2.model;

import task_2.task_2_2.model.base.Shape;
import task_2.task_2_2.model.entities.*;


public class DataSource {
    public static Shape[] getShapes(){
//        return new Shape[]{
//                new Triangle("Blue",5,4,2),
//                new Circle("Red",2),
//                new Rectangle("Violet",3,9),
//                new Circle("Yellow",5),
//                new Triangle("Green",9,5,7),
//                new Rectangle("Black",8,9),
//                new Rectangle("Pink",7,9),
//                new Triangle("White",3,5,6),
//                new Circle("Silver",8),
//                new Rectangle("Orange",4,5)
//        };
        return  new Shape[]{
                new Triangle("Blue", 2, 3, 4),
                new Circle("Red", 5),
                new Rectangle("Violet", 2, 6),
                new Circle("Yellow", 2),
                new Triangle("Green", 4, 6, 2),
                new Rectangle("Black", 4, 1),
                new Rectangle("Pink", 12, 9),
                new Triangle("White", 4, 6, 4),
                new Circle("Silver", 5),
                new Rectangle("Orange", 7, 6)
        };
    }
}
