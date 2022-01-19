public class varargs {
    static int  sum (int x, int...arr){             //VAR ARGS , IT WILL TAKE THIS IN , INT []ARR FORM
        int sum =x;
    for(int e :arr){
        sum +=e;
    }
    return sum;
    }
    public static void main(String[] args) {
        int x,y,z,k,i ;
        System.out.println("the sum  is : " +sum(x=4,y=5,z=5,k=5,i=2));
        System.out.println("the sum  is : " +sum(x=2));  // this i've added to take atleast one argument at a time ,
    }                                                   //i.e. int x (see above) ,  otherwise it will print sum=0 ;
}
