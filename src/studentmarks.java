import java.util.Scanner ;
public class studentmarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the physics marks ");
        int a = sc.nextInt();
        System.out.println("enter the chemistry marks");
        int b = sc.nextInt();
        System.out.println("enter the maths marks ");
        int c = sc.nextInt();
        float avg = ((a + b + c) / 3);
        System.out.println("your percentage is " + avg);
        if (avg >= 70) {
            System.out.println(" and , you have got A grade");
        } else if (avg < 70 && avg >= 50) {
            System.out.println("and , you have got B grade");}
        else{
                System.out.println("so sorry to tell u  that u r fail , work hard more");
            }

        }
    }

