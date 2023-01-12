package accessModifier;

public class Circle {

    private double radius;
    private String color;

    public Circle()
    {
        this.radius = 1.0;
        this.color = "Red";
    }
    public Circle(double radius)
    {
       this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
}
