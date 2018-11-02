package task_5.task_5_3.view;

import task_2.task_2_2.view.ShapesView;

import java.util.Scanner;

public class UserInput{
    Scanner scn;

    public UserInput(){}

    public String enterStringValue(View view){
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

    public int enterIntValue(View view){
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

}
