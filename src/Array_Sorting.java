import java.util.Scanner;

public class Array_Sorting {
    public static void main(String[] args) {
        System.out.println("Enter the size of an array");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int temp;
        int array[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter the "+i+" array element ");
            array[i]=sc.nextInt();
        }
        for(int i=0;i<size-1;i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[i] > array[j]) {
                    temp=array[i];
                    array[i] = array[j];
                    array[j]=temp;
                }
            }
        }
        System.out.println("Array after sorting is : ");
        for(int j =0;j<size;j++){
            System.out.println(array[j]);
        }
    }
}
