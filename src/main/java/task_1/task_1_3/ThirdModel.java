package task_1.task_1_3;

public class ThirdModel {
    private int val;

    public ThirdModel(){

    }

    ThirdModel(int val){
        this.val=val;
    }


    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public String getPirimade(String blink){

        String arr = "";
        int counter = this.val;
        int times = 1;

        for(int j=0; j<val; j++) {
            arr += (times+blink);

            for (int i=0; i<counter; i++)
                 arr += blink;

            int amount=1;
            for (int k=1; k<times*2; k++){
                if(k < times) {
                    arr += amount;
                    amount++;
                }else{
                    arr += amount;
                    amount--;
                }
            }

            arr+="\n";

            times += 1;
            counter--;
        }
        return arr;
    }
}

//StringBuilder in the loop
