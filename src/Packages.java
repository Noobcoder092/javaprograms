//import  java.util.Scanner;   // java.util = package , Scanner = class

import java.util.*;
public class Packages {
    public static void main(String[] args) {
//        Scanner sc =new Scanner(System.in);
//                    OR , ALSO
       java.util.Scanner sc = new java.util.Scanner(System.in);   // Scanner class object
        int a= sc.nextInt();
        System.out.println("the number i'm taking as an input form the user is : "+a);
    }
}
