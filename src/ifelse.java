import java.util.Scanner ;
public class ifelse {
    public static void main(String[] args) {
         Scanner Sc =new Scanner(System.in);
        System.out.println("enter the age");
        int a=Sc.nextInt();
        if(a>=18){
            System.out.println("your are an adult");
        }
        else {
            System.out.println("your r still virgin");
        }

    }
}
