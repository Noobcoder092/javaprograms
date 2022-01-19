import java.util.Scanner ;
public class metthod2 {
    static int greater(int x, int y) {       //function prototype
        if (x > y) {
            System.out.println("a is greater ");
        } else {
            System.out.println("b is greater");
        }
        return 0;
    }
        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the number a ");
            int a = sc.nextInt() ;
            System.out.println("enter the second number b ");
            int b = sc.nextInt();
            greater(a,b);   //  function call


        }
    }

