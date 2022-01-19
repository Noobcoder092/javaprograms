class rock extends Thread{
    rock(String name){
        super(name);
    }
    public void run(){
        while(true){
            System.out.println("This thread has : " +getName());
        }
    }
}
public class Thread_priorities {
    public static void main(String[] args) {
        rock sc=new rock("Maximum priority");
        rock sc2=new rock("Minimum priority");
        rock sc3=new rock("Normal priority");
        rock sc4=new rock("harry4");

        sc.setPriority(Thread.MAX_PRIORITY);
        sc.start();

        sc2.setPriority(Thread.MIN_PRIORITY);
        sc2.start();

        sc3.setPriority(Thread.NORM_PRIORITY);
        sc3.start();

//        sc4.start();
    }
}
