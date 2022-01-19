class pen extends  Thread {
    public pen(String name) {
        super(name);
    }
}
    public class Thread_constructor3 {
        public static void main(String[] args) {
            pen sc = new pen("harry");
            pen sc2 = new pen("harry2");
            pen sc3 = new pen("harry3");
            pen sc4 = new pen("harry4");

            System.out.println("the id of thread is : " + sc.getId());
            System.out.println("the name of thread is : " + sc.getName());
            System.out.println("the id of thread is : " + sc2.getId());
            System.out.println("the name of thread is : " + sc2.getName());
            System.out.println("the id of thread is : " + sc3.getId());
            System.out.println("the name of thread is : " + sc3.getName());
            System.out.println("the id of thread is : " + sc4.getId());
            System.out.println("the name of thread is : " + sc4.getName());
        }
    }
