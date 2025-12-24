import java.util.Scanner;

public class CallByObject {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values of A and B :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("After swapping A= "+a+ " B= "+b);

    }

}
