
import java.util.Scanner ;
public class functioncalling {
     static void functioncalling(String name) {          //function prototype
        System.out.println(name);
    }
    public static void main(String[] args) {
        Scanner calling =new Scanner (System.in);
        System.out.println("enter the name ");
        String name = calling.nextLine();
        functioncalling(name);                 //function calling
    }
}
