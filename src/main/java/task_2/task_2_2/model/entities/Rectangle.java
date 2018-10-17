package task_2.task_2_2.model.entities;

import task_2.task_2_2.model.base.Shape;

public class Rectangle extends Shape{
    private int width;
    private int height;


    public Rectangle(){
        super("Default");
    }
    public Rectangle(String color,int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public double calcArea(){
        return width*height;
    }

    public void draw() {
        System.out.println("Building a " + getShapeColor() + " rectangle");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rectangle rectangle = (Rectangle) o;

        if (width != rectangle.width) return false;
        return height == rectangle.height;
    }

    @Override
    public int hashCode() {
        int result = width;
        result = 31 * result + height;
        return result;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
