import java.util.Scanner;

public class String_element_present_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String name = sc.nextLine();
        boolean flag = false;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'e') {   // whether "e" is present or not
                flag = true;
                break;
            }
        }
        if(flag){
                System.out.println("letter is present");
            }
        else{
                System.out.println("letter is not present");
            }
        }
    }