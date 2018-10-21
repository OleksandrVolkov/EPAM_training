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

    public void setRange(int range) {
        this.range = range;
        array = new int[range][range];
    }

    public int getRange() {
        return range;
    }


    public void fillArray() {
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array.length; j++)
                array[i][j] = (int) (Math.random() * 9) + 1;
    }

    public void changeArrayCounterClockwise() {
        int tmp = 0;

        for (int i = 0; i < array.length / 2; i++)
            for (int j = i; j < array.length - 1 - i; j++) {
                tmp = array[i][j];
                array[i][j] = array[j][range-1-i];
                array[j][range-1-i] = array[range-1-i][range-1-j];
                array[range-1-i][range-1-j] = array[range-1-j][i];
                array[range-1-j][i] = tmp;
            }
    }

}

