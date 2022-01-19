import java.util.Scanner ;
public class table_recursion {
    static  int table(int x,int i) {
        if (i > 10) {
            return 0;
        } else {
            System.out.println(x + " X " + i + " = " + x * i);
            table(x, i + 1);  // I'M INCREMENTING "I" VALUE , NOW IT WILL BE 5x2 , 5X3,....MEANS CALLING MY METHOD AGAIN.
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number for table ");
        int a= sc.nextInt();
        System.out.println("enter the number from which u want to start your table");
        int i= sc.nextInt();
        table(a,i);
    }
}
