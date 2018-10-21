package task_3.task_3_1.services;

import task_3.task_3_1.model.base.GameRoom;
import task_3.task_3_1.comparators.SizeComparator;
import task_3.task_3_1.model.base.Toy;

import java.util.Arrays;

public class GameRoomService<T extends Toy> {
    private T[] toys;
    GameRoom<Toy> model;

    public GameRoomService(GameRoom<Toy> model, T[] toys){
        this.model = model;
        this.toys = toys;
    }

    public void sortToysBySize(){
        Arrays.sort(toys, new SizeComparator());
    }

    public void calcTotalAmountOfToys(){

    }

    public int[] getIndexesRangeOfPrice(double p1, double p2){
        int[] arr = new int[toys.length];

        int counter1 = 0;
        int counter2 = 0;

        for(T toy: toys){
            if(toy.getPrice()>p1 && toy.getPrice()<p2){
                arr[counter1] = counter2;
                counter1++;
            }
            counter2++;
        }

        return Arrays.copyOf(arr, counter1);
    }


    public double getTotalPrice(){
        double sum = 0.0;
        for(T arr: toys){
            sum+=arr.getPrice();
        }
        return sum;
    }



    public T[] getToys() {
        return toys;
    }

    public void setToys(T[] toys) {
        this.toys = toys;
    }

    public GameRoom<Toy> getModel() {
        return model;
    }

    public void setModel(GameRoom<Toy> model) {
        this.model = model;
    }
}
