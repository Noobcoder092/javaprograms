interface  Mycamera {                    //INTERFACE ONE
    void meth1();

    private void greet() {              // PRIVATE METHOD CREATION
        System.out.println("goodmorning......");
    }
    default void meth7() {                  // DEFAULT METHOD CREATION
        greet();
        System.out.println("recording........");
    }
}
interface  MYwifi {                      // INTERFACE TWO
    void meth2();
}

class phone1 {                            // CLASS ONE
    public void meth3() {
        System.out.println("hello i'm the method of phone class");
    }

    public int meth4(int x, int y) {
//        int a = 5;
//        int b = 3;
        return x + y;
    }
}
    class Smartphone extends phone1 implements Mycamera, MYwifi {
        public void meth1() {
            System.out.println("HELLO I'M CAMERA METHOD 1");
        }
        public void meth2() {
            System.out.println("HELLO I'M WIFI METHOD 2");
        }
        public int meth4(int x,int y){
            return x+y;
        }
    }
    public class Default_method {
        public static void main(String[] args) {
            Smartphone obj = new Smartphone();
            System.out.println("Sum : "+obj.meth4(2,3));
            obj.meth1();
            obj.meth2();
            obj.meth3();
            obj.meth7();   // CALLING DEFAULT METHOD MADE UNDER INTERFACE ITSELF  .
        }
    }

