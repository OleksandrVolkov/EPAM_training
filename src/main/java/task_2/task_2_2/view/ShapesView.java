package task_2.task_2_2.view;

import task_2.task_2_2.model.base.Shape;

public class ShapesView {
    final public static String DISPLAY_SET_DATA = "Displaying set of data: ";
    final public static String AREA = "Area: ";
    final public static String COLOR = "Color: ";
    final public static String BLINK_LINE = "\n";
    final public static String TOTAL_AREA = "Total area of all of the shapes: ";
    final public static String SORTING_BY_AREA = "Sorting by area: ";
    final public static String SORTING_BY_COLOR = "Sorting by color: ";
    final public static String ENTER_SHAPE="Enter a particular shape (1-circle, 2-rectangle, 3-triangle)";
    final public static String ERROR_VAL = "Error, enter a valid value ";
    final public static String CIRCLE_AREA = "Total area of the circles: ";
    final public static String RECTANGLE_AREA = "Total area of the rectangles: ";
    final public static String TRIANGLE_AREA = "Total area of the triangles: ";


    public ShapesView(){}

    public void showMessage(String mes){
        System.out.println(mes);
    }
    public void showMessage(Shape shape){
        System.out.println(shape);
    }

    public static void showArrayColor(Shape[]shapes){
        for(Shape shape: shapes) {
            System.out.println(shape);
            System.out.println("\t" + COLOR + shape.getShapeColor());
        }
    }
    public static void showArrayArea(Shape[]shapes){
        for(Shape shape: shapes) {
            System.out.println(shape);
            System.out.println("\t" + AREA + shape.calcArea());
        }
    }

    public void printShapes(Shape[] shapes){
        System.out.println(BLINK_LINE);

        for(Shape shape:shapes){
            System.out.println(shape);
            System.out.println(ShapesView.AREA + shape.calcArea());
            shape.draw();
            System.out.println(ShapesView.BLINK_LINE);
        }
    }

    public void showTotalArea(double area){
        showMessage(ShapesView.BLINK_LINE);
        showMessage(ShapesView.TOTAL_AREA + area);
    }
}
