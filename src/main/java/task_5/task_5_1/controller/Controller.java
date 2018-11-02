package task_5.task_5_1.controller;

import task_5.task_5_1.model.Magazine;
import task_5.task_5_1.model.Record;
import task_5.task_5_1.services.MagazineService;
import task_5.task_5_1.view.*;

public class Controller {
    private static Magazine model = new Magazine();
    private static View view = new View();
    private static MagazineService service;

    public Controller(){
        service = new MagazineService(model);
    }

    public void run(){
        boolean flag = true;

        while (flag) {
            view.printMessage(View.DISPLAY_MENU);
            switch (view.enterInt()) {
                case 1:
                    service.addRecord(addNewRecord());
                    break;
                case 2:
                    service.deleteRecordByName(view.enterName());
                    break;
                case 3:
                    view.displayMagazine(model.getRecords());
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    view.printMessage(View.ERROR_VAL);
                    break;
            }

        }

    }


    public static Record addNewRecord(){
        return new Record(view.enterName(), view.enterSurname(),
                view.enterDateOfBirth(), view.enterPhoneNumber(), view.enterAddress());
    }

}
