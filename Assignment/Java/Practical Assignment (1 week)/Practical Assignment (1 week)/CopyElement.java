//6. Write a program to copy all element of one array into another array.

import java.util.Scanner;

public class CopyElement {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int arrsize=sc.nextInt();
        int arr[]=new int[arrsize];
        System.out.println("Enter the elements for array 1: ");
        for(int i=0;i<arrsize;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Elements for array 1: ");
        for(int i=0;i<arrsize;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        System.out.print("Elements of array 2: ");
        int arr2[]=new int[arr.length];
        arr2=arr;
        for(int i=0;i<arrsize;i++){
            System.out.print(arr2[i]+" ");
        }


    }
}
