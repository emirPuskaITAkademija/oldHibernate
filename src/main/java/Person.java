public class Person {
    static {
        System.out.println("Izvršava static blok koda");
    }

    {
        System.out.println("Izvršava se nestatički blok koda");
    }

    public Person(){
        System.out.println("Izvršava se konstruktor");
    }
}
