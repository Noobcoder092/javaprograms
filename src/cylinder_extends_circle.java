
class  circle1 {
    double radius;

    circle1(double r) {
        this.radius = r;
        System.out.println("area of circle is : " + Math.PI * radius * radius);
    }
}
    class cylinder1 extends circle1 {
        double height;

        cylinder1(double r, double h) {
            super(r);         // SUPER KEYWORD USED TO CALL RADIUS OF PARENT CIRCLE CLASS
            this.height = h;
            System.out.println("volume of cylinder is : " +Math.PI * radius * radius * height);
        }
    }

    public class cylinder_extends_circle {
        public static void main(String[] args) {
            cylinder1 obj = new cylinder1(3, 4);
        }
    }

