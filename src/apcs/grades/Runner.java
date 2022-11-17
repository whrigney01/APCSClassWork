package apcs.grades;

import java.util.Arrays;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("How many test scores would you like to enter? ");
        int numScores = reader.nextInt();
        double array[] = new double [numScores];
        for(int i = 0; i < array.length; i++){
            array[i] = promptInt(reader, "Enter a test score between 0.0 and 100.0: ", 0.0, 100.0);
        }
        System.out.println();
        System.out.println("The test scores are : " + Arrays.toString(array));
        System.out.println("The maximum score is: " + max(array));
        System.out.println("The minimum score is: " + min(array));
        System.out.println("The mean of the scores is: " + mean(array));
        System.out.println("The median of the scores is: " + median(array));
        System.out.println("The mode of the scores is: " + mode(array));
        System.out.println("The range of the scores is " + range(array));
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
            System.out.print(prompt);
            try{
                double response = reader.nextDouble();
                if (response >= low && response <= high) {
                    return response;
                }else{
                    System.out.println("Please enter a score between " + low + " to " + high);
                }
            } catch (Exception e) {
                String error = reader.nextLine();
                System.out.println("Please enter a numerical score from " + low + " to " + high);
            }
        }
        //random value to return because java is dum and needed a return statement.
        // there is no possible way to return that value however because the only way to get out of the while loop is to return
        return 65.9;
    }

    public static double range(double args[]){
        Arrays.sort(args);
        return args[args.length - 1] - args[0];
    }
}
