import java.util.Arrays;

public class Arr2D {
    public static void main(String[] args) {
        int [] [] table = new int[5] [3];
        System.out.println(Arrays.deepToString((table)));
        table[2][2] = 9;
        System.out.println(Arrays.deepToString(table));

        int [][] arr = new int[2][3];
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                System.out.println(arr[r][c]);
            }
        }

        double [][] arrgs = {{0.1, 0.2, 0.3, 0.5}, {1.1, 1.2, 1.3, 1.5}, {3.1, 3.2, 3.3, 3.5}};
        for (int i = 0;  i < arrgs.length; i++) {
            for (int j = 0; j < arrgs[i].length; j++) {
                arrgs[i][j] *= 2.0;

            }


        }

        for (int i = 0; i < arrgs.length; i++) {
            for (int j = 0; j < arrgs[i].length; j++) {
                System.out.print(arrgs[i][j] + " ");

            }
            System.out.println();
        }

    }
}
