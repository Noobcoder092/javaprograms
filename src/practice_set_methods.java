class Employee1{
    int salary ;
    String name ;
    public int  getsalary(){    // non - static function
        System.out.println("the salary of person is : "+salary);
        return  salary;
    }
    public  String getName(){    // non - static function
        System.out.println("the name of person is : "+name );
        return  name;
    }
    public static void setName(String n){    // static function
        System.out.println("the name is :"+n);
       String name =n ;
    }
}
public class practice_set_methods {
    public static void main(String[] args) {
        Employee1 person = new Employee1();
        person.salary =12000;
//        person.setName("harry");
        person.name="harry";
       person.getName();
       person.getsalary();
       person.setName("joe");
    }
}
