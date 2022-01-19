import java.util.Scanner;

public class Linera_search {
    public static void main(String[] args) {
        System.out.println("enter the size of an array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the element at index :" + i);
            array[i] = sc.nextInt();
        }
            System.out.println("enter the element u want to search");
           int num= sc.nextInt();
            for (int i=0;i<size;i++) {
                if (num == array[i]) {
                    System.out.println("element found at index : " +i);
                }
            }
        }
    }
