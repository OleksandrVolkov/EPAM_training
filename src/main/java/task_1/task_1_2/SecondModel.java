package task_1.task_1_2;

import java.util.Arrays;

public class SecondModel {
    private int val;

    public SecondModel(){}

    SecondModel(int val){
        this.val = val;
    }


    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public int[] getPerfectNumbers(int range){

        int[]array = new int[range];
        int counter = 0;
        for(int k=1; k<range; k++) {
            int sum = 0;

            for (int i = 1; i < k; i++)
                if (k % i == 0)
                    sum += i;

            if (sum == k) {
                array[counter] = sum;
                counter++;
            }

        }

        return Arrays.copyOf(array,counter );
    }

    //isPerfectNumber - отдельный метод
    //проходить половину значений а не все
    //Лучше не делать цикл в цикле - а создать отдельный методы с возвращаемым значением - bool


}
