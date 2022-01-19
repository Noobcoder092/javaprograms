import java.util.ArrayList;

public class array_list{
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        list1.add(0,23);
        list1.add(0,78);
        list1.add(25);
        list1.add(26);
        list1.add(27);

        list2.add(45);
        list2.add(46);
        list2.add(47);
 //        for(int i:list){
//            System.out.println(i);
//        }
        System.out.println(list1.get(0));   //ANS : 78 , list updated

         list1.addAll(list2);                   // ADDING LIST2 ELEMENTS TO LIST1 : will add from last
//        list1.clear();                          //  CLEARING WHOLE LIST

        System.out.println(list1.contains(37));    // whether element present or not
        System.out.println(list1.indexOf(47));      // tells me the index
        System.out.println(list1.lastIndexOf(47));   // tells me the last index of 7

        list1.set(1,500);               // setting 500 at first index
        list1.remove(3);            // removed 3rd index value ,,, AND MANY MORE METHODS .........

//        PRINTING LIST 1
        for(int i=0;i< list1.size();i++){
            System.out.print(list1.get(i));
            System.out.print(" , ");
        }
    }
}
