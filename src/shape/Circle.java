package shape;

public class Circle extends Shape
{
    private double radius;

    public Circle()
    {
        this.radius = 1.0;
    }

    public Circle(String color, boolean filled, double radius)
    {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius()
    {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getPerimeter()
    {
        return 2 * this.radius*Math.PI;
    }
    public double getArea()
    {
        return 3.14 * Math.pow(this.radius, 2);
    }

    @Override
    public String toString() {
        return "A Circle with radius="+this.getRadius()+", which is a subclass of "+ super.toString()+" ";
    }
}
