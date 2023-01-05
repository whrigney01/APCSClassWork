import java.util.Arrays;
import java.util.Scanner;

public class ArrayDel {
    public static void main (String[] args) {
        int[] nums = new int[20];
        for (int i=0; i<10; i++) {
            nums[i] = i;
        }
        System.out.println ("Before: " + Arrays.toString(nums));

        Scanner reader = new Scanner (System.in);

        System.out.print ("Enter the index of the value to be removed: ");
        int index = reader.nextInt ();

        // write code to *remove* the value at the specified index
        // all values after the index being removed should be "shifted" to fill
        // the gap from the removed item

        for(int i = index; i < nums.length; i++){
            if(i + 1 < nums.length){
                nums[i] = nums[i + 1];
            }else{
                nums[i] = 0;
            }
        }

        System.out.println ("After:  " + Arrays.toString(nums));
    }
}


