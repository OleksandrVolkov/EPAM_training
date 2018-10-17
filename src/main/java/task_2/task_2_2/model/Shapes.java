package task_2.task_2_2.model;

import task_2.task_2_2.model.base.Shape;

public class Shapes {
    private Shape[] shapes;

    public Shapes(){}

    public Shape[] getShapes() {
        return shapes;
    }

    public void setShapes(Shape[] shapes) {
        this.shapes = shapes;
    }

    public double calcTotalArea(){
        double area = 0.0;
        for(Shape shape : shapes){
            area += shape.calcArea();
        }
        return area;
    }
}
