package TestMaximum;

public class GenericMaximumTest {

    public static void main(String[] args) {

        GenericMaximum<Integer> intTest =
                new GenericMaximum<>(10, 40, 30);

        System.out.println("Generic Class Integer Max: "
                + intTest.testMaximum());

        GenericMaximum<String> stringTest =
                new GenericMaximum<>("Apple", "Peach", "Banana");

        System.out.println("Generic Class String Max: "
                + stringTest.testMaximum());
    }
}
