package AlgorithmPrograms;

import java.util.*;

public class GenericAlgorithms {

    static <T extends Comparable<T>> int binarySearch(T[] arr, T key) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr[m].compareTo(key) == 0) return m;
            if (arr[m].compareTo(key) < 0) l = m + 1;
            else r = m - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 3, 5, 7};
        System.out.println(binarySearch(arr, 5));
    }
}

