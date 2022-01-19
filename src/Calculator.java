import java.util.Scanner;

class calci{
    int a;
    int b;
    public void meth(){
        System.out.println("------THANK YOU , NOW CHOSE YOUR OPERATION ----------");
        System.out.println(" (+) ");
        System.out.println(" (-) ");
        System.out.println(" (*) ");
        System.out.println(" (/) ");
    }
}
public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER FIRST NUMBER");
        int a= sc.nextInt();
        System.out.println("ENTER SECOND NUMBER");
        int b=sc.nextInt();
        calci obj=new calci();
        obj.meth();
        char n=sc.next().charAt(0);   // THIS IS VERY IMPORTANT WHEN YOUR ARE TAKING OPERATOR AS AN INPUT
        switch (n){
            case '+' : int value=a+b;
                System.out.println(value);
            break;
            case '-' :  value=a-b;
                System.out.println(value);
            break;
            case '*' : value =a*b;
                System.out.println(value);
            break;
            case '/' : value=a/b;
                System.out.println(value);
            break;
            default :
                System.out.println("Please enter a valid operation");
        }
        }
    }
