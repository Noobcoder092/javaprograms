import java.util.Scanner;
public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number for table");
        int num = sc.nextInt();
        int sum = 0;
        System.out.println("the table of number is :");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num * i);
//            System.out.printf("%d x %d =%d\n" ,num,i,num*i);
        }
//adding the outputs of a table .
        for (int i = 1; i <= 10; i++) {
            sum += num * i;
        }
        System.out.println("And ,the sum is " + sum);
    }
}
