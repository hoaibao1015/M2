package SS4.F;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double  raidus=5;
    private String color ="blue";
    public Fan(){

    }
    public String toString(){
        if( on == true){
            return "speed: "+speed+", color : "+color+", radius: "+ raidus+", fan is on ";
        }else {
            return "color: "+color+", radius: "+raidus+", fan is off";
        }

    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRaidus() {
        return raidus;
    }

    public void setRaidus(double raidus) {
        this.raidus = raidus;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
