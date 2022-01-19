interface harry{
    void meth1();
    void meth2();
}
interface harryson extends  harry{            //  INTERFACE HARRYSON INHERITED FROM ANOTHER HARRY
    int meth3(int a,int b);
    void meth4();
}
class dad implements  harryson{
    public int  meth3(int a,int b){
        return a+b;
    }
    public void meth4(){
        System.out.println("i'm the method 4");
    }
    public void meth2(){
        System.out.println("i'm the method 2");
    }
    public void meth1(){
        System.out.println("i'm the method 1");
    }
}
public class Interface_inheritance {
    public static void main(String[] args) {
        dad obj=new dad();
        System.out.println("Hi i'm method 3 performing Addition of number,  which is  : " +obj.meth3(3,4));
        obj.meth1();
        obj.meth2();
        obj.meth4();
    }
}
