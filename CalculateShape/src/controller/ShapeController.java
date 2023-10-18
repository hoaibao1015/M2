package Controller;

import java.util.Scanner;
import model.Circle;
import model.Rectangle;
import model.Shape;
import model.Triangle;
import view.ShapeView;

public class ShapeController {

    private Scanner scanner;

    public ShapeController() {
        scanner = new Scanner(System.in);
    }

    public void run() {
        System.out.println("=====Calculator Shape Program=====");
        System.out.print("Please input side width of Rectangle: ");
        double width = scanner.nextDouble();
        System.out.print("Please input length of Rectangle: ");
        double length = scanner.nextDouble();
        Shape rectangle = new Rectangle(width, length);

        System.out.print("Please input radius of Circle: ");
        double radius = scanner.nextDouble();
        Shape circle = new Circle(radius);

        System.out.print("Please input side A of Triangle: ");
        double sideA = scanner.nextDouble();
        System.out.print("Please input side B of Triangle: ");
        double sideB = scanner.nextDouble();
        System.out.print("Please input side C of Triangle: ");
        double sideC = scanner.nextDouble();
        Shape triangle = new Triangle(sideA, sideB, sideC);
        
        System.out.println("-----Rectangle-----");
        ShapeView.displayShapeInfo(rectangle);
        System.out.println("-----Circle-----");
        ShapeView.displayShapeInfo(circle);
        System.out.println("-----Triangle-----");
        ShapeView.displayShapeInfo(triangle);

        scanner.close();
    }
}
