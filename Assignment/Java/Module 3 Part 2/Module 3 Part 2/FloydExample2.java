//12. Write a program FloydExample3 to display the output as below using control structures
import java.util.Scanner;

public class FloydExample2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=num;j>=i;j--){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
