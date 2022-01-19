public class trycatch {
    public static void main(String[] args) {
        int []array={1,2,3,4,5};
        try {
            System.out.println("the array is : " +array[4]); //it's not even present in my array .
        }
        catch (Exception e){
            System.out.println("it's not present in the array");
            System.out.println(e);  // to print the exception that has occured .
        }
        System.out.println("this is executing even after error in above statement");
    }
}
