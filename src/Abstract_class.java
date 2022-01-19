abstract class baapclass{
    public void meth(){
        System.out.println("hey , i'm the method of abstract class ");
    }
   abstract public void main();
   abstract  public void  main2();          // ABSTRACT METHODS
}
 class beta extends  baapclass{
      public void main(){
          System.out.println(" hey !");
      }
       public void  main2(){
           System.out.println("hey again !");
       }
}
class grandbeta extends  baapclass{
    public void main(){
        System.out.println("hey i'm the method of grandbeta class extended from papaclass");
    }
    public void  main2(){
        System.out.println("hey i'm the second method of grandbeta class extended from papaclass");
    }
}
public class Abstract_class {
    public static void main(String[] args) {
        beta obj=new beta();
        obj.main();
        obj.main2();
        grandbeta obj2 =new grandbeta();
        obj2.main();
        obj2.main2();
    }
}
