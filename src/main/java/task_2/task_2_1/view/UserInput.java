package task_2.task_2_1.view;

import task_2.task_2_1.model.Options;

import java.util.Scanner;

public class UserInput {
    private Scanner scn;

    public UserInput(){}


    public int enterIntValue(BooksView view){
        scn = new Scanner(System.in);
        int val = 0;

        while(true){
            if(scn.hasNextInt()){
                val = scn.nextInt();

                if(val>0)
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


    public String enterStringValue(BooksView view){
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

    public Options enterOptionValue(BooksView view){
        scn = new Scanner(System.in);
        int val = 0;

        Options[] options = Options.values();
        while(true){
            if(scn.hasNextInt()){
                val = scn.nextInt();

                if(val>0 && val<6)
                    return options[val-1];
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
