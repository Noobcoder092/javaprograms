import java.util.Scanner ;
public class lettercheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the ASCII value of letter");
        int a=sc.nextInt();
        if(a>=65 && a<=90){
            System.out.println("it's an uppercase letter ");
        }
        else if(a>=97&&a<=122){
            System.out.println("it's an lowercase letter");
        }
    }
}
