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
        System.out.println();
        double randNumber = Math.random();
        while (randNumber < 0.9){
            System.out.println(randNumber);
            randNumber = Math.random();
        }
        System.out.println(randNumber);
        System.out.println();
        for (double i =1; i <= 10; i++){
            System.out.println(1.0/i);
        }
        System.out.println();
        int number = 1;
        for (int i = 0; i < 10; i++){
            System.out.println(number);
            number *= -1;
        }
        System.out.println();
        int sum = 0;
        for (int i = 1; i <11; i++ ){
            sum += i;
        }
        System.out.println(sum);
    }

}
