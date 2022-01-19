import java.util.Scanner;

public class Smallest_array_element {
    public static void main(String[] args) {
        System.out.println("Enter the size of an array");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int array[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter the element :" +i);
            array[i]=sc.nextInt();
        }
        int maxValue= Integer.MAX_VALUE;
        for(int element:array){
            if(element<maxValue){
                maxValue=element;
            }
        }
        System.out.println("The minimum value in the array is : " +maxValue);
    }
}
