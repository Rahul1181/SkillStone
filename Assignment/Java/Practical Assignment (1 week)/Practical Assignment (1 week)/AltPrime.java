//4. Write a program to display alternate prime numbers.
import java.util.Scanner;

public class AltPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the upper limit: ");
        int end = sc.nextInt();
        boolean prime[] = new boolean[end + 1];
        for (int i = 0; i <= end; i++) {
            prime[i] = true;
        }
        for (int p = 2; p * p <= end; p++) {
            if (prime[p]) {
                for (int i = p * 2; i <= end; i += p)
                    prime[i] = false;
            }
        }
        boolean prime_flag = true;
        for (int p = 2; p <= end; p++) {
            if (prime[p]) {
                if (prime_flag) {
                    System.out.println(p + " ");
                    prime_flag = false;
                } else {
                    prime_flag = true;
                }
            }
        }
    }
}