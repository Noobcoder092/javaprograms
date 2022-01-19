class Animal{
    String bark;
    String bite;
    public void main1(){
        System.out.println(" Dog is barking ");
        System.out.println(" Dog is biting me ");
    }
}
class Labradog extends Animal{    //INHERITED CLASS FORM PARENT CLASS ANIMAL
    String eat;
    public void main2(){
        System.out.println("Now , labradog is eating");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Animal sc = new Animal();
        sc.main1();
//        sc.main2();  BUT HERE , IT WIL NOT BE ABLE TO ACCESS "CLASS LABRADOG" PROPERTIES

        Labradog sc1=new Labradog();
        sc.main1();    // SEE HERE , I/M ABLE TO ACCESS "CLASS ANIMAL" PROPERTIES AS WELL
        sc1.main2();
    }
}
