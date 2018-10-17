package task_2.task_2_2.controller;

import task_2.task_2_2.model.DataSource;
import task_2.task_2_2.model.Shapes;
import task_2.task_2_2.model.base.Shape;
import task_2.task_2_2.model.base.ShapesAreaComparator;
import task_2.task_2_2.model.base.ShapesColorComparator;
import task_2.task_2_2.model.entities.Circle;
import task_2.task_2_2.model.entities.Rectangle;
import task_2.task_2_2.model.entities.Triangle;
import task_2.task_2_2.view.ShapesView;

import java.util.Arrays;
import java.util.Scanner;

public class MainController {
    ShapesView shapeView = new ShapesView();
    Scanner scn;
    Shapes model= new Shapes();


    public void execute(){
        model.setShapes(DataSource.getShapes());

        displayData();

        shapeView.showTotalArea(model.calcTotalArea());

        calculateParticularArea();

        sortingByArea();

        sortingByColor();
    }





      public void displayData(){
          shapeView.showMessage(ShapesView.DISPLAY_SET_DATA);
          shapeView.printShapes(model.getShapes());
      }


    public void calculateParticularArea(){
        shapeView.showMessage(ShapesView.ENTER_SHAPE);

        switch (enterValue()){
            case 1:
                shapeView.showMessage(ShapesView.CIRCLE_AREA + calcTotalCircleArea(model.getShapes()));
                break;
            case 2:
                shapeView.showMessage(ShapesView.RECTANGLE_AREA + calcTotalRectangleArea(model.getShapes()));
                break;
            case 3:
                shapeView.showMessage(ShapesView.TRIANGLE_AREA + calcTotalTriangleArea(model.getShapes()));
                break;
            default:
                break;
        }

    }


    public void sortingByArea(){
        Arrays.sort(model.getShapes(),new ShapesAreaComparator());
        shapeView.showMessage(ShapesView.BLINK_LINE);
        shapeView.showMessage(ShapesView.SORTING_BY_AREA);
        ShapesView.showArrayArea(model.getShapes());
    }


    public void sortingByColor(){
        Arrays.sort(model.getShapes(),new ShapesColorComparator());
        shapeView.showMessage(ShapesView.BLINK_LINE);
        shapeView.showMessage(ShapesView.SORTING_BY_COLOR);
        ShapesView.showArrayColor(model.getShapes());
    }



    public static double calcTotalCircleArea(Shape[]shapes){
        double area = 0.0;

        for(Shape shape : shapes)
            if(shape instanceof Circle)
                area += shape.calcArea();

        return area;
    }

    public static double calcTotalRectangleArea(Shape[]shapes){
        double area = 0.0;

        for(Shape shape : shapes)
            if(shape instanceof Rectangle)
                area += shape.calcArea();

        return area;
    }

    public static double calcTotalTriangleArea(Shape[]shapes){
        double area = 0.0;

        for(Shape shape : shapes)
            if(shape instanceof Triangle)
                area += shape.calcArea();

        return area;
    }



    public int enterValue(){
        scn = new Scanner(System.in);
        int val = 0;


        while(true){
            if(scn.hasNextInt()){
                val = scn.nextInt();

                if(val == 1 || val==2 || val==3)
                    return val;
                else {
                    shapeView.showMessage(ShapesView.ERROR_VAL);
                    scn = new Scanner(System.in);
                }

            }else{
                shapeView.showMessage(ShapesView.ERROR_VAL);
                scn = new Scanner(System.in);
            }
        }

    }


}
