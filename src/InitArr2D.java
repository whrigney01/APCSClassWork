import java.util.Arrays;

public class InitArr2D {
    public static void main(String[] args) {
        int [][] arr = new int [5][6];
        for (int i = 0; i < arr.length;  i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    arr[i][j] = i;
                } else {
                    arr[i][j] = -1;
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));
        for (int i = 0; i < arr.length;  i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == -1) {
                    System.out.print(arr[i][j] + " ");
                }else{
                    System.out.print(" " + arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
