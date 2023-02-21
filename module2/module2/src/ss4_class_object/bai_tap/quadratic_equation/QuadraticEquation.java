package ss4_class_object.bai_tap.quadratic_equation;

public class QuadraticEquation {
    double a , b , c;

    QuadraticEquation(){
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant(){
        double delta;
        delta = (b * b) - (4 * a * c);
        return delta;
    }

    public double getEqualRoot(){
        return -b/(2*a);
    }
    public double getRoot1(){
        double delta = (b * b) - (4 * a * c);
        return (-b+Math.pow(delta, 0.5))/(2*a);
    }

    public double getRoot2(){
        double delta = (b * b) - (4 * a * c);
        return (-b-Math.pow(delta, 0.5))/(2*a);
    }

    public String display(){
        return "QuadraticEquation {" + a + "x^2 + " + b + "x + " + c + " = 0 }";
    }

}
