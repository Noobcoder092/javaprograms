import java.util.Scanner;

public class Array_elements_lar_small_no_SUM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array");
        int size=sc.nextInt();
        int array[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("enter the "+i+" element of array ");
            array[i]=sc.nextInt();
        }
        int max= Integer.MIN_VALUE;
        for( int j=0;j<size;j++) {
            if (array[j] > max) {
                max = array[j];
            }
        }
            System.out.println("The largest number in the array is : " +max);
        int min= Integer.MAX_VALUE;
        for( int j=0;j<size;j++) {
            if (array[j]< min) {
                min = array[j];
            }
        }
        System.out.println("The minimum number in the array is : " +min);
        int sum=min+max ;
        System.out.println("And, there sum is : " +sum);
    }
}
