package task_3.task_3_1.comparators;

import task_3.task_3_1.model.base.Toy;

import java.util.Comparator;

public class ColorComparator implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Toy toy1 = (Toy)o1;
        Toy toy2 = (Toy)o2;
        if(toy1.getColor().charAt(0) < toy2.getColor().charAt(0))
            return 1;
        if(toy1.getColor().charAt(0) > toy2.getColor().charAt(0))
            return -1;
        return 0;
    }
}
