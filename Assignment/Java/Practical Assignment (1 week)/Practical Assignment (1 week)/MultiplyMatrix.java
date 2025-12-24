//9. Write a Program to multiple two matrices:
public class MultiplyMatrix {
    public static void main(String[] args){
        int matrix1[][]={
                {1,1,1},{2,2,2},{3,3,3}
        };
        int matrix2[][]={
                {1,1,1},{2,2,2},{3,3,3}
        };
        //Is this ok or not?
        int sum=0;
        System.out.println("Multiplication of matrix: ");
        int[][] matrix=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    sum=sum+matrix1[i][k]*matrix2[k][j];
                }
                matrix[i][j]=sum;
                sum=0;
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
/*Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no of rows: ");
        int rows=sc.nextInt();
        System.out.println("Enter the no of cols: ");
        int cols=sc.nextInt();
int matrix1[][]=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the elements of matrix2: ");
        int matrix2[][]=new int[rows][cols];
        for(int i=0;i<cols;i++){
            for(int j=0;j<rows;j++){
                matrix2[i][j]=sc.nextInt();
            }
        }*/