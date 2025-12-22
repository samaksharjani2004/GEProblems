package AlgorithmPrograms;

import java.util.*;

public class StringPermutation {

    // Recursive method
    static void permuteRec(String str, String ans, List<String> result) {
        if (str.length() == 0) {
            result.add(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            permuteRec(str.substring(0, i) + str.substring(i + 1),
                    ans + str.charAt(i), result);
        }
    }

    // Iterative method
    static List<String> permuteIter(String str) {
        List<String> result = new ArrayList<>();
        result.add("");
        for (char c : str.toCharArray()) {
            List<String> newList = new ArrayList<>();
            for (String s : result)
                for (int i = 0; i <= s.length(); i++)
                    newList.add(s.substring(0, i) + c + s.substring(i));
            result = newList;
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "ABC";

        List<String> rec = new ArrayList<>();
        permuteRec(str, "", rec);

        List<String> iter = permuteIter(str);

        System.out.println("Recursive: " + rec);
        System.out.println("Iterative: " + iter);
        System.out.println("Equal: " + rec.containsAll(iter));
    }
}

