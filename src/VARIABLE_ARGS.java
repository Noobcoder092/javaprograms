
public class VARIABLE_ARGS {
    public static  int sum(int ...array){
        int result =0;
        int average=0 ;
        for(int elements : array){
            result =result+elements;
            average = result/array.length;
        }
        return  average;
    }
    public static void main(String[] args) {
      //  int average =0;
        System.out.println(" the average  of numbers is :" +sum(2,3,4,5,6));
        //System.out.println(" average : "+average);
    }
}
