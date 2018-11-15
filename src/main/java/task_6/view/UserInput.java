package task_6.view;

import task_2.task_2_1.view.BooksView;

import java.util.Scanner;

public class UserInput {
    private Scanner scn;

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
                    view.printMessage(view.ERROR_VAL);
                    scn = new Scanner(System.in);
                }
            }else{
                view.printMessage(view.ERROR_VAL);
                scn = new Scanner(System.in);
            }
        }
    }
}
