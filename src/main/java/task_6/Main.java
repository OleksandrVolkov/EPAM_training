package task_6;

import task_6.controller.Controller;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

public class Main {
    public static void main(String []args){
        try {
            new Controller().run();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
