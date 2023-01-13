package shape;

public class Square extends Rectangle
{
    public Square()
    {
        super();
    }

    public Square(double side, String color, boolean filled)
    {
       super(color, filled, side,side);
    }

    public Square(double side)
    {
       super(side,side);
    }
    public double getSide()
    {
        return super.getWidth();
    }
    public void setSide(double side)
    {
         this.setWidth(side);
         this.setHeight(side);
    }

    // set up private square width va height
    @Override
    public void setWidth(double width)
    {
        this.setSide(width);
    }

    @Override
    public void setHeight(double height)
    {
        this.setSide(height);
    }

    @Override
    public String toString() {
        return "A Square with side="+this.getSide()+", which is a subclass of "+super.toString()+" ";
    }
}
