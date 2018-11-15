package projects.project_2;

import projects.project_2.controller.Controller;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args){
        try {
            new Controller().run();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
