package task_2;

public class SecondModel {
    private int val;

    public SecondModel(){}

    SecondModel(int val){
        this.val=val;
    }


    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public void getPerfectNumbers(int range){

        for(int k=1;k<range;k++) {
            int sum = 0;

            for (int i = 1; i < k; i++)
                if (k % i == 0)
                    sum += i;

            if (sum == k)
                System.out.println(sum);
        }
    }

}
