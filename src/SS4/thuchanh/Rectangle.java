package SS4.thuchanh;

public class Rectangle {
    double width, height;

    public Rectangle() {

    }

    public Rectangle(double width , double height){
        this.height=height;
        this.width=width;
    }
    public double getArea( double width,double height){
          return (this.width*this.height);
    }
    public double getPerimeter(double width,double height){
        return (this.width+this.height)*2;
    }
    public  String disPlay(double width,double height){
        return  "Rectanggle { + width= "+ width+ ", height = "+height+" }" ;
    }
}
