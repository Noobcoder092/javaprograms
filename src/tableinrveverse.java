import java.util.Scanner;
public class tableinrveverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 10;
        System.out.println("enter the number for table ");
        int a = sc.nextInt();
//        while(i>=1){
//            System.out.println(a+" x "+i+" ="+a*i);
//            i--;
//        }
//    }
//}
        do {
            System.out.println(a + " x " + i + " =" + a * i);
            i--;
        }
        while (i >= 1);
    }
}