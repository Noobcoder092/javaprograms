
import java.util.HashSet;
import java.util.Scanner;

public class String_duplicate_elements {
    public static void main(String[] args) {
//        String[] name = {"java", "python", "c", "c++", "java"};
        //LINEAR SEARCH : WORST METHOD
//        for(int i=0;i<= name.length-1;i++){
//            for(int j=i+1;j<= name.length-1;j++){
//                if(name[i]==name[j] && i!=j){
//                    System.out.println("Duplicate is :" +name[i]);
//                }
//            }

        System.out.println("Enter the size of string");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String name[]=new String[size];
        for(int i=0;i<=size-1;i++){
            System.out.println("Enter the "+i+" element");
            name [i]=sc.next();
        }
        // USING HASHSET : which is a class which is used to create mathematical set .
        HashSet<String> same=new HashSet<String>();
        for(String s:name ){
            if(same.add(s)==false){
                System.out.println("Duplicate element is :" +s);
            }
        }
    }
}