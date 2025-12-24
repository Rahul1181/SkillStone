//11. Java program to find the duplicate characters in a string.
import java.util.Scanner;

public class FindDuplicateString {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int count=0;
        System.out.print("Enter the String: ");
        String str=sc.nextLine();
        str=str.toUpperCase(); //So that character either in upper or lowercase are considered equally
        char temp[]=str.toCharArray();// Converts string to array
        System.out.print("The duplicate numbers are: ");
        for(int i=0;i<temp.length;i++){
            count=1;
            for(int j=i+1;j<temp.length;j++){ //Every time index is increased j value is taken after that
                if(temp[i]==temp[j] && temp[i]!=' '){//Here we find the duplicates
                    count++;
                    temp[j]='0';
                }
            }
            if(count>1 && temp[i]!='0'){
                System.out.print(temp[i]);
                }
            }
        }
}

