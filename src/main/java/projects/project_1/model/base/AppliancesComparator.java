package projects.project_1.model.base;

import java.util.Comparator;

public class AppliancesComparator implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Appliance a = (Appliance)o1;
        Appliance b = (Appliance)o2;
        if(a.getPowerConsumed() < b.getPowerConsumed())
            return -1;
        if(a.getPowerConsumed() > b.getPowerConsumed())
            return 1;
        return 0;
    }
}
