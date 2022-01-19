public class paasing_array_reference_in_method {
    static int main1(int []array){
        array[1]=6;
        // SEE HERE ,VALUE WILL BE CHANGED BECAUSE IN CASE OF ARRAYS AND OBJECTS , REFERENCE
        // IS PASSED , THAT'S WHY IT CHANGES THE VALUE .but won't change  in the case of passing simple arguments to function/methods.
        return  0;
    }
    public static void main(String[] args) {
        int []array={1,2,3,4,5};
        main1(array);
        System.out.println(" your value is : "+array[1]);
    }
}
