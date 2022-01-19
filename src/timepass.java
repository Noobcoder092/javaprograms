class byju extends  Thread{
    public byju(String name){
      super(name);    // name is in super class
        System.out.println("the name of this thread is " +name);
    }
public void run(){
    System.out.println("hello i'm run method of thread");
}
}
public class timepass {
    public static void main(String[] args) {
    byju sc =new byju("harry");
//        System.out.println("the name is : " +sc.getName());
        System.out.println("the ID is : " +sc.getId());
        sc.start();
    }
}
