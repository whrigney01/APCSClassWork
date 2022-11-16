package apcs.grades;

import java.util.Arrays;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double array[] = new double [3];
        for(int i = 0; i < array.length; i++){
            array[i] = promptInt(reader, "aeae", 0.0, 100.0);
        }
        System.out.println("The test scores are : " + Arrays.toString(array));
        System.out.println("The maximum score is: " + max(array));
        System.out.println("The minimum score is: " + min(array));
        System.out.println("The mean of the scores is: " + mean(array));
        System.out.println("The median of the scores is: " + median(array));
        System.out.println("The mode of the scores is: " + mode(array));
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
    public static double mode(double args[]){
        int maxCount = 0;
        double mode = 0;
        for(int i = 0; i < args.length; i++){
            int count = 0;
            double value = args[i];
            for (int j = 0; j < args.length; j++){
                double value2 = args[j];

                if(value == value2){
                    count++;
                }
            }
            if(count> maxCount){
                maxCount = count;
                mode = args[i];
            }
        }
        return mode;
    }
    public static double promptInt(Scanner reader, String prompt, double low, double high){
        boolean answer = false;
        while(answer == false) {
            System.out.print("Enter a test score from " + low + " to " + high +": ");
            try{
                if (reader.nextDouble() >= low && reader.nextDouble() <= high) {
                    return reader.nextDouble();
                }else{
                    System.out.println("Please enter a test score between " + low + " to " + high);
                }
            } catch (Error e) {
                Error error = e;
                System.out.println("Please enter a numerical test score from 0.0 to 100.0");
            }
        }
        return low;
    }
}
