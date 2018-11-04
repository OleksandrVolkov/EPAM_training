package projects.project_1.model.data;

import projects.project_1.model.base.Appliance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import projects.project_1.model.base.Size;
import projects.project_1.model.entity.*;

public class AppliancesArray {

    public static List<Appliance> getData(){
        return new ArrayList<Appliance>(
                            Arrays.asList(
                                  new AirConditioning(100, new Size(100, 50), "Samsung"),
                                  new Fridge(290, new Size(100, 350), "Samsung"),
                                  new Toster(250, new Size(40, 20), "LG"),
                                  new HairDryer(300, new Size(30, 10), "LG"),
                                  new TV(210, new Size(50, 100), "LG"),
                                  new Washer(211, new Size(105, 95), "LG")
                            ));
    }

    public static Appliance getSampleAppliance(){
        return new Washer(200, new Size(200,100), "Toshiba");
    }

}
