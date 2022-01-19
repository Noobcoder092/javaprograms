import java.util.Scanner;

public class Prime_no_between_a_and_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int a=sc.nextInt();
        System.out.println("enter second number");
        int b=sc.nextInt();
        int temp=0 ;
        System.out.println("your prime numbers bewteen a and b are :");
        for(int i=a;i<=b;i++){
            {
                for(int j=2;j<=(i-1);j++){
                    if(i%j==0){
                        temp=temp+1;
                    }
                }
                if(temp==0){
                    System.out.println(i);
                }
                else{
                    temp=0;
                }
            }
        }
    }
}
