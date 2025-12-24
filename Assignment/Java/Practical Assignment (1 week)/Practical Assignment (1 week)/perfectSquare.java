//5. Write a program to check if a given number is perfect square.

import java.util.Scanner;

public class perfectSquare {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int temp=0,i=0;
        for(i=2;i<num/2;i++) {
            if (i*i==num) {
                temp++;
                break;
            }
        }
        if(temp>0){
            System.out.println(num+" is a perfect square of "+ i);
        }
        else{
            System.out.println(num+ " is not  a perfect square number.");
        }
    }
}
