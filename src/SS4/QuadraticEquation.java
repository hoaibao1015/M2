package SS4;

import java.util.Scanner;

public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public QuadraticEquation() {

    }

    public double setA() {
        return this.a;
    }

    public void getA(double value) {
        this.a = value;
    }

    public double setB() {
        return this.b;
    }

    public void getB(double value) {
        this.b = value;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant(double a, double b, double c) {
        return (b * b - (4 * a * c));
    }

    public double getRoot1(double a, double b, double c) {
        return ((-b + Math.pow(getDiscriminant(a, b, c), 0.5)) / (2 * a));
    }

    public double getRoot2(double a, double b, double c) {

        return ((-b - Math.pow(getDiscriminant(a, b, c), 0.5)) / (2 * a));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhap a");
        double a = Double.parseDouble(sc.nextLine());
        System.out.println(" nhap b");
        double b = Double.parseDouble(sc.nextLine());
        System.out.println(" nhap c");
        double c = Double.parseDouble(sc.nextLine());
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double delta = quadraticEquation.getDiscriminant(a, b, c);
        if (delta > 0) {
            System.out.println("The equation has 2 roots" + quadraticEquation.getRoot1(a, b, c) + "  " + quadraticEquation.getRoot2(a, b, c));
        } else {
            if (delta == 0) {
                System.out.println("The equation has 1 roots" + quadraticEquation.getRoot1(a, b, c));
            }else {
                System.out.println("The equation has no roots");
            }
        }

    }
}
