import java.util.Scanner;

public class Array_reverse {
    public static void main(String[] args) {
        System.out.println("enter the size of the array");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int array[]=new int[size];
        for(int i=0;i<size;i++)
        {
            System.out.println("Enter the "+i+" element " );
            array[i]=sc.nextInt();
        }
        for(int i=0;i<size/2;i++){
            int temp=array[i];
            array[i]=array[size-i-1];  // "i":taken because in the next iteration it will minus 2 , then 3,then 4
            array[size-i-1]=temp;
        }
        System.out.println("The new array after reversing is :");
        for(int element:array){
            System.out.println(element);    // USING FOR EACH LOOP
        }
//        OR ALSO
//        for(int i=0;i<size;i++){
//            System.out.println(array[i]);
        }
    }
