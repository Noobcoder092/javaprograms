import java.util.Scanner;
                                                //BRUTE FORCE METHOD : TO FIND DUPLICATE NUMBER IN AN ARRAY
public class Array_Duplicate_elements {
    public static void main(String[] args) {
        System.out.println("enter the size of the array");
        Scanner sc =new Scanner(System.in);
        int size=sc.nextInt();
        int array[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter the array element : "+i);
            array[i]=sc.nextInt();
        }
        System.out.print("Duplicate elements present in the array  : ");
        for(int i=0;i<size-1;i++){      // SIZE-1 : SO THAT IT WILL ONLY GO UPTO 5TH INDEX AND
            for(int j=i+1;j<size;j++){                  // J WILL GO UPTO 6
                if((array[i]==array[j]) && (i!=j)){
                    System.out.println(array[j]);
                }
            }
        }
    }
}
