interface bicycle{              //  FIRST INTERFACE
     void main();
     void main2();
}
interface bike{                  // SECOND INTERFACE
    void main3();
    void main4();
}
class  cycle implements bicycle ,bike{    // CYCLE CLASS IMPLEMENTING METHODS OF BOTH INTERFACES :  MULTIPLE INHERITANCE
    public void main(){
        System.out.println("i'm  riding bicycle ");
    }
    public void main2(){                          // HAVE TO MAKE METHOD PUBLIC  : COMPULSORY
        System.out.println("bicycle repairing");
    }
    public void main3(){
        System.out.println("now ,i'm riding bike");
    }
    public void main4(){                          // HAVE TO MAKE METHOD PUBLIC  : COMPULSORY
        System.out.println("bike repairing");
    }
//    public int mains(){
//        int a=8;                      CONCRETE METHOD
//        int b=7;
//        return a+b;
//   }
}
public class Interface {
    public static void main(String[] args) {
        cycle obj =new cycle();
        obj.main();
        obj.main2();
        obj.main3();
        obj.main4();
//        System.out.println("add: " +obj.mains());
    }
}
