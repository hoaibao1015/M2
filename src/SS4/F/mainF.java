package SS4.F;

public class mainF {
    public static void main(String[] args) {
        Fan fan1= new Fan();
        Fan fan2= new Fan();
        fan1.setSpeed(3);
        fan1.setOn(true);
        fan1.setRaidus(10);
        fan1.setColor("yellow");

        fan2.setSpeed(2);
        fan2.setOn(false);
        fan2.setRaidus(5);
        fan2.setColor("bule");
        System.out.println("fan 1 := "+ fan1.toString());
        System.out.println("fan 2 := "+ fan2.toString());
    }
}
