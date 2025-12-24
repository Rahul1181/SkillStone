//3.Print the pattern.
import java.util.Scanner;

public class Pattern3 {
        public static void main(String [] args){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the number of rows: ");
            int rows=sc.nextInt();
            int k=0;
            for(int i=1;i<=rows*2;i++){
                if(i<=rows)
                    k++;
                else
                    k--;
                for(int j=1;j<=rows*2;j++){
                    if(j>=rows+1-k && j<=rows-1+k)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }

        }
}
