import java.util.HashSet;

public class Hash_string {
    public static void main(String[] args) {
        String  array[]={"rahul","dev","himanshu","arti","sahil","dev","rahul"};
        HashSet<String> hash =new HashSet();
        System.out.println("Duplicate strings are :");
       for(int i=0;i<array.length-1;i++){
           for(int j=i+1;j< array.length;j++){
               if(array[i]==array[j]){
                   hash.add(array[i]);
                   System.out.println("" +array[i]);
               }
           }
       }
    }
}
