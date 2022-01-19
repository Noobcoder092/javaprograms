import java.util.Scanner ;
public class loop {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter the number");
        int a = Sc.nextInt();
        for (int i = a; i <= 10; i++) {
            System.out.println(a);
        }


//        while(a<=100){
//            System.out.println(a);
//            a++;

//            do{
//                System.out.println(a);
//                if(a==3){
//                    break;    //it will break at 3 but 3 will also be printed
//                }
//                a++;
//            }
         //   while(a<=10);  // it always runs one time :)
        }
    }

