class rectangle{
    double lenght ;
    double breadth;
     rectangle(double l, double b) {
        this.lenght = l;
        this.breadth = b;
         System.out.println("Area of rectangle is : " +l*b);
    }
}
class cuboid extends  rectangle{
    double height;
    cuboid(double l,double b,double h ){
        super(l,b);  // SUPER CALLING RECTANGLE METHOD ,  ASKING FOR LENGTH AND BREADTH .
        this.height=h;
        System.out.println("Volume of cuboid is : " +l*b*h);
    }
}
public class Cuboid_extends_rectangle {
    public static void main(String[] args) {
        cuboid obj=new cuboid(3,4,5);
//        System.out.println("Area of rectangle is : "+obj.getarea());
//        System.out.println("volume of cuboid is  : "+obj.getvolume());
    }
}
