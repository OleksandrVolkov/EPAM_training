package task_2.task_2_2.view;

import task_2.task_2_2.model.Shapes;

import java.util.Scanner;

public class UserInput {
    private Scanner scn;

    public UserInput(){}


    public int enterIntValue(ShapesView view){
        scn = new Scanner(System.in);
        int val = 0;

        while(true){
            if(scn.hasNextInt()){
                val = scn.nextInt();

                if(val>0)
                    return val;
                else {
                    view.showMessage(view.ERROR_VAL);
                    scn = new Scanner(System.in);
                }
            }else{
                view.showMessage(view.ERROR_VAL);
                scn = new Scanner(System.in);
            }
        }
    }


    public String enterStringValue(ShapesView view){
        scn = new Scanner(System.in);
        String val = "";

        while(true){
            if(scn.hasNextLine()){
                val = scn.nextLine();

                if(!val.equals("") || !val.equals(" "))
                    return val;
                else {
                    view.showMessage(view.ERROR_VAL);
                    scn = new Scanner(System.in);
                }
            }else{
                view.showMessage(view.ERROR_VAL);
                scn = new Scanner(System.in);
            }
        }
    }
}
