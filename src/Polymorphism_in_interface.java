interface BasicAnimal {
    void eat();
    void sleep();
}
class monkey{
    void jump(){
        System.out.println("monkey jumping ");
    }
    void bite(){
        System.out.println("MF monkey biting");
    }
}
class Human extends  monkey implements  BasicAnimal{
    @Override
    public void eat() {
        System.out.println("Basic animal eat method");
    }
    @Override
    public void sleep() {
        System.out.println("Basic animal sleep method");
    }
}
public class Polymorphism_in_interface {
    public static void main(String[] args) {
        BasicAnimal obj=new Human();    // POLYMORPHISM : USING ONLY ONE INTERFACE I.E. BASIC ANIMAL
        obj.eat();                      // BECAUSE ONLY ONE INTERFACE IS PRESENT
        obj.sleep();

        Human sc=new Human();           // BASIC (YOU KNOW IT )
        sc.jump();
        sc.bite();

//    monkey sc1=new Human();     -------> ALLOWED

    }
}
