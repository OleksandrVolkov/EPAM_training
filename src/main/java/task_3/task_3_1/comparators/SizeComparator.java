package task_3.task_3_1.comparators;

import task_3.task_3_1.model.base.Toy;

import java.util.Comparator;

public class SizeComparator implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Toy toy1 = (Toy)o1;
        Toy toy2 = (Toy)o2;
        if(toy1.getSize().getArea() < toy2.getSize().getArea())
            return 1;
        if(toy1.getSize().getArea() > toy2.getSize().getArea())
            return -1;
        return 0;
    }
}
