package task_3.task_3_1.view;

import task_3.task_3_1.model.base.GameRoom;
import task_3.task_3_1.model.base.Toy;

public class ToyView <T extends Toy> implements UserInput{

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
        for(T toy : toys)
            System.out.println(toy);
    }

    public void showByIndexes(int[] indexes, GameRoom<T> gameRoom){
        for(int i: indexes)
            showToy(gameRoom.getToys()[i]);
    }
}
