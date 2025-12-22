package AlgorithmPrograms;

import java.util.Arrays;

public class AnagramCheck {

    public static void main(String[] args) {
        String s1 = "heart";
        String s2 = "earth";

        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        System.out.println(Arrays.equals(a, b)
                ? "Anagram"
                : "Not Anagram");
    }
}

