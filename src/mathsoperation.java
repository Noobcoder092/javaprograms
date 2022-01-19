import  java.util.Scanner ;
public class mathsoperation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a ");
        int a =sc.nextInt();
        System.out.println("enter the value of b ");
        int b=sc.nextInt();
        int sum =a+b;
        int sub=a-b;
        int mult=a*b;
        float div=a/b;
        System.out.println("sum :"+sum);
        System.out.println("sub :"+sub);
        System.out.println("mult :"+mult);
        System.out.println("div :"+div);
    }
}