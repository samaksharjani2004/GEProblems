package AlgorithmPrograms;

import java.nio.file.*;
import java.util.*;

public class BinarySearchWord {
    public static void main(String[] args) throws Exception {
        String content = Files.readString(Path.of("words.txt"));
        String[] words = content.split(",");

        Arrays.sort(words);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word: ");
        String key = sc.next();

        int index = Arrays.binarySearch(words, key);
        System.out.println(index >= 0 ? "Word Found" : "Word Not Found");
    }
}

