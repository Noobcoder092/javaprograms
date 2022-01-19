class phone{
    public void ringing(){
        System.out.println("phone ringing....");
    }
}
class smartphone extends  phone {
    public void ringing(){       // METHOD  OVERRIDING
        System.out.println(" now , smartphone ringing....");
    }
    public void playingmusic(){
        System.out.println("playing music......");
    }
}

public class Dynamic_method_dispatch {
    public static void main(String[] args) {
        // smartphone sc1=new phone();  //[ NOT ALLOWED ]
          // THIS IS DYNAMIC METHOD DISPATCH

         phone sc =new smartphone();    // [ALLOWED] object of smartphone , but reference of phone
         sc.ringing();


//         phone sc1=new phone();
//         sc1.ringing();
    }
}
