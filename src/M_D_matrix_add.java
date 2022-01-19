public class M_D_matrix_add {
    public static void main(String[] args) {
        int [][]array1 ={{1,2,3},{3,2,1}};
        int [][]array2={{4,5,6,},{6,5,4}};
        int [][]array3={{0,0,0},{0,0,0}};
        System.out.println("Your corresponding 2d matrix is : ");
        for(int i=0;i<array1.length;i++){
            for (int j=0;j< array2[i].length;j++){   // chosen array2[i] becoz i consists of j and it's J is Under i .
                array3[i][j]= array1[i][j]+array2[i][j];
                System.out.print(+array3[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
