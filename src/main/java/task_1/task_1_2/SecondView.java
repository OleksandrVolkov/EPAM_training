package task_1.task_1_2;



public class SecondView {
    final static String ENTER_TASK = "Perfect numbers on the entered range ";
    final static String ENTER_VAL = "Please, enter a positive integer: ";
    final static String PERFECT_VALS = "Perfect numbers: ";
    final static String ERROR_VAL = "Error, enter a valid value ";
    final static String BLINK = " ";

    public SecondView(){}

    public  void showMessage(String mes){
        System.out.println(mes);
    }

    public void showArray(int[]arr){
        for(int i:arr)
            System.out.println(i);
    }
}
