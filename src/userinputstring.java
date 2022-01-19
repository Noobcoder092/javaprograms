import java.util.Scanner ;
public class userinputstring {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        String []input=new String[4];
        System.out.println("enter the string elements");
        for(int i=0;i<4;i++){
            input[i]=Sc.nextLine();
        }
        System.out.println("the 2nd index string is " +input[2]);
    }
}
