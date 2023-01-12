package staticProperty;

public class Car {

    private String name;
    private String engine;

    private static int carCreateOfNumber = 0;

    public Car(String name, String engine)
    {
        this.name = name;
        this.engine = engine;
        carCreateOfNumber++;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return this.engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
    public static void carCreateOfNumberDisplay()
    {
        System.out.println("Số lượng xe được khởi tạo : " + carCreateOfNumber);
    }

}
