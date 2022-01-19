class car {
    String name;
    String brand;
    double price;

    /*    public void details(String n,String b,Double p){
            this.name=n;
            this.brand=b;                             BY USING , METHOD
            this.price=p;
            System.out.println("Name of the car is : "+n);
            System.out.println("Brand of the car is : "+b);
            System.out.println("Price of the car is : "+p);
        }
      }*/

    car(String n,String b, double p) {
        System.out.println("Name of the car is : "+n);
        System.out.println("Brand of the car is : "+b);      // BY USING CONSTRUCTOR
        System.out.println("Price of the car is : "+p);
        System.out.println();
    }
}
public class Attributes_Instantiation {
    public static void main(String[] args) {

        //   FIRST WAY TO INSTANTIATE   : USING REFERENCE VARIABLE

//        car nano =new car();
//        nano.name="NANO";
//        nano.brand="TATA";
//        nano.price=100000;
//        System.out.println("Name of the car is : "+nano.name);
//        System.out.println("Brand of the car is : "+nano.brand);
//        System.out.println("Price of the car is : "+nano.price);

        // SECOND WAY : BY USING METHOD

//        car nano =new car();
//        nano.details("NANO","TATA", 20000.0);

//        THIRD WAY :  BY USING CONSTRUCTOR

        car one  = new car("NANO","TATA",10000);
        car two =new car("LAMBO","TATA",200000);
    }
}
