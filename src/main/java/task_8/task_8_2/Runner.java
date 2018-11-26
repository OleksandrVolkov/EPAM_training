package task_8.task_8_2;

public class Runner {
    public static int value = 0;
    public static boolean flag = false;

    public void run(){
        new Thread(() -> {
            synchronized (this) {
                for (int i = 0; i < 1_000; i++) {
                    Runner.value++;
                    while(Runner.flag) {
                        try {
                            wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    Runner.value++;
                    Runner.flag = true;
                    notify();
                }
            }
        }).start();


        new Thread(() -> {
            synchronized (this) {
                for (int i = 0; i < 1_000; i++) {
                    while(!Runner.flag){
                        try{
                            wait();
                        } catch(InterruptedException ex){
                            ex.printStackTrace();
                        }
                    }
                    System.out.println(Runner.value);
                    Runner.flag = false;
                    notify();
                }
            }
        }).start();
    }
}
