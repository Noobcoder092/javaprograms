class spherearea{
    double radius;
    double volume ;
    spherearea(double r,double v){
        this.radius=r;      //CONSTRUCTOR
        this.volume=v;
    }
    public double getRadius() {                 // GETTER'S
        return (4* Math.PI*radius*radius);
    }
    public double getVolume() {
        return ((4* Math.PI*radius*radius*radius)/3);
    }
}
public class Sphere {
    public static void main(String[] args) {
        spherearea obj=new spherearea(4,4);   // CONSTRUCTOR ARGUMENTS CALL
        System.out.println("Area of sphere is  : "+obj.getRadius());
        System.out.println("Volume of sphere is  : "+obj.getVolume());
    }
}
