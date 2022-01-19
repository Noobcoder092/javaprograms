class Student{
    private int id ;
    private String name ;

    public void setid(int n){    // SETTER : USED FOR SETTING THE VALUE OF ID   , WRITE ONLY
        this.id=n;
        System.out.println("ID is  :" +n);
    }
    public int getId(){     // GETTER : USED TO PRINT THE VALUE OF ID OR RETURN THE ID   , READ ONLY
        return  id;
    }
    public void setName(String s){    // SETTER FOR SETTING  STRING NAME .
        this.name =s;
        System.out.println("And , the name is : " +s);
    }
    public String  getName(){        // GETTER FOR PRINTING THE NAME OF A STRING.
        return name;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student student1 =new Student();
                                            // NOT ACCESSIBLE
//       student1.id=12;     USING REFERENCE VARIABLE : EARLIER WE WERE ACCESSING OUR ATTRIBUTES LIKE THIS BUT NOW, WE R MAKING THEM PRIVATE SO
//        student1.name="harry" ;       NOW, WE NEED GETTERS AND SETTERS FOR ACCESSING THEM , OTHERWISE IT WILL SHOW US RED LINE .

        student1.setid(12);                 //  FUNCTION CALL
        student1.setName("harry");
    }
}
