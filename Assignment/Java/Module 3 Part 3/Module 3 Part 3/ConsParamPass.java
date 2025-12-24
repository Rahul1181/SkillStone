//29. Write a class ConsParamPass and create the constructors to accept the parameters to
// find addition and subtraction of any two numbers and display it.
import java.util.Scanner;

public class ConsParamPass {
    public ConsParamPass(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the numbers: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("Additon: "+ (num1+num2));
        System.out.println("Subtraction: "+ (num1-num2));

    }
    public static void main(String [] args){
        ConsParamPass op=new ConsParamPass();

    }
}
