public class MDclass {
    public static void main(String[] args) {
        int[][][] array={{{1,2,3,4,5},{5,4,3,2,1},{6,7,8,9,0}}};  // add 3 {{{ for 3d array .
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {   //take i and j both becoz k is contained in j and j is contained in i
                    System.out.print(array[i][j][k]);
                    System.out.print(" ");
                }
                System.out.println("");
            }
        }
    }
}

