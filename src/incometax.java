import java.util.Scanner ;
public class incometax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your annual salary");
        double income = sc.nextDouble();
        double tax = 0;
        if (income <=250000)
        {
            System.out.println("no need to pay tax");
        }
        else if (income > 250000 && income <= 500000)
        {
            tax = tax + 0.05 * (income - 2.5f);
            System.out.println("your tax is " + tax);
        }
        else if (income > 500000 && income <= 1000000)
        {
            tax = tax + 0.05 * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 5f);
            System.out.println("your tax is " + tax);
        }
        else if (income>1000000)
        {
            tax = tax + 0.05 * (5.0f - 2.5f);
            tax = tax + 0.02f * (10.0 - 5f);
            tax = tax + 0.3f * (income - 10.0f);
            System.out.println("your tax is " + tax);
        }
    }
}