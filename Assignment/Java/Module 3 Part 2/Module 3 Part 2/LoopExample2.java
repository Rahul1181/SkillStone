//15. Write a class LoopExample2 to display the output as below using control structures

import java.util.Scanner;

public class LoopExample2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of terms: ");
        int items=sc.nextInt();
        int sum=0;
        for(int i=1;i<=items;i++){
            sum+=i;
        }
        System.out.println("Sum of 1st "+items+" is "+sum);
    }
}
