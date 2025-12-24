//11. Write a class FloydExample1 to display the output as below using control structures
import java.util.Scanner;

public class FloydExample1 {
    public static void main(String[] args){
        System.out.print("Enter the number :");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        for(int i=1;i<=num1;i++){
            for(int j=0;j<=i;j++){
                System.out.print(i);
            }
            System.out.print("\n");
        }
    }
}
