import java.util.Scanner ;
public class TABLE_function_iteratively {
    static  int table(int x) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(x+ " X " +i+" = "+x*i);
            //System.out.format("%d x %d = %d\n", x, i, x * i);    // I CAN ALSO USE THIS
        }
        return  x;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number for table ");
        int a= sc.nextInt();
        a=table(a);
    }
}
