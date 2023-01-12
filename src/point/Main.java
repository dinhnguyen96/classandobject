package point;

public class Main {

    public static void main(String[] args)
    {
//        Point point = new Point(3,5);
//        System.out.println("Điểm di chuyển của point :  " + point);
        MovablePoint movablePoint = new MovablePoint(2,5,3,6);
        MovablePoint moveAfter = movablePoint.move();
        System.out.printf("Giá trị hiện tại của điểm x và y là  : %f và %f \n", moveAfter.getX(), moveAfter.getY());
        System.out.println("Tốc độ di chuyển hiện tại của x và y là : " + moveAfter);


    }
}
