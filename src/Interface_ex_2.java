
interface  Callback{

//    void main(){                        SEE U CAN'T ADD CONCRETE METHOD TO YOUR
//        System.out.println("hey ");      INTERFACE , IF U DO SO , U HAVE TO IMPLEMENT THAT METHOD
//    }                                     AS WELL , OTHERWISE IT WILL SHOW ERROR .

    void callback(int param);
}
class Client implements Callback {
    public void callback(int p) {
        System.out.println("Callback called with a value :" + p);
    }
}
    class AnotherClient implements Callback{
        public void callback(int p){
            System.out.println("ANOTHER VERSION OF CALLBACK ");
            System.out.println("P square is : "+(p*p));
        }
    }
public class Interface_ex_2 {
    public static void main(String[] args) {
        Callback obj=new Client();  // DYNAMIC METHOD DISPATCH
        obj.callback(3);
        Callback obj2=new AnotherClient();
//        AnotherClient obj2=new Client();   I CAN ALSO DO THIS
        obj2.callback(4);
    }
}
