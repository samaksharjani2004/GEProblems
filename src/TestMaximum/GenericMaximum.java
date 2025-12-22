package TestMaximum;

public class GenericMaximum<T extends Comparable<T>> {

    T a, b, c;

    public GenericMaximum(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public T testMaximum() {
        return testMaximum(a, b, c);
    }

    public static <T extends Comparable<T>> T testMaximum(T a, T b, T c) {

        T max = a;

        if (b.compareTo(max) > 0)
            max = b;

        if (c.compareTo(max) > 0)
            max = c;

        return max;
    }
}
