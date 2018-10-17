import task_2.task_2_2.controller.MainController;
import task_3.task_3_2.controller.Controller;

public class Main {
    public static void main(String [] argv){
//        new FirstController(new FirstModel(),new FirstView()).execute();
//        new SecondController(new SecondModel(),new SecondView()).execute();
//        new ThirdController(new ThirdModel(),new ThirdView()).buildPirimade();
//        new FifthController(new FifthModel(),new FifthView()).execute();

        new Controller().run();
        new MainController().execute();

    }
}
