                                    //  ODD NUMBER PRINTING
import java.util.Scanner;

public class Loop_pattern {
    public static void main(String[] args) {
        System.out.println("Enter the range ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b=sc.nextInt();
        for(int i =a;i<=b;i++){
            if(i%2 !=0){     // odd number
                System.out.println(i);
            }
        }
    }
}
