public class Rand {
    public static void main(String[] args) {
        double a = Math.random();
        System.out.println("A random value between [0.0, 1.0) is " + a);
        double b = Math.random() * 100.0;
        System.out.println("A random value between [0.0, 100.0) is " + b);
        double c = Math.random() + 5.0;
        System.out.println("A random value between [5.0, 6.0) is " + c);
        double d = Math.random() * 20.0 - 10.0;
        System.out.println("A random value between [-10.0, 10.0) is " + d);
        int f = (int) Math.round(Math.random() * 100.0);
        System.out.println("A random value between [0, 100) is " + f);
        int g = (int)(Math.random() * 52.0 + 1.0 );
        System.out.println("A random value between [1, 52] is " + g);
    }
}
