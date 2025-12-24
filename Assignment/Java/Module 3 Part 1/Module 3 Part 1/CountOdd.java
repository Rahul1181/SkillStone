//6. Write a class CountOdd -  to count the odd and even numbers using control structures and arrays

import java.util.Scanner;

public class CountOdd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int arrsize=sc.nextInt();
        int arr[]=new int[arrsize];
        int even=0, odd=0;
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if(arr[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("No of even: "+even);
        System.out.println("No of odd: "+odd);

    }

}
