//21. Write a class ReverseNumber to accept the number and find the reverse of it

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int temp=num, digit=0;
        while(temp>0){
            digit=temp%10;
            temp=temp/10;
            System.out.print(digit);
        }
    }
}
