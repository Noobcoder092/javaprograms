import java.util.Scanner;
                                        // 0 , 1 , 1 , 2 , 3 , 5 , 8 , 13 , 21,..........
public class fibonacci_recursion {
    public static int fibbonacci(int value){
        if(value==0){
            return 0;
        }
        else if(value==1 || value==2){
            return 1;
        }
        else{
            return fibbonacci(value-1)+fibbonacci(value-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the fibonacci number u want to print");
        int num=sc.nextInt();
        fibbonacci(num);
        System.out.println("Your fibbonacci number at "+num+" location is : " +fibbonacci(num));
    }
}
