class constructor {
    private int id;
    private String name;

    constructor(int n, String a) {  // CONSTRUCTOR IS AUTOMATICALLY CALLED , IT DOESN'T NEED ANY SET VALUE
        this.id = n;
        this.name = a;
        System.out.println("the id is : " + n);
        System.out.println("the name is : " + a);
    }
}

    public class Constructors {
        public static void main(String[] args) {
            constructor sc = new constructor(12, "harry"); // DIRECTLY PASSING ARGUMENTS TO OBJECT .
        }
    }
