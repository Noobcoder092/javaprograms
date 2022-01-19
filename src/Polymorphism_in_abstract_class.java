abstract class  Telephone{
    abstract void ring();
    abstract  void lift();   // METHODS WITHOUT BODY OR IMPLEMENTATION
    abstract void disconnect();
}
class Smartphone1 extends Telephone{
    void ring(){
        System.out.println("Telephone ringing.....");
    }
    void lift(){
        System.out.println("Lift the telephone in your hand");
    }
    void disconnect(){
        System.out.println("Disconnect the call ");
    }
}

public class Polymorphism_in_abstract_class {
    public static void main(String[] args) {
        Telephone sc=new Smartphone1();   // TELEPHONE INSTANTIATED WITH THE HELP OF SMARTPHONE CLASS
        sc.ring();
        sc.disconnect();
        sc.lift();
    }
}