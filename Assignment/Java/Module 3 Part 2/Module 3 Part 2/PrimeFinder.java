//20. Write a class PrimeFinder to accept the number and find it is a prime number or not? Using control structures

import java.util.Scanner;

public class PrimeFinder {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int temp=0;
        if(num==2){
            System.out.println(num+" is a prime number");
        }
        for(int i=2;i<num;i++){
            if(num%i==0){
                temp++;
            }
        }
        if(temp>0)
            System.out.println(num+" is not a prime number");
        else{
            System.out.println(num+" is a prime number");

        }

    }
}
