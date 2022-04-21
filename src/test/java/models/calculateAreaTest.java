package models;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class calculateAreaTest {
//    @Test
//    public void getArea_returnAreaOfaTriangle_50(){
//        Triangle triangle = new Triangle(10,10);
//        calculateArea calculateArea = new calculateArea();
//        double expected = 50.0;
//        assertEquals(expected, calculateArea.getArea(triangle));
//    }

//    @Test
//    public void getArea_AreaOfaRectangle_50(){
//        Rectangle rectangle = new Rectangle(10,5);
//        calculateArea calculateArea = new calculateArea();
//        Integer expected = 50;
//        assertEquals(expected, calculateArea.getArea(rectangle));
//
//
//    }
    @Test
    public  void getArea_AreaOFaCircle_120(){
        Circle circle = new Circle(7);
        calculateArea calculateArea = new calculateArea();
        double expected = 153.958;
        assertEquals(expected, calculateArea.getArea(circle));
    }
}

