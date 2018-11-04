package task_5.task_5_2.view;

import java.util.Scanner;

public class UserInput {
    Scanner scanner;

    public int enterIntValue(View view){
        scanner = new Scanner(System.in);
        int val = 0;

        while(true){
            if(scanner.hasNextInt()){
                val = scanner.nextInt();

                if(val>0)
                    return val;
                else {
                    view.printMessage(view.ERROR_VAL);
                    scanner = new Scanner(System.in);
                }
            }else{
                view.printMessage(view.ERROR_VAL);
                scanner = new Scanner(System.in);
            }
        }
    }

}
