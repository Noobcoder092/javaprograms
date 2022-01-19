import java.util.Scanner ;
public class percentagecalculator {
    public static void main(String[] args) {
          Scanner Sc=new Scanner(System.in);
         System.out.println("enter the marks 1");
        int a=Sc.nextInt();
        System.out.println("enter the second marks");
        int b=Sc.nextInt();
        System.out.println("enter the third marks");
        int c=Sc.nextInt();
        System.out.println("enter the fourth marks");
        int d=Sc.nextInt();
        System.out.println("enter the fifth marks");
        int e=Sc.nextInt();
        float sum = (a+b+c+d+e) ;
        float percent =(sum/500)*100 ;
        System.out.println("the percentage of student is "+percent);


//        System.out.println("enter the marks 1");
//        boolean b1=Sc.hasNextInt();     to check whether an entered input has integer or not .
//        System.out.println(b1);
            }
}
