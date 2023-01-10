package rectangle;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
          Scanner input = new Scanner(System.in);
          Rectangle rectangle = new Rectangle();
          System.out.print("Width = ");
          double width = Double.parseDouble(input.nextLine());
          System.out.print("Height = ");
          double height = Double.parseDouble(input.nextLine());
          rectangle.setWidth(width);
          rectangle.setHeight(height);
          String value = rectangle.display();

          System.out.println(value);
    }
}
