import java.util.Scanner;

public class Array_2D_Transpose {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows of an array");
        int row=sc.nextInt();
        System.out.println("Enter the columns of an array");
        int column=sc.nextInt();
        int array[][]=new int[row][column];
        System.out.println("Enter the elements of the matrix :");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){              // TAKING USER INPUT OF MATRIX
                array[i][j]=sc.nextInt();
            }
        }
        System.out.println("your entered matrix is :");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){                  // PRINTING THE MATRIX
                System.out.print(array[i][j] +" ");
            }
            System.out.println();
        }
        int transpose[][]=new int[row][column];         // CREATING AN OTHER MATRIX OF SAME SIZE
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                transpose[i][j]=array[j][i];            // SWAPPING THIS MATRIX WITH THE OLDER ONE
            }
        }
        System.out.println("Transpose of given matrix  is  :");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(transpose[i][j] + " ");   // NOW ,PRINTING THE TRANSPOSE MATRIX
            }
            System.out.println();
        }
    }
}
