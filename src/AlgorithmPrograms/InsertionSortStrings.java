package AlgorithmPrograms;

public class InsertionSortStrings {

    public static void main(String[] args) {
        String[] arr = {"pear", "apple", "orange"};

        for (int i = 1; i < arr.length; i++) {
            String key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        for (String s : arr)
            System.out.println(s);
    }
}

