package TestMaximum;

public class GenericMaximumTest {

    public static void main(String[] args) {

        System.out.println("Integer Max: "
                + GenericMaximum.testMaximum(10, 20, 30));

        System.out.println("Float Max: "
                + GenericMaximum.testMaximum(3.3f, 2.2f, 1.1f));

        System.out.println("String Max: "
                + GenericMaximum.testMaximum("Apple", "Peach", "Banana"));
    }
}