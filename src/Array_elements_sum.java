import java.util.Scanner;

public class Array_elements_sum {
    public static void main(String[] args) {
        System.out.println("enter the size of the array");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int array[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter the elements " +i+ " for sum" );
            array[i]=sc.nextInt();
        }
        double sum=0;
        for(int i=0;i<size;i++){                                   // for(int element :array){
            sum+=array[i];                                          //    sum+=element;
        }                                                           // }
        System.out.println("sum is : " +sum);
        double average =sum/size;
        System.out.println("Average of array numbers is : " +average );

    }
}
