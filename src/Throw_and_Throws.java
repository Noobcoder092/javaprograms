                        // USING "USER DEFINED" EXCEPTION WITH NON-PARAMETERIZED CONSTRUCTOR
                        // CALCULATES RADIUS OF GIVEN NUMBER
import java.util.Scanner;

class negativeradiusexception extends Exception{
    @Override
    public String getMessage() {
        return "Radius cannot be negative , please enter a positive value";
    }
}
public class Throw_and_Throws {
    public static double areaofcircle(int r){
    return Math.PI*r*r;
    }
    public static void main(String[] args) throws negativeradiusexception {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius");
        int a =sc.nextInt();
        try {
            if (a < 0) {
                throw new negativeradiusexception();
            } else {
                System.out.println("the area of circle is : " + areaofcircle(a));
            }
        }
        catch (negativeradiusexception e){
            System.out.println(e);
        }
    }
}
