class cylinder {
  private  float radius ;
    private float height ;

     cylinder(float radius, float height) {
        this.radius = radius;               // CONSTRUCTOR
        this.height = height;
    }
//    public float getradius(){
//        return radius;
//    }
//    public float getheight(){
//        return  height;
//    }
    public float getarea (){
        return (float) (2* Math.PI*radius*height+2* Math.PI*radius*radius);
    }
}
    public class AM_1 {   //   AM = ACCESS MODIFIERS
    public static void main(String[] args) {
        cylinder object = new cylinder(2,2);
//        System.out.println("radius :" +object.getradius());
//        System.out.println("height :" +object.getheight());
        System.out.println(" the surface area  is : " +object.getarea());
    }
}