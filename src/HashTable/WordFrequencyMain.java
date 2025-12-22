package HashTable;

import java.util.LinkedList;

public class WordFrequencyMain {

    public static void main(String[] args) {

        System.out.println("UC-1: Frequency of words in sentence");
        String sentence = "To be or not to be";
        String[] words = sentence.toLowerCase().split(" ");

        LinkedList<MyMapNode<String, Integer>> list = new LinkedList<>();

        for (String word : words) {
            boolean found = false;

            for (MyMapNode<String, Integer> node : list) {
                if (node.getKey().equals(word)) {
                    node.setValue(node.getValue() + 1);
                    found = true;
                    break;
                }
            }

            if (!found) {
                list.add(new MyMapNode<>(word, 1));
            }
        }

        for (MyMapNode<String, Integer> node : list) {
            System.out.println(node.getKey() + " : " + node.getValue());
        }

        // -----------------------------
        System.out.println("\nUC-2: Frequency of words in a paragraph");
        String paragraph = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        String[] paraWords = paragraph.toLowerCase().split(" ");

        // Hash table with 10 buckets
        LinkedList<MyMapNode<String, Integer>>[] hashTable = new LinkedList[10];
        for (int i = 0; i < 10; i++) {
            hashTable[i] = new LinkedList<>();
        }

        for (String word : paraWords) {
            int index = Math.abs(word.hashCode() % 10);
            boolean found = false;
            for (MyMapNode<String, Integer> node : hashTable[index]) {
                if (node.getKey().equals(word)) {
                    node.setValue(node.getValue() + 1);
                    found = true;
                    break;
                }
            }
            if (!found) {
                hashTable[index].add(new MyMapNode<>(word, 1));
            }
        }

        for (int i = 0; i < 10; i++) {
            if (!hashTable[i].isEmpty()) {
                System.out.print("Bucket " + i + " : ");
                for (MyMapNode<String, Integer> node : hashTable[i]) {
                    System.out.print(node.getKey() + "(" + node.getValue() + ") ");
                }
                System.out.println();
            }
        }

        // -----------------------------
        System.out.println("\nUC-3: Frequency of specific word 'paranoid'");
        String keyWord = "paranoid";
        int frequency = 0;
        for (int i = 0; i < 10; i++) {
            for (MyMapNode<String, Integer> node : hashTable[i]) {
                if (node.getKey().equals(keyWord)) {
                    frequency = node.getValue();
                    break;
                }
            }
        }
        System.out.println("Frequency of word '" + keyWord + "' : " + frequency);
    }
}

