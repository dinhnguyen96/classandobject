package point;

public class MovablePoint extends Point
{
    private float xSpeed;
    private float ySpeed;

    public MovablePoint()
    {
        super();
        this.xSpeed = 0.0f;
        this.ySpeed = 0.0f;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed)
    {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpped(float xSpeed, float ySpeed)
    {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed()
    {
        return new float[]{this.xSpeed, this.ySpeed};
    }

    @Override
    public String toString() {
        return "("+this.xSpeed+","+this.ySpeed+")";
    }

    public MovablePoint move()
    {
        float x = this.getX();
        float y = this.getY();
        x += this.getxSpeed();
        y += this.getySpeed();
        this.setX(x);
        this.setY(y);
        return this;
    }
}
