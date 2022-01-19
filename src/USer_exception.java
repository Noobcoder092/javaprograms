import java.util.Scanner;

class Myexception extends  Exception{
    @Override
    public String toString() {      // RETURNS A STRING OBJECT CONTAINING DESCRIPTION OF EXCEPTION .
        return "i'm String method()";
    }

    @Override
    public String getMessage() {    // RETURNS A MESSAGE OF THE EXCEPTION
        return "Eligible to vote" ;
    }
}
public class USer_exception {
    public static void main(String[] args)   {
        System.out.println("enter the Age");
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
            try {
                if (a >= 18) {
                    throw new Myexception();
                } else {
                    System.out.println("not eligible to vote");
                }
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
//                System.out.println(e.toString());
//                e.printStackTrace();   // tells us in which line we've error
            }
    }
}
