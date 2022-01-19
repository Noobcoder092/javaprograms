import java.util.Scanner ;

public class stringmethod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name of person");
        String name=sc.nextLine();
        System.out.println("enter the place");
        String place =sc.nextLine();

        System.out.println(name+ " from " +place);          //concatenation of string
        System.out.println(name+  " from\" "  +place);  //  " \ " it's a escape sequence character .
        System.out.print("the length of string name is : ");
        System.out.println(name.length());           //tells the string length
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.contains("har"));     //whether my name contains "har" or not
        System.out.println(name.charAt(2));         //character at 2 index
        System.out.println(name.endsWith("ry"));
          System.out.println(name.substring(2));         //print letter from 2nd index to end
          System.out.println(name.substring(1,4));     //print letter from 2nd index to end but excluding end i.e., 4th index
        System.out.println(name.indexOf("r"));         //index starting from
        System.out.println(name.replace("r","p"));     // u know what is it.
           System.out.println(name.equals("Harry")); //it will tell me whether my entered string is equals to harry or not .
           System.out.println(name.equalsIgnoreCase("harry")); //it will ignore case of a letter whether upper or lower , doesn't matter
        System.out.println(name.indexOf("rry",5));    //faltu

    }
}
