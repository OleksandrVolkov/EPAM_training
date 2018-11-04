package projects.project_1.service;

import projects.project_1.model.base.Appliance;
import projects.project_1.model.base.Appliances;

public class Service {
    private Appliances appliances;

    public Service(Appliances appliances){
        this.appliances = appliances;
    }

    public void plugAppliancesByIndex(int... index){
        for(int ind: index){
            appliances.getApplianceList().get(ind).setPlugged(true);
        }
    }

    public void addAppliance(Appliance appliance){
        appliances.addAppliance(appliance);
    }
}
