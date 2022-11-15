package apcs.grades;

import java.util.Arrays;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double array[] = new double [3];
        for(int i = 0; i < array.length; i++){
            System.out.print("Enter a test score between 0.0 and 100.0: ");
            double newValue = reader.nextDouble();
            array[i] = newValue;
        }
        System.out.println(Arrays.toString(array));
        System.out.println(min(array));
        System.out.println(max(array));
        System.out.println(mean(array));
        System.out.println(median(array));
    }
    public static double min(double args[]){
        double min = Double.MAX_VALUE;
        for (int i = 0; i < args.length; i++){
            if(args[i] < min){
                min = args[i];
            }
        }
        return min;
    }
    public static double max(double args[]){
        double min = Double.MIN_VALUE;
        for (int i = 0; i < args.length; i++){
            if(args[i] > min){
                min = args[i];
            }
        }
        return min;
    }
    public static double mean(double args[]){
        double total = 0.0;
        for (int i = 0; i < args.length; i++){
            total += args[i];
        }
        return total/ (args.length);
    }
    public static double median(double args[]){
        Arrays.sort(args);
        if(args.length  % 2 == 1){
           return args[(int)(args.length / 2)];
        }else{
            return (args[(args.length - 1)/ 2] + args[(args.length - 1 )/2 + 1]) / 2;
        }
    }
}
