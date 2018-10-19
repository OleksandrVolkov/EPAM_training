package task_3.task_3_1.view;

import task_3.task_3_1.model.base.Toy;

public class ToyView <T extends Toy>{
    final public static String TOTAL_PRICE = "Total price of all toys: ";
    final public static String SORTING_BY_AREA = "Sorting by area of the toy";
    final public static String INITIAL_GAMEROOM = "Initial game room: ";
    final public static String PREDEFINED_RANGE= "Toys that are in the predefined range: ";
    final public static String BLINK_LINE = "\n";

    public void showArrayOfToys(T[] toys){
        for(T toy:toys){
            System.out.println(toy);
        }
    }

    public void showToy(T toy){
        System.out.println(toy);
    }

    public void printMessage(String str){
        System.out.println(str);
    }

    public void showToys(T [] toys){
        for(T toy : toys){
            System.out.println(toy);
        }
    }
}
