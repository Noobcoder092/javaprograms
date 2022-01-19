import java.util.*;
public class Nested_try_catch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[4];
        array[0] = 5;
        array[1] = 6;
        array[2] = 7;
        array[3] = 8;
        boolean flag = true;
        while (flag) {
            System.out.println("enter the array index  ");
            int a = sc.nextInt();
            System.out.println("enter the number by which u wanna divide your array number");
            int num = sc.nextInt();
            try {
                try {
                    System.out.println("The number present at this array index is  " + array[a]);
                    System.out.println("And the resultant number after dividing is :  " + array[a] / num);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println(" index error occured ! this index is not present in the array");
                    System.out.println(e);
                }
            } catch (ArithmeticException e) {
                System.out.println(" But ,arithmetic error occured ! try dividing  with different number");
                System.out.println(e);
            } catch (Exception e) {
                System.out.println("Some other exception occured ! ");
            }
        }
        {
            System.out.println("it's executed properly ");
        }
    }
}
