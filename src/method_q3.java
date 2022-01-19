class square{
    int side ;

        public int area(){
           int  area=side*side;
            System.out.println("the area is "+area);
            return  area;   // or also i can do (return side*side) simply
        }
        public int perimeter(){
            int perimeter=4*side ;
            System.out.println("the perimeter is "+perimeter);
            return  perimeter;
        }
    }
public class method_q3 {
    public static void main(String[] args) {
        square shape=new square(); // don't forget u r using non-static function so always create object
        shape.side=5;
        shape.area();
        shape.perimeter();
    }
}
