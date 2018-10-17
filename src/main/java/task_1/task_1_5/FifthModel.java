package task_1.task_1_5;

public class FifthModel {
    private int range;
    private int array[][];

    public int[][] getArray() {
        return array;
    }

    public void setArray(int[][] array) {
        this.array = array;
    }

    public FifthModel() {

    }

    public void setRange(int range){
        this.range=range;
        array = new int[range][range];
    }
    public int getRange() {
        return range;
    }


    public void fillArray(){
        for(int i=0;i<array.length;i++)
            for (int j = 0; j < array.length; j++)
                array[i][j]=(int)(Math.random()*9)+1;
    }

    public void reverseArray() {

//        int[][] array2 = new int[range][range];
        int temp;
        for (int i = 0; i < range; i++) {
            int counter = range - 1;
            for (int j = 0; j < range; j++) {
                temp = array[i][j];
                array[i][j] = array[counter][i];
                array[counter][i] = temp;
//                array2[counter][i]=array[i][j];
                counter--;
            }
        }
//        array=array2;
    }
}

