public class Reversearray {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
//        int temp;
//        for (int i = 0; i < (array1.length / 2); i++) {
//            temp = array1[i];
//            array1[i] = array1[array1.length - i - 1];
//            array1[array1.length - i - 1] = temp;
//        }
//        for (int elements : array1) {
//            System.out.println(elements);
//        }
              //  OR  , ANOTHER METHOD
        
        int size = array1.length;
        int n =Math.floorDiv(size,2);
        int temp ;
        for(int i=0;i<n;i++){
            temp=array1[i];
            array1[i]=array1[size-i-1];
            array1[size-i-1]=temp;
        }
        for(int elements : array1){
            System.out.println(elements);
        }
    }
}
