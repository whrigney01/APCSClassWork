package apcs.classes;

public class Parrot extends Bird{
    public Parrot (){
        super(16);
    }
    public Parrot (int weight) {
        super (weight);
    }
    public void speak (){
        System.out.println("Bonjour. Yo quiero una galleta");
    }
}
