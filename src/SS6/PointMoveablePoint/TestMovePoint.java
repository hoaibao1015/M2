package SS6.PointMoveablePoint;

import java.util.Scanner;
import java.util.Arrays;
public class TestMovePoint {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint();
        Scanner sc = new Scanner(System.in);
        double x,y;
        System.out.println("nhap x");
        x=Double.parseDouble(sc.nextLine());
        System.out.println("nhap y");
        y=Double.parseDouble(sc.nextLine());
        moveablePoint.setX(x);
        moveablePoint.setY(y);
        double xs,ys;
        System.out.println("nhap xs");
        xs=Double.parseDouble(sc.nextLine());
        System.out.println("nhap ys");
        ys=Double.parseDouble(sc.nextLine());
        moveablePoint.setXSpeed(xs);
        moveablePoint.setYSpeed(ys);
        System.out.println("move "+Arrays.toString(moveablePoint.move(x,y)));
    }
}