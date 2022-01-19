
import java.util.Date;

public class Date_class {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());   // time in ms from 1 jan 1970

        Date today= new Date();
        System.out.println(today);   // TODAY'S DATE AND CURRENT TIME
        System.out.println(today.getTime());

        // AND , ANY MORE METHODS
    }
}
