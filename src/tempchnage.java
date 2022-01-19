public class tempchnage {
    public static float  meth1(float f) {
        float  c = 0;
        c=(f-32)*5/9;
        System.out.println("the temperature is : " + c);
        return c;
    }
    public static void main(String[] args) {
        meth1(4);
        meth1(90);
        meth1(6);
    }
}
