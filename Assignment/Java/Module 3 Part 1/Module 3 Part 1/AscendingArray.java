//7. Write a class AscendingArray to sort the array values using control structures
import java.util.Arrays;
import java.util.Scanner;

public class AscendingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int arrsize = sc.nextInt();
        int element[] = new int[arrsize];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < element.length; i++) {
            element[i] = sc.nextInt();
        }
        System.out.println("Enter the number to perform function: \n 1-->Ascending 2-->Descending");
        int num = sc.nextInt();
        if (num == 1) {
            Arrays.sort(element);
            for (int i = 0; i < arrsize; i++) {
                System.out.println("Ascending order is: " + element[i]);
            }
        } else if (num == 2) {
            int[] b = new int[arrsize];
            Arrays.sort(b);
            int j = arrsize;
            for (int i = 0; i < arrsize; i++) {
                b[j - 1] = element[i];
                j = j - 1;
            }
            System.out.println("Descending array is: \n");
            for (int k = 0; k < arrsize; k++) {
                System.out.println(b[k]);
            }
            /*for (int i = 0; i < element.length; i++) {
                if (element[i] < element[i + 1]) {
                    int temp = element[i];
                    element[i + 1] = temp;
                    element[i] = element[i + 1];
                    System.out.println("Descending order is: " + element[i]);
                }
            }*/
        }
    }
}
