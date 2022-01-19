
import java.util.Random;
import java.util.Scanner;

public class GUESS_THE_NUMBER {
    public static void main(String[] args) {
        System.out.println("Computer has chosen a random number from 0 to 100");
        System.out.println("You have to guess in n attempts , START GUESSING ");
        Random  k=new Random();
        int random_number=k.nextInt(100);
        int i=1;
        int my_number;
        do {
            Scanner sc=new Scanner(System.in);
             my_number= sc.nextInt();
            if(random_number>my_number){
                System.out.println("HIGHER NUMBER PLEASE !");
            }
            else  if(random_number<my_number){
                System.out.println("LOWER NUMBER PLEASE !");
            }
            else {
                System.out.println("congratulation you guessed it in "+i+" attempts ");
            }
            i++;
        }
        while (random_number !=my_number);
        System.out.println("The random number is also : " +random_number);
    }
}