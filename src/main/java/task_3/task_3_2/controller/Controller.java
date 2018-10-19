package task_3.task_3_2.controller;

import task_3.task_3_2.model.Store;
import task_3.task_3_2.view.StoreView;

public class Controller {
    private StoreView view = new StoreView();
    private Store model = new Store();

    public void run(){
        Store.Department department = model.createDepartment();

        model.createNewDepartment("House","House goods","Kyiv");

        model.createNewDepartment("Car model","Cars selling","Lviv");
        model.createNewDepartment("Papirus","Stationery","Kharkiv");

        view.printMessage(StoreView.INITIAL_DEPARTMENTS);
        view.showArrayOfDepartments(model.getDepartments());

        model.deleteDepartmentByName("House");

        view.printMessage(StoreView.BLINK_LINE + StoreView.AFTER_DELETION);
        view.showArrayOfDepartments(model.getDepartments());

        model.createNewDepartment("Citrus","Electricity model","Donetsk");
        model.sortByName();

        view.printMessage(StoreView.BLINK_LINE + StoreView.AFTER_SORTING);
        view.showArrayOfDepartments(model.getDepartments());
    }

}
