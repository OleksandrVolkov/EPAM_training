package projects.project_1.view;

import projects.project_1.model.base.Appliance;

import java.util.List;

public class View implements UserInterface{

    public void displayAppliances(List<Appliance> applianceList){
        for(Appliance app: applianceList){
            System.out.println(app);
        }
        System.out.println();
    }

    public void displayMessage(String mes){
        System.out.println(mes);
    }
}
