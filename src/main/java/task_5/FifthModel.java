package task_5;

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
    }
    public int getRange() {
        return range;
    }

    public void setArraySize(int val) {
        setRange(val);
        array = new int[range][range];
    }


    public void fillArray(){
        for(int i=0;i<array.length;i++)
            for (int j = 0; j < array.length; j++)
                array[i][j]=(int)(Math.random()*9)+1;
    }

    public void reverseArray() {
        int[][] array2 = new int[range][range];
        for (int i = 0; i < range; i++) {
            int counter = range - 1;
            for (int j = 0; j < range; j++) {
                array2[counter][i]=array[i][j];
                counter--;
            }
        }
        array=array2;
    }
}

