package task_1.task_1_1;

import java.util.Scanner;

public class FirstController {
    private FirstModel model;
    private FirstView view;
    private Scanner scn;

    FirstController(){}

    public FirstController(FirstModel model, FirstView view){
        this.model = model;
        this.view = view;
    }

    public void execute(){
        view.showMessage(FirstView.ENTER_TASK);

        view.showMessage(FirstView.ENTER_VAL);
        model.setVal(enterValue());

        view.showMessage(FirstView.DECIMAL_SYS+model.getVal());
        view.showMessage(FirstView.BINARY_SYS+model.toBinary());
        view.showMessage(FirstView.OCTAL_SYS+model.toOctal());
        view.showMessage(FirstView.HEXADEMICAL_SYS+model.toHex());

        view.showMessage(FirstView.BLINK);
    }

    private int enterValue(){
        scn = new Scanner(System.in);
        int val = 0;


        while(true){
            if(scn.hasNextInt()){
                val = scn.nextInt();

                if(val > 0)
                    return val;
                else {
                    view.showMessage(FirstView.ERROR_VAL);
                    scn = new Scanner(System.in);
                }

            }else{
                view.showMessage(FirstView.ERROR_VAL);
                scn = new Scanner(System.in);
            }
        }

    }

}
