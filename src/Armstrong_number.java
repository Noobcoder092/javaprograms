import java.util.Scanner;

public class Armstrong_number {
    public static void main(String[] args) {
        System.out.println("Enter the number to check whether it's armstrong or not");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int temp =num ;
        int remainder ,result=0;
        while(num!=0){
            remainder =num%10;
            result=result+(remainder*remainder*remainder);
            num=num/10;
        }
        System.out.println("the resultant number is : "+result);
        if(result==temp){
            System.out.println("And it's an armstrong number");
        }
        else{
            System.out.println("And it's not an armstrong number");
        }
    }
}
