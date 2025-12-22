package TestMaximum;

public class GenericMaximumTest {
    public static void main(String[] args) {
        System.out.println("Float Max First: "
                + GenericMaximum.testMaximum(3.3f, 2.2f, 1.1f));

        System.out.println("Float Max Second: "
                + GenericMaximum.testMaximum(1.1f, 3.3f, 2.2f));

        System.out.println("Float Max Third: "
                + GenericMaximum.testMaximum(1.1f, 2.2f, 3.3f));

    }
}
