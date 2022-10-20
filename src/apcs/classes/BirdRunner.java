package apcs.classes;

public class BirdRunner {
    public static void main(String[] args) {
        Bird b = new Bird ();
        System.out.println(b);
        b.speak();
        Robin r = new Robin();
        System.out.println(r);
        r.speak();
        Parrot p = new Parrot();
        System.out.println(p);
        p.speak();
    }


}
