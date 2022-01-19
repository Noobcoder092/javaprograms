class overload{
    public int  meth1() {
        int a = 4;
        int b = 4;                  // NON-STATIC METHOD OVERLOADING IN CLASS
        return a + b;
    }
        public int meth1(int x,int y){
            return  x-y;
        }
    }
public class Method_overloading {
//    static  int  add(int a, int b){   // NAME SAME BUT IT PERFORMS DIFFERENT OPERATION
//        int sub;
//        sub = a-b;
//        return sub;                   // STATIC METHOD OVERLOADING
//    }
//    static int add(int a, int b, int c){
//        int sum;
//        sum=a+b+c;
//        return sum;
//    }
    public static void main(String[] args) {
//        int addition=0;
//       addition= add(3,2);    // THIS IS PERFORMING SUBTRACTION
//        System.out.println("ṬHE SUBTRACTION OF  NUMBERS  IS : " +addition);
//      addition= add(4,5,6);  // AND THIS IS PERFORMING ADDITION
//        System.out.println("ṬHE ADDITION OF  NUMBERS IS : " +addition);
        overload sc=new overload();
        System.out.println("sum :" +sc.meth1());
         System.out.println("sub :"+sc.meth1(3,5));
    }
}
