//13. Write a class FloydExample3 to display the output as below using control structures

import java.util.Scanner;

public class FloydExample3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of Floyd triangle: ");
        int floyd=sc.nextInt();
        for(int i=1;i<=floyd;i++){
            for(int j=1;j<=i;j++){
                if(j%2==0){
                    System.out.print("1");
                }
                else
                    System.out.print("0");
            }
            System.out.print("\n");
        }
    }
}
