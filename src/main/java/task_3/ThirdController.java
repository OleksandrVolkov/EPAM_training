package task_3;

import java.util.Scanner;

public class ThirdController {
    Scanner scn;
    ThirdModel model;
    ThirdView view;

    public ThirdController(ThirdModel model, ThirdView view){
        this.model=model;
        this.view=view;
    }


    public void buildPirimade(){
        view.showMessage(ThirdView.ENTER_TASK);
        view.showMessage(ThirdView.ENTER_VAL);

        model.setVal(enterValue());

        model.printPirimade(ThirdView.BLINK);
        view.showMessage(ThirdView.BLINK);

    }



    public int enterValue(){
        scn=new Scanner(System.in);
        int val=0;


        while(true){
            if(scn.hasNextInt()){
                val=scn.nextInt();

                if(val>0&&val<10)
                    return val;
                else {
                    view.showMessage(ThirdView.ERROR_VAL);
                    scn=new Scanner(System.in);
                }

            }else{
                view.showMessage(ThirdView.ERROR_VAL);
                scn=new Scanner(System.in);
            }
        }

    }


}







