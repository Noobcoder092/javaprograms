class modifiers{
    public int a =5;
    protected int b =6;
    int c=7;
    private int d=8;
    public  void meth1(){
        System.out.println("the value of a is : "+a);
        System.out.println("the value of a is : "+b);
        System.out.println("the value of a is : "+c);
        System.out.println("the value of a is : "+d);
    }
}
public class Access_modifiers {
    public static void main(String[] args) {

        //WITHIN SAME CLASS
        modifiers obj=new modifiers();
        obj.meth1();

        // WITHIN SAME PACKAGE
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
       // System.out.println(obj.d);  PRIVATE  : NOT ACCESSIBLE IN THE SAME PACKAGE
    }
}
