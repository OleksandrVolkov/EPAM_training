package task_3.task_3_1;

import task_3.task_3_1.model.base.Toy;
import task_3.task_3_1.comparators.SizeComparator;

import java.util.Arrays;

public class GameRoom <T extends Toy>{
    T[] toys;

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

    @Override
    public String toString() {
        String string = null;
        for(Toy toy : toys)
            string = toy + "\n";

        return string;
    }


}
