//7. Write a Program to print the largest element in an array.

import java.util.Arrays;
import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int arrsize = sc.nextInt();
        int arr[] = new int[arrsize];
        System.out.println("Enter the elements for array 1: ");
        for (int i = 0; i < arrsize; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("Largest Element of an array: ");
        System.out.print(arr[arrsize - 1]);

    }
}