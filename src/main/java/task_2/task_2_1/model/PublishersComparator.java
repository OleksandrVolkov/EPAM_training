package task_2.task_2_1.model;

import task_2.task_2_1.model.entity.Book;

import java.util.Comparator;

public class PublishersComparator implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Book book1 = (Book)o1;
        Book book2 = (Book)o2;

        if(book1.getPublisher().charAt(0) > book2.getPublisher().charAt(0))
            return 1;
        if(book1.getPublisher().charAt(0) < book2.getPublisher().charAt(0))
            return -1;
        return 0;
    }
}
