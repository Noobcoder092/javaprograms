import java.util.Scanner;

public class NUmber_digits_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int sum=0;
        int remainder,result=0;
        while(num!=0){
            remainder=num%10;
            result+=remainder;
            num=num/10;
        }
        System.out.println("sum of the digits of given number is :" +result);
    }
}
