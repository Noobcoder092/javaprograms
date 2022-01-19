                        //  USING "USER - DEFINED" EXCEPTION  WHICH HAS PARAMETERIZED CONSTRUCTOR

import java.util.Scanner;

class zeronumberinputexception extends RuntimeException{    // UNCHECKED EXCEPTION
    zeronumberinputexception(String msg){    // CONSTRUCTOR
        super(msg);
    }
}
public class Throw_and_Throws2 {
    public static void main(String[] args) throws zeronumberinputexception {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int a=sc.nextInt();
        System.out.println("enter second number");
        int b=sc.nextInt();
        int c = a/b;
        try {
            if ((a <= 0) || (b <= 0)) {
                throw new zeronumberinputexception("Please enter a non zero number");
            } else {
                System.out.println("your result is : " + c);
            }
        }
        catch (zeronumberinputexception e){
            System.out.println(e);
//            e.printStackTrace();
        }
        System.out.println("Result calculated successfully");
    }
}
