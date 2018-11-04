package projects.project_1.model.base;

import projects.project_1.model.base.Appliance;
import projects.project_1.model.base.AppliancesComparator;
import projects.project_1.model.base.Size;
import projects.project_1.model.entity.Toster;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Appliances {
    private List<Appliance> applianceList;

    public Appliances(List<Appliance> applianceList){
        this.applianceList = applianceList;
    }


    public List<Appliance> getApplianceList() {
        return applianceList;
    }

    public void setApplianceList(List<Appliance> applianceList) {
        this.applianceList = applianceList;
    }

    public void addAppliance(Appliance a){
        applianceList.add(a);
    }

    public void deleteAppliance(Appliance a){
        applianceList.remove(a);
    }

    public void deleteApplianceByMark(String mark){
        for(int i=0; i<applianceList.size(); i++)
            if(applianceList.get(i).equals(mark))
                applianceList.remove(i);
    }

    public void sortByPower(){
        Collections.sort(applianceList, new Comparator<Appliance>() {
            @Override
            public int compare(Appliance o1, Appliance o2) {
                Appliance a = (Appliance)o1;
                Appliance b = (Appliance)o2;
                if(a.getPowerConsumed() < b.getPowerConsumed())
                    return -1;
                if(a.getPowerConsumed() > b.getPowerConsumed())
                    return 1;
                return 0;
            }
        });
    }

    public int getTotalPower(){
        int sum = 0;
        for(Appliance a: applianceList)
            sum += a.getPowerConsumed();
        return sum;

    }
//    public Appliance getByParameters(int powerConsumed, int width, int height, String mark){
//        //Appliance a= new Appliance(powerConsumed, width, height, mark);
//        for(Appliance b: applianceList){
//
//
//        }
//    }

}
