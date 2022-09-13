public class LoopTasks {
    public static void main(String[] args) {
        System.out.println("Task 1: 10 random numbers");
        for (int i =1; i <= 10; i++){
            System.out.println(i + ":" + Math.random()*100);
        }
        System.out.println();
        System.out.println("Task 2: Maximum");
        double max = Double.MIN_VALUE;
        for (int i = 1; i <=10; i++){
            double val = Math.random()*100;
            System.out.println(val);
            if (val > max){
                max = val;
            }
        }
        System.out.println("The largest value was: " + max);
        System.out.println();
        System.out.println("Task 3: Minimum");
        double min = Double.MAX_VALUE;
        for (int i =1; i <= 10; i++){
            double val = Math.random()*100;
            System.out.println(val);
            if(val < min){
                min = val;
            }
        }
        System.out.println("The smallest value was: " + min);
        System.out.println();
        System.out.println("Task 4: Sum");
        double sum = 0;
        for (int i=1; i <= 10; i++){
            double val = Math.random()*100;
            System.out.println(val);
            sum += val;
        }
        System.out.println("The total of the values was: " + sum);
    }
}
