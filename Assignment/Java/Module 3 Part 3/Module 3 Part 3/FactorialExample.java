//22. Write a class FactorialExample to accept the number and find the factorial of it.

import java.util.Scanner;

public class FactorialExample {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++){
            sum+=i;
        }
        System.out.print("Sum of n number is= "+sum);
    }
}
