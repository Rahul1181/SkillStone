//16. Write a class MaxThree to accept three numbers and find the maximum in it.

import java.util.Scanner;

public class MaxThree {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a=sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b=sc.nextInt();
        System.out.print("Enter the value of c: ");
        int c=sc.nextInt();
        if(a>b && a>c){
            System.out.println("a is maximum");
        }
        else if(b>a && b>c){
            System.out.println("b is maximum");
        }
        else if(c>a && c>b){
            System.out.println("c is maximum");
        }
    }
}
