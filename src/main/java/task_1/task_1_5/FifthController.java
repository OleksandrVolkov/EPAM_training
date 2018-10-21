package task_1.task_1_5;

import java.util.Scanner;

public class FifthController {
    private FifthModel model = new FifthModel();
    private FifthView view = new FifthView();
    private Scanner scn;

    public FifthController(){

    }
    public FifthController(FifthModel model,FifthView view){
        this.model = model;
        this.view = view;
    }


    public void execute(){
        view.showMessage(FifthView.ENTER_TASK);
        view.showMessage(FifthView.ENTER_VAL);
        model.setRange(enterValue());

        model.fillArray();

        view.showMessage(FifthView.INITIAL_MATRIX);
        view.displayArray(model.getArray());
        model.changeArrayCounterClockwise();

        view.showMessage(FifthView.FINAL_MATRIX);
        view.displayArray(model.getArray());
    }


    public int enterValue(){
        scn = new Scanner(System.in);
        int val = 0;


        while(true){
            if(scn.hasNextInt()){
                val = scn.nextInt();

                if(val>0 && val<10)
                    return val;
                else {
                    view.showMessage(FifthView.ERROR_VAL);
                    scn = new Scanner(System.in);
                }

            }else{
                view.showMessage(FifthView.ERROR_VAL);
                scn = new Scanner(System.in);
            }
        }
    }
}
