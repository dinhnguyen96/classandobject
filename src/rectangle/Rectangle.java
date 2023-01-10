package rectangle;

public class Rectangle {

    private double width;
    private double height;

    public Rectangle()
    {
        width = 0.0;
        height = 0.0;
    }

    public Rectangle(double width, double height)
    {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea()
    {
        return this.width * this.height;
    }

    public double getPerimeter()
    {
        return (this.width + this.height) * 2;
    }

    public String display()
    {
        return "Chu vi hình chữ nhật là : " + this.getPerimeter() +"\n"+"Diện tích hình chữ nhật là : " + this.getArea();
    }

}
