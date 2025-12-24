//2.Print the pattern:
import java.util.Scanner;

public class Pattern2 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            for(int k=1;k<=num-i+1;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
