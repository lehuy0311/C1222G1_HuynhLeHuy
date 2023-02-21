package ss4_class_object.bai_tap.quadratic_equation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("a: ");
        double a = scanner.nextDouble();
        System.out.printf("b: ");
        double b = scanner.nextDouble();
        System.out.printf("c: ");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        System.out.println(quadraticEquation.display());
        System.out.println(" Delta= " +quadraticEquation.getDiscriminant());
        if (quadraticEquation.getDiscriminant() >0){
            System.out.println("Root1 = " + quadraticEquation.getRoot1());
            System.out.println("Root2 = " + quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() ==0){
            System.out.println("Root1 = Root2 = " + quadraticEquation.getEqualRoot());
        }else {
            System.out.println("The equation has no roots");
        }
    }
}
