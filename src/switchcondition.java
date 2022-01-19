
import java.util.Scanner ;
public class switchcondition {
    public static void main(String[] args) {
        Scanner Sc =new Scanner(System.in);
        System.out.println("enter the age ");
        int a=Sc.nextInt();
        switch (a) {
            case 1 -> System.out.println("your age is 12");
            case 18 -> System.out.println("your age is 18");    //enhanced switch .
            case 20 -> System.out.println("your age is 20");
            default -> System.out.println("your age does not match in variable a");
        }
    }
}
