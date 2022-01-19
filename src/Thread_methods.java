class fact extends  Thread {
    public void run() {
        int i = 0;
        while (i < 1000) {
            System.out.println("hello i'm first thread");

//            try {
//                Thread.sleep(500);                    // THREAD.SLEEP() : IT WILL MAKE THE METHOD
//            } catch (InterruptedException e) {            // TO SLEEP FOR 500 MILLISECONDS
//                e.printStackTrace();
//            }
            i++;
        }
    }
}
class fact2 extends Thread{
    public void run(){
        System.out.println(" hello , i'm second thread");
    }
}
public class Thread_methods {
    public static void main(String[] args) {
        fact sc = new fact();
        fact2 sc2=new fact2();
        sc.start();
        try {
            sc.join();   // JOIN METHOD : USED UNDER TRY CATCH
        }
        catch (Exception e){
            System.out.println(e);
        }
        sc2.start();
        System.out.println("and my priority is : " +sc2.getPriority());
        System.out.println("Deamon is  : " +sc2.isDaemon());
        System.out.println("My thread is  : " +sc2.isAlive());

    }
}
