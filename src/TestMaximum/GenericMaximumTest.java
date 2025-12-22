package TestMaximum;

public class GenericMaximumTest {

    public static void main(String[] args) {

        System.out.println("TC 1.1 Max at First Position: "
                + GenericMaximum.testMaximum(30, 20, 10));

        System.out.println("TC 1.2 Max at Second Position: "
                + GenericMaximum.testMaximum(10, 30, 20));

        System.out.println("TC 1.3 Max at Third Position: "
                + GenericMaximum.testMaximum(10, 20, 30));
    }
}