package task_3.task_3_2.model;

import java.util.Arrays;
import java.util.Comparator;

public class Stores {
    private int counter;
    final private int INITIAL_SIZE = 16;
    private Store.Department[] departments;




    private boolean isEmpty(){
        return departments == null;
    }

    public void createNewDepartment(String name, String kindOfGoods, String place){
        if(isEmpty())
            departments = new Store.Department[INITIAL_SIZE];
        if(counter == departments.length)
            departments = new Store.Department[departments.length + (departments.length * (2/3))];

        Store store = new Store();
        departments[counter++] =store.getNewDepartment(name, kindOfGoods, place);
    }

    public void sortByName(){
        Store.Department[] temp = Arrays.copyOf(departments,counter);

        Arrays.sort(temp, new Comparator<Store.Department>() {
            @Override
            public int compare(Store.Department o1, Store.Department o2) {
                Store.Department d1 = (Store.Department)o1;
                Store.Department d2 = (Store.Department)o2;

                if(d1.getName().charAt(0) > d2.getName().charAt(0))
                    return 1;
                if(d1.getName().charAt(0) < d2.getName().charAt(0))
                    return -1;
                return 0;
            }
        });

        departments = Arrays.copyOf(temp, departments.length);
    }


    public void deleteDepartmentByName(String name){
        if(isEmpty())
            return;

        int count = 0;

        Store.Department[] temp = new Store.Department[INITIAL_SIZE];
        for(Store.Department d: departments){
            if(d == null)
                break;
            if(!d.getName().equals(name))
                temp[count++] = d;
        }

        departments = temp;
        counter = count;
    }

    public int getCounter() {
        return counter;
    }

    public int getINITIAL_SIZE() {
        return INITIAL_SIZE;
    }

    public Store.Department[] getDepartments() {
        return departments;
    }
}
