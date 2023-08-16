package CS2;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Roman {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a Roman Numeral between 1 and 3999: ");
        String str = reader.nextLine();
        str = str.toLowerCase();
        int answer = 0;
        int count = 0;
        int subcount = 0;

        //Checks for M
        if (str.substring(0, 1).equals("m")) {
            for (int i = 0; i < str.length(); i++) {
                String letter = str.substring(i, i + 1);
                if (letter.equals("m")) {
                    count++;
                }else{
                    str = str.substring(i,str.length());
                }
            }
        }
        answer += 1000 * count;
        count = 0;

        //Checks for D
        if(str.substring(0, 1).equals("d") || str.substring(0, 1).equals("c")){
            for (int i = 0; i < str.length(); i++) {
                String letter = str.substring(i, i + 1);
                if (letter.equals("d")) {
                    count++;
                }else if(letter.equals("c") && (str.substring(i+1, i+2).equals("d"))){
                    subcount++;
                }else{
                    str = str.substring(i,str.length());
                }
            }
        }
        answer += 500*count;
        answer -= 100*subcount;
        count = 0;
        subcount = 0;

        if(str.substring(0, 1).equals("c") || str.substring(0, 1).equals("x")){
            for (int i = 0; i < str.length(); i++) {
                String letter = str.substring(i, i + 1);
                if (letter.equals("c")) {
                    count++;
                }else if(letter.equals("x")){
                    subcount++;
                }else{
                    str = str.substring(i,str.length());
                }
            }
        }
        answer += 100*count;
        answer -= 10*subcount;
        count = 0;
        subcount = 0;


        if(str.substring(0, 1).equals("l") || str.substring(0, 1).equals("x")){

        }

        if(str.substring(0, 1).equals("x") || str.substring(0, 1).equals("i")){

        }

        if(str.substring(0, 1).equals("v") || str.substring(0, 1).equals("i")){

        }

        if(str.substring(0, 1).equals("i")){
            for (int i = 0; i < str.length(); i++) {
                String letter = str.substring(i, i + 1);
                if (letter.equals("i")) {
                    count++;
                }else{
                    str = str.substring(i,str.length());
                }
            }
        }
        answer += count;

            System.out.println(answer);
        System.out.println(str);

    }
}
