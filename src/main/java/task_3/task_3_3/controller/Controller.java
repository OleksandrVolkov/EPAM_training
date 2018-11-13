package task_3.task_3_3.controller;
import task_3.task_3_3.model.Season;
import task_3.task_3_3.view.View;
import java.util.Arrays;

public class Controller {
    private View view = new View();
    private Season season;

    public void run(){
        view.printMessage(View.DISPLAY_VALUE_OF);
        view.printMessage(Season.valueOf("WINTER").toString());
        season = Season.AUTUMN;
        view.printMessage(View.DISPLAY_SEASON_INSTANCE);
        view.printMessage(season.toString());
        view.printMessage(View.DISPLAY_VALUES);
        view.printMessage(Arrays.toString(Season.values()));
    }
}
