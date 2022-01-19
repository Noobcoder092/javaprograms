public class Non_static_method {
        public int add(int x,int y) {     // NO "STATIC" KEYWORD IS USED
            int sum = 0;
            if (x > y) {
                sum = x + y;
                System.out.println(" sum = :" + sum);
            } else {
                sum = x - y;
                System.out.println("sum = " + sum);
            }
            return sum;
        }
        public int sub(int x,int y){
            int sum = 0;
            if (x > y) {
                sum = x - y;
                System.out.println(" sum = :" + sum);
            } else {
                sum = x + y;
                System.out.println("sum = " + sum);
            }
            return sum;
        }
    public static void main(String[] args) {
        Non_static_method sc=new Non_static_method();
        sc.add(3,4);
        sc.sub(3,4);
    }
}
