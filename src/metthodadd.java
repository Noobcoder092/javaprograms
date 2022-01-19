import java.util.Scanner ;
public class metthodadd {
    static int add(int x,int y){   // METHOD PROTOTYPE
        int c =x+y ;     // METHOD DEFINITION
        return  c;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a ,b,sum ;
        System.out.println("enter the first number ");
        a = sc.nextInt();
        System.out.println("enter the second number ");
        b=sc.nextInt();
        sum =add(a,b);   // METHOD CALL
        System.out.println("the addition is : "+sum);
    }
}
