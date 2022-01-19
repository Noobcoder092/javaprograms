
import java.util.Scanner ;
public class Factorial_using_recursion {

    static int factorial(int n){
        if(n==0 || n==1){
            return  1;
        }                               // RECURSIVE METHOD
        else{
            return  n=n*factorial(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number for factorial ");
        int a = sc.nextInt();
        factorial(a);
        System.out.println("the factorial of number "+a+" is : " +factorial(a));
    }
}
