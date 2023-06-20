package SS4.thuchanh;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" input width = ");
        double width = Integer.parseInt(sc.nextLine());
        System.out.println(" input height = ");
        double heght = Integer.parseInt(sc.nextLine());
        Rectangle rectangle = new Rectangle(width,heght);
        System.out.println(rectangle.disPlay(width,heght));
        System.out.println(" area of rectangle "+rectangle.getArea(width,heght));
        System.out.println("perimeter "+ rectangle.getPerimeter(width,heght));
    }
}
