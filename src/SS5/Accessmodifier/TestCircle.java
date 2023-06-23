package SS5.Accessmodifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle =new Circle();
        double r= circle.getRadius();
        double area =circle.getArea();

        System.out.println("out put radius " +r);
        System.out.println("out put Area "+area);
    }
}
