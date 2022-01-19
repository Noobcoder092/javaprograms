import java .util.*;
public class Ascii_values {
    public static void main(String[] args) {
        System.out.println("Enter the alphabet or number or special symbol ");
        Scanner sc = new Scanner(System.in);
        char a= sc.next().charAt(0);    // SARA KHEL ISKA HAI ,  THIS IS VERY IMPORTANT WHEN YOUR ARE TAKING OPERATOR AS AN INPUT
        if(a >= 65 && a<=90){
            System.out.println("it's an uppercase letter");
        }
        else if(a>=97 && a<=122){
            System.out.println("it's a lowercase character");
        }
        else if(a>= 48 && a<=57){
            System.out.println("it's a digit ");
        }
        else{
            System.out.println("it's a special symbol");
        }
    }
}
