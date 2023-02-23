package ss4_class_object.bai_tap.fan;

public class Fan {
    private int SLow = 1;
    private int Medium = 2;
    private int Fast = 3;
    private int speed = SLow;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }
    public Fan(){

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

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString() {
        if (this.isOn()) {
            return "Fan has radius: " + this.getRadius() + " with color " + this.getColor() + ". Fan is on with speed: " + this.getSpeed();
        } else {
            return "Fan has radius: " + this.getRadius() + " with color " + this.getColor() + ". Fan is off";

        }
    }
}
