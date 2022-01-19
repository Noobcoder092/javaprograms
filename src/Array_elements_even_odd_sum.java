
public class Array_elements_even_odd_sum{
    public static void main(String[] args) {
        int mine[] = {1, 2, 6, 3, 9, 7, 5};
        int se=0;
        int so=0;
        for(int i=0;i<=mine.length-1;i++){
            if(mine[i]%2==0){
                se+=mine[i];
            }
            else {
                so+=mine[i];
            }
        }
        System.out.println("sum of even is :" +se);
        System.out.println("sum of odd is : " +so);
    }
}
