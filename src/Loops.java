public class Loops {
    public static void main(String[] args) {
        for (int i = 0; i<9; i++) {
            System.out.print(i + ", ");
        }
        System.out.println("");
        for (int i = 7; i<13; i++){
            System.out.print(i + ", ");
        }
        System.out.println("");
        for (int i = 12; i<31; i += 3){
            System.out.print(i + ", ");
        }
        System.out.println("");
        for (int i = 100; i>-1; i -= 2){
            System.out.print(i + ", ");
        }
        System.out.println("");
        for (int i = 0; i<25; i++){
            System.out.print((int)(Math.random()*6+1) + ", ");
        }
    }

}
