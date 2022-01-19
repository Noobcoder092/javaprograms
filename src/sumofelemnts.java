import java.util.Scanner;
public class sumofelemnts {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        int i=sc.nextInt();
        System.out.println("enter the second number");
        int b=sc.nextInt();
       int  add=0;
       while(i<=b){
           add=add+i;
           i++;
       }
        System.out.println("the addition is "+ add);
    }
}
