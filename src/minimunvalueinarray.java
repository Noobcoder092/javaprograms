public class minimunvalueinarray {
    public static void main(String[] args) {
        int []array={56,49,-67,9,23};
        int min= Integer.MAX_VALUE;

        // System.out.println(min);   THIS WILL GIVE ME THE HIGHEST VALUE

        for(int elements :array){
            if(elements<min){
                min=elements ;
            }
        }
        System.out.println("the minimum value in an array is : " +min);
    }
}
