package task_2.task_2_2.model.entities;

import task_2.task_2_2.model.base.Shape;

public class Triangle extends Shape{
    private int side1;
    private int side2;
    private int side3;


    public Triangle(){
        super("Default");
    }

    public Triangle(String color,int side1, int side2, int side3) {
        super(color);

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }


    public double calcArea(){
        double half_perimeter=(side1+side2+side3)/2.0;
        return Math.sqrt(half_perimeter * (half_perimeter - side1) * (half_perimeter - side2) * (half_perimeter - side3));
    }


    public void draw() {
        System.out.println("Building a " + getShapeColor() + " triangle");
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (side1 != triangle.side1) return false;
        if (side2 != triangle.side2) return false;
        return side3 == triangle.side3;
    }

    @Override
    public int hashCode() {
        int result = side1;
        result = 31 * result + side2;
        result = 31 * result + side3;
        return result;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }
}
