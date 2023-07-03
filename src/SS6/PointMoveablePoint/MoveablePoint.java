package SS6.PointMoveablePoint;
import  java.util.Arrays;
public class MoveablePoint extends Point {
    private double xSpeed;
    private double ySpeed;
    public MoveablePoint(double x,double y,double xSpeed, double ySpeed) {
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(double xSpeed, double ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint() {
    }

    public double getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(double xSpeed) {
        this.xSpeed = xSpeed;
    }

    public double getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(double ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(double xSpeed,double ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public  double[] getSpeed(){
        return new double[]{xSpeed,ySpeed};
    }

    @Override
    public String toString() {
        return "MoveablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                getXY() +" speed = "+ getSpeed()+
                '}';
    }
    public double[] move(double x,double y){
        setX(x+=xSpeed);
        setY(y+=ySpeed);
        return getXY();
    }
 
}
