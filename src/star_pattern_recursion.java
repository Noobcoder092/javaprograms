import java.util.Scanner ;
public class star_pattern_recursion {
    static int star(int n) {
        if (n > 0) {
            star(n - 1);
            for (int i = 1; i <= n; i++) {
                    System.out.print(" * ");
                }
                System.out .println("");
            }
        return n;
    }
        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the numbers of rows u want in your star pattern ");
            int a = sc.nextInt();
            star(a);
        }
}

