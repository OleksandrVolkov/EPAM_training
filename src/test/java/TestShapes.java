import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import task_2.task_2_2.model.Shapes;
import task_2.task_2_2.model.base.Shape;
import task_2.task_2_2.model.entities.Circle;
import task_2.task_2_2.model.entities.Rectangle;
import task_2.task_2_2.model.entities.Triangle;
import task_2.task_2_2.services.ShapesService;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class TestShapes {
    public static ShapesService model;

    @Parameterized.Parameter
    public static double circleAreaExpected;

    @Parameterized.Parameter(1)
    public static double rectangleAreaExpected;

    @Parameterized.Parameter(2)
    public static double triangleAreaExpected;

    @Parameterized.Parameter(3)
    public static Shape[] shapes;

    public static int counter = 0;

    @Before
    public void init(){
        model = new ShapesService(new Shapes());
        shapes = getSecondArray();
    }

    @Parameterized.Parameters
    public static Collection data(){
        return Arrays.asList( new Object[][]{
//                        {292.16, 182.0, 28.69, shapes}
                        {169.64, 166.0, 10.84, shapes}
        }
        );
    }

    public static Shape[] getArray(){
            return  new Shape[]{
                        new Triangle("Blue", 5, 4, 2),
                        new Circle("Red", 2),
                        new Rectangle("Violet", 3, 9),
                        new Circle("Yellow", 5),
                        new Triangle("Green", 9, 5, 7),
                        new Rectangle("Black", 8, 9),
                        new Rectangle("Pink", 7, 9),
                        new Triangle("White", 3, 5, 6),
                        new Circle("Silver", 8),
                        new Rectangle("Orange", 4, 5)
            };
    }

    public static Shape[] getSecondArray(){
        return  new Shape[]{
                    new Triangle("Blue", 2, 3, 4),
                    new Circle("Red", 5),
                    new Rectangle("Violet", 2, 6),
                    new Circle("Yellow", 2),
                    new Triangle("Green", 4, 6, 2),
                    new Rectangle("Black", 4, 1),
                    new Rectangle("Pink", 12, 9),
                    new Triangle("White", 4, 6, 4),
                    new Circle("Silver", 5),
                    new Rectangle("Orange", 7, 6)
        };
    }


    @Test
    public void testTotalCircleArea(){
        double result = model.calcTotalCircleArea(shapes);
        assertEquals(circleAreaExpected, result, 0.01);
    }

    @Test
    public void testTotalRectangleArea(){
        double result = model.calcTotalRectangleArea(shapes);
        assertEquals(rectangleAreaExpected, result, 0.01);
    }

    @Test
    public void testTotalTriangleArea(){
        double result = model.calcTotalTriangleArea(shapes);
        assertEquals(triangleAreaExpected, result, 0.01);
    }

    public static Collection getShapes(){
        return Arrays.asList(new Object[]{
                new Circle("black", 6),
                new Rectangle("yellow", 4, 2),
                new Circle("red", 3),
                new Triangle("violet", 2, 4, 5),
                new Rectangle("white", 8, 9)
        });
    }
}
