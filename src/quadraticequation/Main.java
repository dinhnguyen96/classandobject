package quadraticequation;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("a = ");
        double a = input.nextDouble();
        System.out.print("b = ");
        double b = input.nextDouble();
        System.out.print("c = ");
        double c = input.nextDouble();
        QuadraticEquation q = new QuadraticEquation(a,b,c);
        double delta = q.getDiscriminant();
        if (delta > 0)
        {
            double x1 = q.getRoot1();
            double x2 = q.getRoot2();
            System.out.printf("The equation has two roots %f and %f", x1,x2);
        }
        else if (delta < 0)
        {
            System.out.println("The equation has no real root");
        }
        else
        {
            double x1 = -b / (2 * a);
            System.out.printf("The equation has one root %f ", x1);
        }

    }
}
