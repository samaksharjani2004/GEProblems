package TestMaximum;

public class GenericMaximum<T extends Comparable<T>> {

    public static <T extends Comparable<T>> void printMax(T... values) {
        T max = testMaximum(values);
        System.out.println("Maximum value is: " + max);
    }

    public static <T extends Comparable<T>> T testMaximum(T... values) {
        java.util.Arrays.sort(values);
        return values[values.length - 1];
    }
}
