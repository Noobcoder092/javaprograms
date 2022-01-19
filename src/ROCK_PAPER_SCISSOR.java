import java.util.Scanner;
import java.util.Random;
public class ROCK_PAPER_SCISSOR {
    public static void main(String[] args) {
//        0 ==ROCK
//        1 = PAPER
//        2 = SCISSOR
        System.out.println(" Enter 0 for Rock , 1 for paper , 2 for Scissor");
        Random number = new Random();
        int computernumber = number.nextInt(3);  // COMPUTER WILL ONLY CHOOSE B/W 0-2
        Scanner sc = new Scanner(System.in);
        int userinput = sc.nextInt();
        if (userinput == 0 && computernumber == 2 && userinput == 1 &&
                       computernumber == 0 || userinput == 2 && computernumber == 1) {
            System.out.println("YOU WIN");
        } else if(computernumber==userinput){
            System.out.println("DRAW");
        }
        else {
            System.out.println("COMPUTER WINS");
        }
        if (computernumber == 0) {
            System.out.println("COMPUTER CHOSE : ROCK ");
        } else if (computernumber == 1) {
            System.out.println("COMPUTER CHOSE : PAPER");
        } else {
            System.out.println("COMPUTER CHOSE : SCISSOR");
        }
    }
}