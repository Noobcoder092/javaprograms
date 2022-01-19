
class father1{
     public void meth1(){
        System.out.println("hello , i'm the method of father class");
    }
}
class son1 extends  father1 {
     @Override    // OVERRIDING ANNOTATION
     public void meth1(){        // HERE I'VE CHANGED METHOD1 OF FATHER CLASS IN INHERITED CHILD CLASS
         System.out.println("hey i'm the overridden method of \"father class \" in \"son class\" ");
     }
    public void meth2() {
        System.out.println("hello , i'm the method of son class");
    }
}
public class Method_overriding {
    public static void main(String[] args) {
 //        father1 obj1=new father1();
//        obj1.meth1();
        son1 obj2=new son1();
        obj2.meth1();   // CALLING METHOD 1 WITH OBJECT OF SON CLASS
    }
}
