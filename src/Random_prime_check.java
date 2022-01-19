import java.util.*;

public class Random_prime_check {
    public static void main(String[] args) {
        System.out.println("enter the number to check whether it's prime or not ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 2, remain = 0;
        while (i <= (num - 1)) {
            if (num % i == 0) {
                remain = remain + 1;   //if i'll insert under this for loop , it will become a infinite loop
            }                           // that's why using "remain" VARIABLE .
            i++;
        }
        if (remain > 0) {
            System.out.println("it's not  a prime number");
        } else {
            System.out.println("it's  a prime number ");
        }
    }
}

