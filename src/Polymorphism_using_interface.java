interface gps{
    void gps();
}
interface mediaplayer{
    void mediaplayer();
}
class device  {
    public void meth3(){
        System.out.println("hello i'm the method of device class ");
    }
}
class realme extends  device implements gps,mediaplayer {
    public void gps(){
        System.out.println("locating google map on your realme 6");
    }
    public void mediaplayer(){
        System.out.println("playing music for you on your realme 6");
    }
}
public class Polymorphism_using_interface {
    public static void main(String[] args) {
//        realme obj=new realme();          BASIC
//        obj.meth3();
        gps sc =new realme();  // REFERENCE OF gps INTERFACE BUT OBJECT OF REALME CLASS
        sc.gps();

//        sc.mediaplayer();    ---->  NOT ALLOWED
//        sc.meth3();     ------> NOT ALLOWED

        mediaplayer sc1=new realme();    // REFERENCE OF MEDIAPLAYER INTERFACE  BUT OBJECT OF REALME CLASS : "POLYMORPHISM"
        sc1.mediaplayer();

//        device obj=new realme();  //device is CLASS
//        obj.meth3();
    }
}