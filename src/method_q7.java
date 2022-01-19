class circle{
    float  radius ;
            public float perimeter(){    //here u have to assign float otherwise u will get error as incompatible type.
                float  perimeter = (float) (2* Math.PI*radius);
                System.out.println("the perimeter of circle  is : "+perimeter);
                return  perimeter;
    }
    public float area(){
        float area= (float) (Math.PI*radius*radius);
        System.out.println("the area of circle is :"+area);
        return area;
    }
}
public class method_q7 {
    public static void main(String[] args) {
        circle shape=new circle();
        shape.radius=4;
        shape.perimeter();
        shape.area();
    }
}
