abstract class figure{
    int length;
    figure(int x){   // CONSTRUCTOR OF ABSTRACT CLASS
        this.length=x;
    }
        abstract int area();   // ABSTRACT METHOD
    }

    class square1 extends figure{    // CONCRETE CLASS : IMPLEMENTED ALL PROPERTIES OF ABSTRACT CLASS
    int breadth ;
    square1(int x,int y){     //CONCRETE METHOD
        super(x);
        this.breadth=y;
    }
    public int area(){    // METHOD OF ABSTRACT CLASS IMPLEMENTED HERE
        return  length*breadth;
    }
    }

    class triangle extends  figure{
    int breadth;
    int height;
    triangle(int x,int y,int z){
        super(x);
        this.breadth=y;
        this.height=z;
    }
    public int area(){    // METHOD OF ABSTRACT CLASS IMPLEMENTED HERE ALSO .
        return length*breadth*height;
    }
    }
public class Abstract_example {
    public static void main(String[] args) {
//        figure object=new figure();     NOT ALLOWED
//        figure object=new square1(2,3);       ALLOWED I.E, [DYNAMIC METHOD DISPATCH]

        figure figure ;                          // THIS REFERENCE VARIABLE IS  IMPORTANT TO CREATE
                                                  // iF I'VE TO CALL BOTH CLASS METHOD (WHICH IS OF SAME NAME)
        square1 obj2=new square1(3,4);
        figure = obj2;
        System.out.println("Area of square is : "+figure.area());

        triangle obj=new triangle(3,4,5);
        figure=obj;
        System.out.println("Area of triangle is : "+figure.area());
    }
}