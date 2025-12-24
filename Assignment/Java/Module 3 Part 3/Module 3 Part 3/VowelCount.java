//25. Write a class VowelCount to accept a character and display it vowel or not.
import java.util.Scanner;

public class VowelCount {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character: ");
        char val=sc.next().charAt(0);
        //How can I use equalsIgnore Case?
        if(val== 'a' || val=='e' || val=='i' || val=='o' || val=='u'){
            System.out.println("It is a vowel");
        }
        else
            System.out.println("It is not a vowel");

    }
}
