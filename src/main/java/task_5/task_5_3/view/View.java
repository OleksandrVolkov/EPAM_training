package task_5.task_5_3.view;

public class View implements UserInterface{
    UserInput userInput = new UserInput();

    public String enterString(){
        return userInput.enterStringValue(this);
    }

    public int enterInt(){
        return userInput.enterIntValue(this);
    }
    public void showMessage(String str){
        System.out.println(str);
    }

    public void showLexem(String str){
        System.out.print(str);
    }


}
