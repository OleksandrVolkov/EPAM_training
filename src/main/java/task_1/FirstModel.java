package task_1;

public class FirstModel {
    private int val;

    public FirstModel(){

    }
    FirstModel(int val){
        this.val=val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public String toBinary(){
        int remainder=0;
        String bin="";
        int temp=val;
        while(true){
            if(temp==0)
                return reverseString(bin);
            remainder=temp%2;
            temp=temp/2;
            bin+=remainder;


        }
    }

    public String toOctal(){
        int remainder=0;
        String bin="";
        int temp=val;
        while(true){
            if(temp==0)
                return reverseString(bin);
            remainder=temp%8;
            temp=temp/8;
            bin+=remainder;

        }
    }

    public String toHex(){
        int remainder=0;
        String bin="";
        int temp=val;
        while(true){
            if(temp==0)
                return reverseString(bin);
            remainder=temp%16;

            temp=temp/16;


            if(remainder>9){
                char letter='0';
                switch(remainder){
                    case 10:
                        letter='a';
                        break;
                    case 11:
                        letter='b';
                        break;
                    case 12:
                        letter='c';
                        break;
                    case 13:
                        letter='d';
                        break;
                    case 14:
                        letter='e';
                        break;
                    case 15:
                        letter='f';
                        break;

                }
                bin+=letter;
                continue;
            }

            bin+=remainder;

        }
    }


    private String reverseString(String str){
        char[]arr=str.toCharArray();
        char[]arr2=new char[arr.length];

        for(int i=0,j=arr.length-1;i<arr.length;i++,j--)
            arr2[i]=arr[j];

        return String.valueOf(arr2);
    }
}
