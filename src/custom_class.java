  class employee{    // CUSTOM CLASS
    int id;         // INITIALIZING ATTRIBUTES
    String name ;
    int salary ;

      public void pritndetails() {    //NON - STATIC METHOD
          System.out.println(" the name of person is : "+name);
          System.out.println(" the id of person is : "+id);
          System.out.println(" the salary  of person is : "+salary);
     }
}
public class custom_class {
    public static void main(String[] args) {
        employee employee1 = new employee();  // EMPLOYEE HUMAN OBJECT
        employee employee2 = new employee();  // EMPLOYEE HUMAN2 OBJECT
       // ASSIGNING  HUMAN'S  ATTRIBUTES
        employee1.id =12;
        employee1.name = "harry";
        employee1.salary=20000;

        // ASSIGNING  HUMAN2'S  ATTRIBUTES
        employee2.id =13;
        employee2.name="john";
        employee2.salary=400000;
//         System.out.println("the id is: " +employee1.id);   VALID

        employee1.pritndetails();          // CALLING MY METHOD FROM HERE WITHOUT PASSING ARGUMENTS
        employee2.pritndetails();          // BECAUSE WE HAVE CREATED  A NON -STATIC METHOD .
    }
}
