package SS6.CircleCylinder;

public class Cylinder extends Circle{
    private double height=6;

    public Cylinder() {

    }
    public  Cylinder(double radius,String color,double height){
        super(radius, color);
        this.height=height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getAreaCylinder(){
        return 2*getArea()*height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height + "getAreaCylinder"+getAreaCylinder()+
                '}';
    }
}
