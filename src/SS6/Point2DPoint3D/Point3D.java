package SS6.Point2DPoint3D;

public class Point3D extends Point2D{
    private double z=8;

    public Point3D() {
    }

    public Point3D(double x, double y,double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
    public void setXYZ(double x,double y,double z){
        super.setXY(x,y);
        this.z=z;
    }
    public  double[] getXYZ(){
        return new double[]{getX(),getY(),getZ()};
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x="+getX()+
                "y="+getY()+
                "z=" + z +
                "xyz="+getXYZ()+
                '}';
    }
}
