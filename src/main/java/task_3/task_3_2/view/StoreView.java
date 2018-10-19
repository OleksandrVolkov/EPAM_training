package task_3.task_3_2.view;

import task_3.task_3_2.model.Store;

public class StoreView {
    final public static String INITIAL_DEPARTMENTS = "Initial departments: ";
    final public static String AFTER_DELETION = "Departments after deletion: ";
    final public static String AFTER_SORTING = "Departments after sorting: ";
    final public static String BLINK_LINE = "\n";

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
