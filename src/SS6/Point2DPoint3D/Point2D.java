package SS6.Point2DPoint3D;

public class Point2D {
    private double x=6;
    private double y=4;

    public Point2D() {
    }

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public void setXY(double x,double y){
        this.x=x;
        this.y=y;
    }
    public  double[] getXY(){
        double[] arr=new double[2];
        arr[0]=x;
        arr[1]=y;
        return arr;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                ",xy="+getXY()+
                '}';
    }
}
