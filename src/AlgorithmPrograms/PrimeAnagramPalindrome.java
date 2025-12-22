package AlgorithmPrograms;

import java.util.*;

public class PrimeAnagramPalindrome {

    static boolean isPalindrome(int n) {
        return new StringBuilder("" + n).reverse().toString().equals("" + n);
    }

    static boolean isAnagram(int a, int b) {
        char[] x = String.valueOf(a).toCharArray();
        char[] y = String.valueOf(b).toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);
        return Arrays.equals(x, y);
    }

    public static void main(String[] args) {
        List<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= 1000; i++)
            if (PrimeNumbers.isPrime(i))
                primes.add(i);

        for (int i = 0; i < primes.size(); i++)
            for (int j = i + 1; j < primes.size(); j++)
                if (isAnagram(primes.get(i), primes.get(j)))
                    System.out.println(primes.get(i) + " & " + primes.get(j));

        System.out.println("Palindrome Primes:");
        for (int p : primes)
            if (isPalindrome(p))
                System.out.print(p + " ");
    }
}
