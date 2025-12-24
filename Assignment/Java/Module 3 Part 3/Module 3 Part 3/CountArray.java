//24. Write a class CountArray to accept the values and count the total number of negative and positive numbers and display it separately

import java.util.Scanner;

public class CountArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int size=sc.nextInt();
        System.out.println("Enter the values: ");
        int arr[]= new int[size];
        int positive=0, negative=0;
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
            if(arr[i]>0){
                positive++;
            }
            else{
                negative++;
            }
        }
        System.out.println("No of positive numbers: "+positive);
        System.out.print("No of negative numbers: "+negative);


    }
}

