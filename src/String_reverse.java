import java.util.Scanner;

public class String_reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string ");
        String one =sc.nextLine();
        int length=one.length();
        String reverse="";             // DON'T ASSIGN "NULL" OTHERWISE IT WILL GIVE NUL+REVERSE;
        for(int i=length-1;i>=0;i--){
            reverse+=one.charAt(i);
        }
        System.out.println("Your reversed string is : " +reverse);
    }
}
