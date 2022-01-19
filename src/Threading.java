//   THREAD CLASS : ?? , YOU DON'T NEED TO CREATE A THREAD CLASS , IT'S ALREADY PRESENT
// ALSO , OVERRIDING OF "RUN" METHOD IS MUST , IT IS THE ENTRY POINT FOR THE NEW THREAD .

class MyThread1 extends Thread{
    public void run(){
        int i =0;
        while(i<10000){
            System.out.println("My Cooking Thread is cooking food ");
            i++;
        }
    }
}

class MyThread2 extends Thread{
    public void run(){
        int i =0;
        while(i<10000){
            System.out.println("Thread 2 for Chatting with her girlfriend");
            i++;
        }
    }
}

public class Threading {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();  // START METHOD WILL AUTOMATICALLY INVOKE THE RUN METHOD
        t2.start();
    }
}
