import java.util.Scanner ;
public class sum_of_numbers_using_recursion {
    static int addnumbers(int x){
//    int sum =0;
//    for(int i=1;i<=x;i++){
//        sum+=i;               //ITERATIVE METHOD
//    }
//    return sum;
//    }
        if(x==1){
            return  1 ;
        }                        // RECURSIVE METHOD
        else{
            x= x+addnumbers(x-1);
        }
            return  x;
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number upto which u want to add natural numbers");
        int a= sc.nextInt();
        addnumbers(a);
        System.out.println(" the addition of first natural "+a+" numbers is : "+addnumbers(a));
    }
}
