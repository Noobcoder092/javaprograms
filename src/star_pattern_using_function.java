import java.util.Scanner;
public class star_pattern_using_function {
        static  void star(int x){
            for(int i=1;i<=x;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(" * ");
                }
                System.out.println();
            }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println(" enter the number of rows for your star pattern");
            int a = sc.nextInt();
            star(a);
        }
    }

