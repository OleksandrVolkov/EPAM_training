package task_3.task_3_2.view;

import task_3.task_3_2.model.Store;

public class StoreView implements UserInterface{

    public void showArrayOfDepartments(Store.Department departments[]){
        for(Store.Department d:departments) {
            if(d == null)
                return;
            System.out.println(d);
        }
    }

    public void printMessage(String name){
        System.out.println(name);
    }
}
