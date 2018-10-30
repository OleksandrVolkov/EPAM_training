package projects.project_1.controller;

import projects.project_1.model.base.AppliancesComparator;
import projects.project_1.model.data.Appliances;
import projects.project_1.model.data.AppliancesArray;
import projects.project_1.view.View;

import java.util.Arrays;

public class Controller {
    Appliances model;
    View view;
    public Controller(){
        model = new Appliances(AppliancesArray.getData());
        view = new View();
    }

    public void run(){
        view.displayAppliances(model.getApplianceList());
        System.out.println();
        model.sortByPower();
        view.displayAppliances(model.getApplianceList());
        System.out.println();
        System.out.println(model.getTotalPower());
    }
}
