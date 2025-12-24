//10. Write a program to replace lower-case characters with upper-case and vice-versa GrEAt ResPOnsibiliTY.

import java.util.Scanner;

public class ToReplace {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str=sc.nextLine();
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
    }
}
