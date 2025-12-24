//Write a class Overload contains add() which accepts different parameters to explain the overloading.

import java.util.Scanner;

public class Overload {
    public void add(int num1, int num2){
        System.out.println("Sum of 2 int values: "+(num1+num2));

    }
    public void add(float num3, float num4){
        System.out.println("Sum of 2 float values: "+(num3+num4));
    }

    public void add(double num5, double num6, double num7){
        System.out.println("Sum of Double: "+(num5+num6+num7));
    }
    public void add(String firstname, String lastname){
        System.out.println("Concatenated String: "+firstname+" "+lastname);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the two integers: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.print("Enter 2 float values: ");
        float num3=sc.nextFloat();
        float num4=sc.nextFloat();
        System.out.print("Enter 3 double values: ");
        double num5=sc.nextDouble();
        double num6=sc.nextDouble();
        double num7=sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter first name: ");
        String firstname=sc.nextLine();
        System.out.print("Enter Last name: ");
        String lastname=sc.nextLine();
        Overload ol=new Overload();
        ol.add(num1,num2);
        ol.add(num3, num4);
        ol.add(num5, num6, num7);
        ol.add(firstname, lastname);





    }
}
