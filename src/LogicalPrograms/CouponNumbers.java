package LogicalPrograms;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class CouponNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter number of distinct coupons: ");
        int n = sc.nextInt();

        HashSet<Integer> coupons = new HashSet<>();
        int count = 0;

        while (coupons.size() < n) {
            int coupon = random.nextInt(n) + 1;
            count++;
            coupons.add(coupon);
        }

        System.out.println("Total random numbers generated: " + count);
    }
}
