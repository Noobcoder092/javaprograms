import java.util.Scanner;

public class HCF_and_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int n1 = sc.nextInt();
        System.out.println("Enter second number");
        int n2 = sc.nextInt();
        int temp1 = n1;
        int temp2 = n2;
        int remainder;
        if (n1 < n2) {
            while (n2 % n1 != 0) {
                remainder = n2 % n1;
                n1 = remainder;
                n2 = n1;
            }
            System.out.println("HCF IS :" + n1);
            //FORMULA FOR CALCULATING LCM
            int lcm = (temp1 * temp2) / n1;   // BECOZ N1 ND N2 ARE CHANGED THROUGHOUT THE PROGRAM
            System.out.println("LCM IS :" + lcm);
        }
        else{
            System.out.println("Please enter \"n1\" smaller than n2");
        }
    }
}