package task_2;


import java.util.Scanner;

public class SecondController{
    Scanner scn;
    SecondModel model;
    SecondView view;

    public SecondController(SecondModel model, SecondView view){
        this.model=model;
        this.view=view;
    }
    public SecondController(){}

    public void execute(){
        view.showMessage(SecondView.ENTER_TASK);
        view.showMessage(SecondView.ENTER_VAL);

        model.setVal(enterValue());

        view.showMessage(SecondView.PERFECT_VALS);

        model.getPerfectNumbers(model.getVal());
        view.showMessage(SecondView.BLINK);
    }



    public int enterValue(){
        scn=new Scanner(System.in);
        int val=0;

            while(true){
                if(scn.hasNextInt()){
                    val=scn.nextInt();

                    if(val>0)
                        return val;
                    else {
                        view.showMessage(SecondView.ERROR_VAL);
                        scn=new Scanner(System.in);
                    }

                }else{
                    view.showMessage(SecondView.ERROR_VAL);
                    scn=new Scanner(System.in);
                }
            }

    }
}
