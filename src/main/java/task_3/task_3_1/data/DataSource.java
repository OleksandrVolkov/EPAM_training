package task_3.task_3_1.data;

import task_3.task_3_1.model.base.Size;
import task_3.task_3_1.model.base.Toy;
import task_3.task_3_1.model.entities.*;

public class DataSource {
    public static Toy[] getToys(){
        return new Toy[]{
            new Castle("Blue", new Size(142,234),1000),
            new Car("Red", new Size(30,15),1500),
            new Constructor("White", new Size(100,56),2000),
            new Doll("Black", new Size(20,4),500),
            new Ball("Purple",new Size(30,30),1000),
            new Car("Yellow", new Size(30,14),900)
        };
    }
}
