package task_2.task_2_2.controller;

import task_2.task_2_2.model.DataSource;
import task_2.task_2_2.model.Shapes;
import task_2.task_2_2.model.base.Shape;
import task_2.task_2_2.model.base.ShapesAreaComparator;
import task_2.task_2_2.model.base.ShapesColorComparator;
import task_2.task_2_2.model.entities.Circle;
import task_2.task_2_2.model.entities.Rectangle;
import task_2.task_2_2.model.entities.Triangle;
import task_2.task_2_2.services.ShapesService;
import task_2.task_2_2.view.ShapesView;

import java.util.Arrays;
import java.util.Scanner;

public class MainController {
    ShapesView view = new ShapesView();
    Shapes model= new Shapes();
    ShapesService service = new ShapesService(model);


    public void execute(){
        model.setShapes(DataSource.getShapes());

        view.showMessage(ShapesView.DISPLAY_SET_DATA);
        view.printShapes(model.getShapes());

        view.showTotalArea(model.calcTotalArea());

        calculateParticularArea();


        service.sortingByArea();
        view.showMessage(ShapesView.BLINK_LINE);
        view.showMessage(ShapesView.SORTING_BY_AREA);
        view.showArrayArea(model.getShapes());


        service.sortingByColor();
        view.showMessage(ShapesView.BLINK_LINE);
        view.showMessage(ShapesView.SORTING_BY_COLOR);
        view.showArrayColor(model.getShapes());
    }


    public void calculateParticularArea(){
        view.showMessage(ShapesView.ENTER_SHAPE);

        switch (view.enterIntVal()){
            case 1:
                view.showMessage(ShapesView.CIRCLE_AREA + service.calcTotalCircleArea(model.getShapes()));
                break;
            case 2:
                view.showMessage(ShapesView.RECTANGLE_AREA + service.calcTotalRectangleArea(model.getShapes()));
                break;
            case 3:
                view.showMessage(ShapesView.TRIANGLE_AREA + service.calcTotalTriangleArea(model.getShapes()));
                break;
            default:
                break;
        }

    }
}
