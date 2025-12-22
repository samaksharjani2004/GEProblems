package TestMaximum;

public class GenericMaximum {

    public static <T extends Comparable<T>> T testMaximum(T a, T b, T c) {

        T max = a;

        if (b.compareTo(max) > 0)
            max = b;

        if (c.compareTo(max) > 0)
            max = c;

        return max;
    }
}
