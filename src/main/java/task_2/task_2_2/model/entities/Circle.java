package task_2.task_2_2.model.entities;

import task_2.task_2_2.model.base.Shape;

public class Circle extends Shape{
    private int radius;

    public Circle(){
        super("Default");
    }

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public double calcArea(){
        return Math.PI * (Math.pow(radius,2.0));
    }

    public void draw() {
        System.out.println("Building a " + getShapeColor() + " circle");
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        return radius == circle.radius;
    }

    @Override
    public int hashCode() {
        return radius;
    }
}

