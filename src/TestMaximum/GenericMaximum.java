package TestMaximum;

import java.util.Arrays;

public class GenericMaximum<T extends Comparable<T>> {

    public static <T extends Comparable<T>> T testMaximum(T... values) {
        Arrays.sort(values);
        return values[values.length - 1];
    }
}
