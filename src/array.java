import  java.util.Scanner ;
public class array {
    public static void main(String[] args) {
        // Scanner Sc=new Scanner(System.in) ;
      //  System.out.println("enter the array elements ");
//        int []array =new int[5];  //taking array as an input
//        for(int i=0;i<5;i++) {
//            array[i]=Sc.nextInt();
//        }
//        System.out.println("the array element at 3rd index is " +array[3]);

       int [] marks ={1,2,3,4,5};
//       for(int i=0;i<marks.length;i++) {
//           System.out.println("the element is " +marks[i]);
//       }

//      //ACCESSING  IN REVERSE ORDER
//        for(int i=marks.length-1;i>=0;i--) {
//            System.out.println("the element is " +marks[i]);
//        }

        // ACCESSING THROUGH FOR-EACH LOOP
        for(int arrayelements : marks ) {
            System.out.println("the array elements are " +arrayelements);
        }
    }
}
