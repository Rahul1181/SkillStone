//23. Write a  class TwoArray to accept the number of rows and columns and array values, and
// display it all using control structures and array objects.

import java.util.Scanner;

public class TwoArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no of rows and columns: ");
        int rows=sc.nextInt();
        int col=sc.nextInt();
        //TwoArray arrayObj[][]=new TwoArray[rows][col];

        int arr[][]=new int[rows][col];
        for(int i=0;i<rows;i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter the number: ");
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

