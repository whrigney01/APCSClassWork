import java.util.Arrays;
import java.util.Scanner;

public class ArrayAdd {
    public static void main (String[] args) {
        int[] nums = new int[20];
        for (int i=0; i<10; i++) {
            nums[i] = i;
        }
        System.out.println ("Before: " + Arrays.toString(nums));

        Scanner reader = new Scanner (System.in);

        System.out.print ("Enter a number to insert into the list: ");
        int value = reader.nextInt ();

        System.out.print ("Enter the index where it should go: ");
        int index = reader.nextInt ();

        // write code to *insert* the value at the specified index
        // all values past the index are shifted by 1 and
            // the last value is "discarded"

        for(int i = nums.length - 2; i >=index; i--){
            nums[i+1] = nums[i];
        }
        nums[index] = value;

        System.out.println(Arrays.toString(nums));
    }
}

