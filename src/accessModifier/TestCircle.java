package accessModifier;

public class TestCircle {

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.printf("Radius : %f" + " " +"Color : %s", circle.getRadius(), circle.getColor());
    }
}
