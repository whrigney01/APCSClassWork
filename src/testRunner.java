public class testRunner {
    public static void main(String[] args) {
        test line1 = new test(-25 ,40, 30);
        double slope1 = line1.getSlope();
        boolean onLine1 = line1.isOnLine(5, -2);
        System.out.println(slope1);
        System.out.println(onLine1);
    }
}
