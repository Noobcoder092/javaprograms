import java.util.*;
public class Reverse_a_number {
    public static void main(String[] args) {
        System.out.println("Enter the number to reverse ");
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        int remainder ,reverse=0;
        while(num!=0){
            remainder = num % 10 ;    // QUETION WILL BE  NEW NUMBER
            reverse=reverse * 10 +remainder;    // important logic
            num =num / 10 ;
        }
        System.out.println("the reverse of number is : " +reverse);
    }
}
