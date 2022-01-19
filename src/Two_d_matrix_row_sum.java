import java.util.Scanner;

public class Two_d_matrix_row_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows in the matrix");
        int row = sc.nextInt();
        System.out.println("Enter the column in the matrix");
        int column = sc.nextInt();
        System.out.println("Enter the array elements ");
        int array[][] = new int[row][column];
        for (int i = 0; i < row; i++) {                 // ARRAY INPUT
            for (int j = 0; j < column; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {                  // ARRAY OUTPUT IN THE FORM OF MATRIX
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
        int max=0;      // FOR COMPARING ROW SUM  VALUES
        int index=-1;
        for (int i = 0; i < row; i++) {
            int sum_of_rows = 0;
            for (int j = 0; j < column; j++) {
                sum_of_rows = sum_of_rows + array[i][j];   // PRINTING ROW SUM
            }
                System.out.println("Sum of  " + (i + 1) + " row is : " + sum_of_rows);
                if(sum_of_rows>max){    // FOR COMPARING ROW SUM VALUES
                    max=sum_of_rows;
                    index=i+1;
                }
            }
        System.out.println("Row "+index+" is having the maximum sum :"  +max);

        // FOR PRINTING COLUMN SUM

        System.out.println();
        for (int i = 0; i < row; i++) {
            int sum_of_column = 0;
            for (int j = 0; j < column; j++) {
                sum_of_column = sum_of_column + array[j][i];
            }
            System.out.println("Sum of  " + (i + 1) + " column is : " + sum_of_column);
        }
    }
}