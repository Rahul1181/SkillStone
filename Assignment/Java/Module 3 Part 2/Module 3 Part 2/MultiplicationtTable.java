//17. Write a class MultiplicationtTable to accept a number to find the table calculation of it till 10.

import java.util.Scanner;

public class MultiplicationtTable {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no: ");
        int num=sc.nextInt();
        for(int i=1;i<=10;i++){
            int multi=i*num;
            System.out.println(i+"*"+num+"="+multi);
        }
    }
}
