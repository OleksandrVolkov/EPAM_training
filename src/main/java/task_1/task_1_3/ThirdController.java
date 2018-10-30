package task_1.task_1_3;

import java.util.Scanner;

public class ThirdController {
    private Scanner scn;
    private ThirdModel model;
    private ThirdView view;

    public ThirdController(ThirdModel model, ThirdView view){
        this.model = model;
        this.view = view;
    }

    public void buildPirimade(){

        view.showMessage(ThirdView.ENTER_TASK);
        view.showMessage(ThirdView.ENTER_VAL);

        model.setVal(enterValue());

        System.out.println(model.getPirimade(ThirdView.BLINK));
        view.showMessage(ThirdView.BLINK);

    }


    private int enterValue(){
        scn = new Scanner(System.in);
        int val = 0;

        while(true){
            if(scn.hasNextInt()){
                val = scn.nextInt();

                if(val>0 && val<10)
                    return val;
                else {
                    view.showMessage(ThirdView.ERROR_VAL);
                    scn = new Scanner(System.in);
                }

            }else{
                view.showMessage(ThirdView.ERROR_VAL);
                scn = new Scanner(System.in);
            }
        }
    }

}







