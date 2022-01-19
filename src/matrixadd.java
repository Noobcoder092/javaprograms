public class matrixadd {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};           // ADDING A MATRIX
        int[] array3= new int[3];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                array3[i] = array1[i] + array2[j];
            }
            System.out.print(  + array3[i]);
            System.out.print(" ");
        }
    }
}

      //  PRINTING A MATRIX
//        for (int i = 0; i < array1.length; i++) {
//            System.out.print(array1[i]);
//            System.out.print(" ");
//        }
//        System.out.println("");
//        for (int j = 0; j < array2.length; j++) {
//                System.out.print(array2[j]);
//            System.out.print(" ");
//            }
//        }
//    }
