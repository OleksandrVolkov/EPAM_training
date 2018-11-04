package projects.project_1.controller;

import projects.project_1.model.base.Appliances;
import projects.project_1.model.data.AppliancesArray;
import projects.project_1.service.Service;
import projects.project_1.view.View;

public class Controller {
    private Appliances model;
    private View view;
    private Service service;
    public Controller(){
        model = new Appliances(AppliancesArray.getData());
        view = new View();
    }

    public void run(){
        view.displayMessage(View.INITIAL_MES);
        service = new Service(new Appliances(model.getApplianceList()));
        service.plugAppliancesByIndex(0,2,4);
        service.addAppliance(AppliancesArray.getSampleAppliance());
        view.displayAppliances(model.getApplianceList());

        model.sortByPower();
        view.displayMessage(View.AFTER_SORTING);
        view.displayAppliances(model.getApplianceList());
        view.displayMessage(View.TOTAL_POWER + model.getTotalPower());
    }
}
