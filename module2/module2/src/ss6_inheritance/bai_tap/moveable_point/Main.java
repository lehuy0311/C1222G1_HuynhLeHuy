package ss6_inheritance.bai_tap.moveable_point;

public class Main {
    public static void main(String[] args) {
        MoveablePoint movablePoint=new MoveablePoint(4,5,9,10);
        System.out.println(movablePoint.toString());
        System.out.println(movablePoint.move());
    }
}
