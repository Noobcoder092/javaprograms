import java.util.Scanner;

public class Array_arrange_half_ascend_descend {
    public static void main(String[] args) {
        System.out.println("Enter the size of an array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the " + i + " element of an array");
            array[i] = sc.nextInt();
        }
        if (size <= 0) {
            System.out.println("Enter array size greater than 0");
            return;
        }
        for(int i=0;i<size-1;i++){
            for(int j=i+1;j<size;j++){
                if(array[i]>array[j]){
                    int temp =array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        System.out.println("Array after sorting in ascending and descending order is :");
        for(int j=0;j<=size/2;j++){
            System.out.print( array[j] );
        }
        for(int k=size-1;k>(size/2);k--){
            System.out.print( array[k] );
        }
    }
}