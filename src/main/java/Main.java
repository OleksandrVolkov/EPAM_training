import task_1.*;
import task_2.SecondController;
import task_2.SecondModel;
import task_2.SecondView;
import task_3.ThirdController;
import task_3.ThirdModel;
import task_3.ThirdView;
import task_5.FifthController;
import task_5.FifthModel;
import task_5.FifthView;

public class Main {
    public static void main(String [] argv){
        new FirstController(new FirstModel(),new FirstView()).execute();
        new SecondController(new SecondModel(),new SecondView()).execute();
        new ThirdController(new ThirdModel(),new ThirdView()).buildPirimade();
        new FifthController(new FifthModel(),new FifthView()).execute();
    }
}
