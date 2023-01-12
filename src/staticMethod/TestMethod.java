package staticMethod;

public class TestMethod {

    public static void main(String[] args) {
        Student.change();

        Student st1 = new Student(111,"Hoang");
        Student st2 = new Student(222,"Ngoc");
        Student st3 = new Student(333,"Nguyen");

        st1.display();
        st2.display();
        st3.display();


    }
}
