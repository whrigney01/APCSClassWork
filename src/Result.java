import java.io.*;

import static java.util.stream.Collectors.joining;


class Result {

    /*
     * Complete the 'arrowForMostTargets' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER size
     *  2. STRING targets
     */

    public static String arrowForMostTargets(int size, String targets) {
        System.out.println(targets);
        int board[][] = makeBoard(size, targets);
        String largest;
        System.out.println(findDirect(board, 4, 0));
        return "ur mother";
    }

    public static String findDirect(int board[][], int row, int col) {
        int greatNum = 0;
        String let = "uhoh";
        for (int i = 0; i < 8; i++) {
            int tempGreat = 0;
            if (i == 0) {
                for (int j = col - 1; j > 0; j--) {
                    if (board[row][j] == 1) {
                        tempGreat++;
                    } else {
                        j = -1;
                    }
                }
                if (tempGreat > greatNum) {
                    greatNum = tempGreat;
                    let = "A";
                }

            } else if (i == 1) {
                for (int j = row - 1; j > 0; j--) {
                    if (board[j][col] == 1) {
                        tempGreat++;
                    } else {
                        j = -1;
                    }
                }
                if (tempGreat > greatNum) {
                    greatNum = tempGreat;
                    let = "B";
                }
            } else if (i == 2) {
                for (int j = col + 1; j < board[0].length; j++) {
                    if (board[row][j] == 1) {
                        tempGreat++;
                    } else {
                        j = -1;
                    }
                }
                if (tempGreat > greatNum) {
                    greatNum = tempGreat;
                    let = "C";
                }
            } else if (i == 3) {
                for (int j = row + 1; j < board.length; j++) {
                    if (board[j][col] == 1) {
                        tempGreat++;
                    } else {
                        j = -1;
                    }
                    if (tempGreat > greatNum) {
                        greatNum = tempGreat;
                        let = "D";
                    }
                }
            } else if (i == 4) {
                for (int j = col - 1; j > 0; j--) {
                    int newRow = row - 1;
                    System.out.println(col + " " + newRow);
                    try {
                        if (board[newRow][j] == 1) {
                            tempGreat++;
                        } else {
                            j = -1;
                        }
                        newRow--;
                    } catch (Exception e) {
                        j = -1;
                    }
                    if (tempGreat > greatNum) {
                        greatNum = tempGreat;
                        let = "E";
                    }
                }
            } else if (i == 5) {
                for (int j = col + 1; j < board[0].length; j++) {
                    int newRow = row - 1;
                    System.out.println(col + " " + newRow);
                    try {
                        if (board[newRow][j] == 1) {
                            tempGreat++;
                        } else {
                            j = -1;
                        }
                        newRow--;
                    } catch (Exception e) {
                        j = -1;
                    }
                    if (tempGreat > greatNum) {
                        greatNum = tempGreat;
                        let = "F";
                    }
                }
            } else if (i == 6) {
                for (int j = col + 1; j < board[0].length; j++) {
                    int newRow = row + 1;
                    System.out.println(col + " " + newRow);
                    try {
                        if (board[newRow][j] == 1) {
                            tempGreat++;
                        } else {
                            j = -1;
                        }
                        newRow++;
                    } catch (Exception e) {
                        j = -1;
                    }
                    if (tempGreat > greatNum) {
                        greatNum = tempGreat;
                        let = "G";
                    }
                }
            } else {
                for (int j = col - 1; j > 0; j--) {
                    int newRow = row + 1;
                    System.out.println(col + " " + newRow);
                    try {
                        if (board[newRow][j] == 1) {
                            tempGreat++;
                        } else {
                            j = -1;
                        }
                        newRow++;
                    } catch (Exception e) {
                        j = -1;
                    }
                    if (tempGreat > greatNum) {
                        greatNum = tempGreat;
                        let = "H";
                    }
                }
            }
        }
        return let;
    }

    public static int[][] makeBoard(int size, String targets) {
        int[][] tempBoard = new int[size][size];
        while (targets.length() > 0) {
            String tempCoords;
            if (targets.length() != 2) {
                tempCoords = targets.substring(0, targets.indexOf(" "));
            } else {
                tempCoords = targets.substring(0, targets.length());
            }
            int row = Integer.valueOf(tempCoords.substring(0, 1));
            int col = Integer.valueOf(tempCoords.substring(1, 2));
            tempBoard[row][col] = 1;
            if (targets.length() != 2) {
                targets = targets.substring(targets.indexOf(" ") + 1, targets.length());
            } else {
                targets = "";
            }

        }

        return tempBoard;
    }


    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
        int size = 6;
        String targets = "13 21 41 42 44";
        String result = arrowForMostTargets(size, targets);
    }

}