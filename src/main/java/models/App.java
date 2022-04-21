package models;

import java.sql.SQLOutput;
import java.util.SortedMap;

public class App {
    public static void main(String [] args){
        Circle circle = new Circle(20);
        calculateArea  calculAtearea = new calculateArea();
        Double myArea = calculAtearea.getArea(circle);
        System.out.println(myArea);

        Triangle triangle = new Triangle(12, 20);
        calculateArea calculatearea = new calculateArea();
        Double tArea = calculatearea.getArea(triangle);
        System.out.println(tArea);

        Rectangle rectangle = new Rectangle(20,20);
        calculateArea calculateArea = new calculateArea();
        Integer rArea = calculateArea.getArea(rectangle);
        System.out.println(rArea);


    }
}
