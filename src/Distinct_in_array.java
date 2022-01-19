import java.util.HashSet;
import java.util.Scanner;

public class Distinct_in_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array");
        int size=sc.nextInt();
        int array[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter the "+i+" element ");
            array[i]=sc.nextInt();
        }
        System.out.println("Distinct elements present in the array are :");
        HashSet<Integer> hash=new HashSet();
        for(int i=0;i<size;i++){
            hash.add(array[i]);
        }
        System.out.println(hash);
    }
}
