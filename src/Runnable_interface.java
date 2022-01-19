
class kuchbhi  implements  Runnable {
    public void run() {     // RUN METHOD IS COMPULSORY
        int i = 0;
        while (i < 1000) {
            System.out.println("hello i'm having food");
            i++;
        }
    }
}
class kuchbhi2 implements Runnable {
    public void run() {
        int i = 0;
        while (i < 1000) {
            System.out.println("also i'm chatting with my girlfriend");
            i++;
        }
    }
}
    public class Runnable_interface {
        public static void main(String[] args) {
            kuchbhi t1 = new kuchbhi();   // INSTANTIATING THE CLASS IMPLEMENTED FROM RUNNABLE
            Thread obj = new Thread(t1);   // important : Thread constructor

            kuchbhi2 t2 = new kuchbhi2();
            Thread obj2 = new Thread(t2);
//        t1.start();   ----> WRONG
            obj.start();
            obj2.start();
        }
    }
