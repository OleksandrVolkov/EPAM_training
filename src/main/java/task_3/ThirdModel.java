package task_3;

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

    public void printPirimade(String blink){

        int counter=this.val;
        int times=1;

        for(int j=0;j<val;j++) {
            System.out.print(times+blink);

            for (int i = 0; i < counter; i++)
                System.out.print(blink);


            int amount=1;
            for (int k = 1; k < times*2; k++){
                if(k<times) {
                    System.out.print(amount);
                    amount++;
                }else{
                    System.out.print(amount);
                    amount--;
                }
            }

            System.out.println();

            times += 1;
            counter--;
        }
    }
}
