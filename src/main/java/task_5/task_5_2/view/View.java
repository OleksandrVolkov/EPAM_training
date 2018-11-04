package task_5.task_5_2.view;

import java.util.Collection;

public class View implements UserInterface {
    UserInput userInput;

    public View(){
        userInput = new UserInput();
    }


    public void printMessage(String str){
        System.out.println(str);
    }

    public void printCollection(Collection <Integer>collection){
        for(Integer col: collection){
            System.out.print(col+" ");
        }
        System.out.println();
    }

    public int getIntVal(){
        return userInput.enterIntValue(this);
    }
}
