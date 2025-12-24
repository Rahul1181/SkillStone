//28. Write a class ConsCallmeth and call add() method from the constructor of the class and display the addition of two values.

import java.util.Scanner;

public class ConsCallmeth {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of a and b: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        solve addition=new solve();
        addition.add(num1,num2);

    }
}
class solve {
    public void add(int num1,int num2){
        System.out.println("The output is: "+ (num1+num2));
    }

}
