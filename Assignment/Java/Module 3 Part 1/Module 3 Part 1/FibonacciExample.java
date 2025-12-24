//10. Write a class FibonacciExample to accept a number and find its Fibonacci series value using do .. while

import java.util.Scanner;

public class FibonacciExample {
    static int fib(int n)
    {
        if (n <= 1)
            return n;
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number n: ");
        int num = sc.nextInt();
        do {
            System.out.println(fib(num));
            num--;
            } while (num>=0);
        }
    }


