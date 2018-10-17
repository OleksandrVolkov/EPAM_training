package task_2.task_2_2.model.base;

import task_2.task_2_2.model.entities.Circle;

abstract public class Shape implements Drawable {
    private String shapeColor;

    public String getShapeColor() {
        return shapeColor;
    }

    public void setShapeColor(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    abstract public double calcArea();

    @Override
    public String toString() {
        return "Shape color: " + shapeColor;
    }

}
