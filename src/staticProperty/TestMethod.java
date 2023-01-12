package staticProperty;

public class TestMethod {

    public static void main(String[] args) {

        Car car1 = new Car("Mercedes", "diazen");
        System.out.printf("Tên xe : %s" + "  " + "Loại xăng : %s"+"\n", car1.getName(),car1.getEngine());
        Car.carCreateOfNumberDisplay();
        Car car2 = new Car("Mitsubishi", "diazen");
        System.out.printf("Tên xe : %s" + " "+"Loại xăng : %s"+"\n", car2.getName(),car2.getEngine());
        Car.carCreateOfNumberDisplay();

    }
}
