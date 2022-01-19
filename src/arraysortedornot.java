public class arraysortedornot {
    public static void main(String[] args) {
        int [] array={1110,112,127,178};
        boolean issorted=false ;
        for(int i=0;i<array.length-1;i++){
            if(array[i]>array[i+1]){
                issorted=true;
                break ;
            }
        }
        if(issorted){
            System.out.println("array  is not sorted ");
        }
        else {
            System.out.println("array is  sorted ");
        }
    }
}
