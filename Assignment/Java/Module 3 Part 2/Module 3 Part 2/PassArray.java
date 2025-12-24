//19. Write a class PassArray to accept an array size and get the array values and use function to display the next number of all array values.

import java.util.Scanner;

public class PassArray {
    static void display(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int arrsize=sc.nextInt();
        int arr[] = new int[arrsize];
        for(int i=0;i<arrsize;i++){
            System.out.println("Enter the number: ");
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<arrsize;j++){
            System.out.println("a["+j+"] ="+(arr[j]+1));
        }
    }
    public static void main(String[] args){
        display();
    }
}

