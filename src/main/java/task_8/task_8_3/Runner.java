package task_8.task_8_3;


import java.util.HashMap;
import java.util.Map;

public class Runner {
    Map<Integer, Integer> map;
    final int COUNT = 1000;
    public void run(){
     testHashMap();
     testConcurrentHashMap();
    }


    private void testHashMap(){
        map = new HashMap<>();
        Thread[] threadsWrite = new Thread[COUNT];
        Thread[] threadsRead = new Thread[COUNT];
        for(int i=0; i < COUNT; i++){
            int j = i;
            threadsWrite[i] = new Thread( () -> {
                synchronized (this.map){
                    map.put(j, j);
                }
            });
            threadsRead[i] = new Thread( () -> {
                synchronized (this.map){
                //System.out.println(map.get(j));
                }
            });
        }


        long start = System.nanoTime();
        for(int i = 0; i < COUNT; i++){
            threadsWrite[i].start();
            threadsRead[i].start();
        }
        for(int i = 0; i < COUNT; i++){
            try {
                threadsWrite[i].join();
                threadsRead[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        long end = System.nanoTime();
        System.out.println("\n Time = "
                + (end - start) / 1_000_000_000.0);
    }



    private void testConcurrentHashMap(){
        map = new HashMap<>();
        Thread[] threadsWrite = new Thread[COUNT];
        Thread[] threadsRead = new Thread[COUNT];
        for(int i=0; i < COUNT; i++){
            int j = i;
            threadsWrite[i] = new Thread( () -> {
                    map.put(j, j);
            });
            threadsRead[i] = new Thread( () -> {
            //System.out.println(map.get(j));
            });
        }


        long start = System.nanoTime();
        for(int i = 0; i < COUNT; i++){
            threadsWrite[i].start();
            threadsRead[i].start();
        }
        for(int i = 0; i < COUNT; i++){
            try {
                threadsWrite[i].join();
                threadsRead[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        long end = System.nanoTime();
        System.out.println("\n Time = "
                + (end - start) / 1_000_000_000.0);
    }

}

