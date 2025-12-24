//1. Write a class CallByValue to accept two integers from user and swap the values – use call by value
import java.util.Scanner;

public class CallByValue {
    public void fromMethod(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 2 numbers: ");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int temp=x;
        x=y;
        y=temp;
        System.out.println("x="+ x+" y="+y);
    }

public static void main(String[] args){
    CallByValue cv=new CallByValue();
    cv.fromMethod();



}
}
