import java.util.Scanner;

public class User_input_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size");
        int size =sc.nextInt();
        int array[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("enter the element at index :" +i);
            array[i]=sc.nextInt();   //IMPORTANT ONE
        }
        System.out.println("The elements are :");
        for(int i=0;i<size;i++){
            System.out.println(array[i]);
        }
    }
}

