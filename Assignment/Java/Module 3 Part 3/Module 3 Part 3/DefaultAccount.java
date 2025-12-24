//27. Write a class DefaultAccount to display the account details already assigned using default constructor
import java.util.Scanner;

public class DefaultAccount {
    public DefaultAccount() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter account Number: ");
        long accountNumber=sc.nextLong();
        sc.nextLine();
        System.out.print("Enter your name: ");
        String name=sc.nextLine();
        System.out.print("Enter your Address: ");
        String address=sc.nextLine();
        System.out.println("Account Number: "+ accountNumber+"\n Name: "+name+"\n Address: "+address);
    }
    public static void main(String[] args){
        DefaultAccount acc=new DefaultAccount();

    }
}
