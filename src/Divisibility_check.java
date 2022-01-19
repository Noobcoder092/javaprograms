import java.util.Scanner;

public class Divisibility_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        int sum = 0;
        int i;
        System.out.println("The number which are divisible by both 3 and 5 between "+a+" and "+b+" both are : ");
        for (i = a; i <= b; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println(i);
            }
        }
    }
}