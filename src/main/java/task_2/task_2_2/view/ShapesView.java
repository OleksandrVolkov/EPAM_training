package task_2.task_2_2.view;

import task_2.task_2_2.model.base.Shape;

public class ShapesView implements UserMessages{
    UserInput input = new UserInput();

    public ShapesView(){}

    public void showMessage(String mes){
        System.out.println(mes);
    }
    public void showMessage(Shape shape){
        System.out.println(shape);
    }

    public void showArrayColor(Shape[]shapes){
        for(Shape shape: shapes) {
            System.out.println(shape);
            System.out.println("\t" + COLOR + shape.getShapeColor());
        }
    }
    public void showArrayArea(Shape[]shapes){
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

    public int enterIntVal(){
        return input.enterIntValue(this);
    }
}
