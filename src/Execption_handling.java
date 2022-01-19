import java.util.*;
public class Execption_handling {
    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []array =new int[4];
        array[0]=5;
        array[1]=6;
        array[2]=7;
        array[3]=8;
        boolean flag =true ;
        while(flag) {
            System.out.println("enter the valid array index  ");
            int a = sc.nextInt();
            System.out.println("enter the number by which u wanna divide your array number");
            int num = sc.nextInt();
            try {
                System.out.println("the number present at this array index is :" + array[a]);
                System.out.println("the resultant number  is :  " + array[a] / num);
                flag=false;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(" index error occuerd ! this index is not present in the array");
                System.out.println(e);
            } catch (ArithmeticException e) {
                System.out.println(" arithmetic error occured ! try with different number");
                System.out.println(e);
            } catch (Exception e) {
                System.out.println("Some other exception occured ! ");
            }
        }
        }
    }
