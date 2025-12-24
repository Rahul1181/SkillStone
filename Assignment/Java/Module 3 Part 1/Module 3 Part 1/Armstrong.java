//5. Write a program to find the Armstrong number using control structures.

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int digit=0;
        int num1=num;
        while(num1>0){
            int singledigit=num1%10;
            digit+=singledigit*singledigit*singledigit;
            num1=num1/10;
        }
        if(digit==num){
            System.out.println(num+" is an Armstrong Number");
        }
        else
            System.out.println(num+ " is not an Armstrong Number");
    }
}

