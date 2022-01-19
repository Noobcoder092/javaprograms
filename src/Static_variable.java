class Emp{
    int id;
    String name;
    static String company="TATA";

    Emp(int i,String n){
        this.id=i;
        this.name=n;
    }
    void details(){
        System.out.println(" "+id+" : "+name+" : "+company+" ");
    }
}

public class Static_variable {
    public static void main(String[] args) {
        Emp one=new Emp(12,"SURESH");     // EMPLOYEE IS NAMED AS EMP BECAUSE OF NOCLASS DEFOUNDERROR
        Emp two=new Emp(11,"HARRY");
        one.details();
        two.details();
    }
}
