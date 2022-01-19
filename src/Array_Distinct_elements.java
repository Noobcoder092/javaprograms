import java.util.HashSet;
import java.util.Scanner;

public class Array_Distinct_elements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size = sc.nextInt();
        int array[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("enter the "+i+" element ");
            array[i]=sc.nextInt();
        }
        HashSet<Integer> hash=new HashSet<>();
        System.out.println("Distinct elements are :");
        for(int i=0;i<size;i++){
            if(!hash.contains(array[i])){   // CHUTIYA LOGIC , REFER TO MY LOGIC IH DISTINCT.JAVA
                hash.add(array[i]);
                System.out.print(array[i] +" ");
            }
        }
    }
}
