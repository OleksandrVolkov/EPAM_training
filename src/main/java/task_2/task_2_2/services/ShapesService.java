package task_2.task_2_2.services;

import task_2.task_2_2.model.Shapes;
import task_2.task_2_2.model.base.Shape;
import task_2.task_2_2.model.base.ShapesAreaComparator;
import task_2.task_2_2.model.base.ShapesColorComparator;
import task_2.task_2_2.model.entities.Circle;
import task_2.task_2_2.model.entities.Rectangle;
import task_2.task_2_2.model.entities.Triangle;
import task_2.task_2_2.view.ShapesView;

import java.util.Arrays;

public class ShapesService {
    Shapes model;

    public ShapesService(Shapes model){
        this.model = model;
    }


    public void sortingByArea(){
        Arrays.sort(model.getShapes(),new ShapesAreaComparator());
    }


    public void sortingByColor(){
        Arrays.sort(model.getShapes(),new ShapesColorComparator());
    }



    public double calcTotalCircleArea(Shape[]shapes){
        double area = 0.0;

        for(Shape shape : shapes)
            if(shape instanceof Circle)
                area += shape.calcArea();

        return area;
    }

    //String.valueOf()

    public double calcTotalRectangleArea(Shape[]shapes){
        double area = 0.0;

        for(Shape shape : shapes)
            if(shape instanceof Rectangle)
                area += shape.calcArea();

        return area;
    }

    public double calcTotalTriangleArea(Shape[]shapes){
        double area = 0.0;

        for(Shape shape : shapes)
            if(shape instanceof Triangle)
                area += shape.calcArea();

        return area;
    }

}
