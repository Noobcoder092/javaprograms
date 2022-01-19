
class father{
    father(){
        System.out.println("HELLO , I'M THE FATHER CONSTRUCTOR");
    }
    father(int a){
        System.out.println("HELLO , I'M THE FATHER OVERLOADED CONSTRUCTOR WITH A VALUE OF A AS :"+a);
    }
}
class son extends  father {
    son() {
//        super(3);
        System.out.println("HELLO , I'M THE SON CONSTRUCTOR");
    }
    son(int a,int b){
        super(a);   // CALLING FATHER CONSTRUCTOR
        System.out.println("HELLO , I'M THE SON OVERLOADED CONSTRUCTOR WITH A VALUE OF B AS : "+b);
    };
}
    class grandson extends son {
        grandson() {
//            super(4,5);
            System.out.println("HELLO I'M THE GRANDSON CONSTRUCTOR");
        }
        grandson (int a, int b,int c){
            super(a,b);   // CALLING SON CONSTRUCTOR
            System.out.println("HELLO , I'M THE GRANDSON OVERLOADED CONSTRUCTOR  WITH A VALUE OF C AS : "+c);
        }
    }
    public class Constructor_overloading {
        public static void main(String[] args) {
            grandson obj = new grandson(3,4,5);   // CALLING GRANDSON CONSTRUCTOR
        }
    }