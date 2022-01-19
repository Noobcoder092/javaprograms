import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter the number to check palindrome or not ");
        Scanner sc= new Scanner(System.in);
        int number=sc.nextInt();
        int temp = number;    // my input number will be stored in a fixed variable , so that i can compare it with the newer one .
        int remainder , reverse =0;
        while(number !=0){
            remainder=number % 10 ;
            reverse = reverse * 10 +remainder;
            number= number / 10 ;
        }
        System.out.println("The reversed number is  : "+reverse);
        if(temp == reverse){
            System.out.println("it's a palindrome");
        }
        else{
            System.out.println("it's not a palindrome");
        }
    }
}
