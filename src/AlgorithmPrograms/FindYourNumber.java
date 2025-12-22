package AlgorithmPrograms;

import java.util.Scanner;

public class FindYourNumber {

    static void search(int low, int high, Scanner sc) {
        if (low == high) {
            System.out.println("Your number is " + low);
            return;
        }

        int mid = (low + high) / 2;
        System.out.println("Is number less than or equal to " + mid + "? (true/false)");
        boolean ans = sc.nextBoolean();

        if (ans)
            search(low, mid, sc);
        else
            search(mid + 1, high, sc);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N (2^n): ");
        int n = sc.nextInt();

        search(0, n - 1, sc);
    }
}

