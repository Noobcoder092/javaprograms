class cellphone{
    public void ring(){
        System.out.println("ringing....");
    }
    public void call(){
        System.out.println("calling......");
    }
    public void talk(){
        System.out.println("now we've started talking.....");
    }
}
public class method_q2 {
    public static void main(String[] args) {
        cellphone mobile =new cellphone();
        mobile.ring();
        mobile.call();
        mobile.talk();
    }
}
