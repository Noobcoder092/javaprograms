                                    // LOOP PATTERN TO PRINT 2,5,8,11,14..........
import java.util.Scanner;

public class Loop_pattern2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the starting  number");
        int a = sc.nextInt();

        for(int i=0;i<=6;i++){
            System.out.println(a);
            a=a+3;
       }
    }
}
