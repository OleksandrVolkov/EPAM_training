package task_3.task_3_1.model.base;

import task_3.task_3_1.model.base.Toy;
import task_3.task_3_1.comparators.SizeComparator;

import java.util.Arrays;

public class GameRoom <T extends Toy>{
    private T[] toys;


    public T[] getToys() {
        return toys;
    }
    public void setToys(T[] toys) {
        this.toys = toys;
    }

    @Override
    public String toString() {
        String string = null;
        for(Toy toy : toys)
            string = toy + "\n";

        return string;
    }


}

