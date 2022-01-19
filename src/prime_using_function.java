import java.util.*;
public class prime_using_function {
    public static void prime(int n){
        int i = 2, remain = 0;
        while (i <= (n - 1)) {
            if (n % i == 0) {
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
    public static void main(String[] args) {
        System.out.println("enter number to check whether it's prime or not ");
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        prime(a);
        prime(b);
    }
}
