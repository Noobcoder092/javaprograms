import java.util.Scanner;

public class largest_array_element {
    public static void main(String[] args) {
        System.out.println("enter the size of the array");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int array[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter the element : " +i);
            array[i]=sc.nextInt();
        }
        int num= Integer.MIN_VALUE; // num=0
        for(int element :array){
            if(element<num){
                num=element;
            }
        }
        System.out.println("The largest element in the array is : " +num);
    }
}
