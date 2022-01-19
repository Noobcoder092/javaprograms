class practice extends Thread{
    int a;
    public void run() {
        int i=0;                    // THIS PROGRAM IS MY EXPERIMENT .TO CHECK SAME METHOD IN A SAME THREAD .
        while (i<100) {
            System.out.println("Good morning , thread one ");
        i++;
        }
    }
    public void run(int value){
        this.a=value;
        System.out.println("the value is " +value);
    }
}
public class Thread_practice_Set1 {
    public static void main(String[] args) {
        practice sc =new practice();
       try {
           sc.join() ;     // NO OUTPUT
//           sc.start();     INDIRECT WAY  :  SEE ABOVE , BOTH METHOD IN SAME CLASS
       }
       catch (Exception e){
           System.out.println(e);
       }
        sc.run(23);
    }
}
