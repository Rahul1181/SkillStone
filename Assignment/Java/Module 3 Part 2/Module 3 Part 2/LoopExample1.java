//14. Write a class LoopExample1 to display the output as below using control structures

import java.util.Scanner;

public class LoopExample1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of items: ");
        int items=sc.nextInt();
        for(int i=1;i<=items;i++){
            System.out.println("i ="+i);
        }
    }
}

