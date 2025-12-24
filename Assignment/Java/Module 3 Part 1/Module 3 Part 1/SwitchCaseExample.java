//4. Write a class SwitchCaseExample to display the color using switch ..case..
//Read the character from the user.

import java.util.Scanner;

public class SwitchCaseExample {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("R-->Red \n G-->Green \n B-->Blue");
        System.out.println("Select the letter: ");
        String c=sc.next();
        c.toUpperCase();
        //Here I want ot use equalsIgnoreCase. How?
        switch(c){
            case "R":
                System.out.println("Your favourite color is red");
                break;
            case "G":
                System.out.println("Your favourite color is green");
                break;
            case "B":
                System.out.println("Your favourite color is blue");
                break;

        }
    }
}
