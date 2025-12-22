package AlgorithmPrograms;

public class MergeSortStrings {

    static void mergeSort(String[] arr, int l, int r) {
        if (r - l <= 1) return;

        int mid = (l + r) / 2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid, r);

        String[] temp = new String[r - l];
        int i = l, j = mid, k = 0;

        while (i < mid && j < r)
            temp[k++] = arr[i].compareTo(arr[j]) <= 0 ? arr[i++] : arr[j++];

        while (i < mid) temp[k++] = arr[i++];
        while (j < r) temp[k++] = arr[j++];

        System.arraycopy(temp, 0, arr, l, temp.length);
    }

    public static void main(String[] args) {
        String[] arr = {"banana", "apple", "cherry"};
        mergeSort(arr, 0, arr.length);

        for (String s : arr)
            System.out.println(s);
    }
}

