package apcs.pixLab;

import java.awt.Color;

public class PixRunner {
    //Extension: I made a lighten method that takes an amount parameter that then multiplies every pixel's colors by that number and if the resulting rgb values are over 255, its resets them to 255.
    //This demonstrates mastery because I created a new method and used loops to loop through a 2d array and then set each value in that array to a new value.
    //I also created a darken method that takes an amount parameter and then divides every pixel's color by that number.
    //This shows mastery because I created another new method and used loops to go through the 2d array and the set each value.
    //I extended my blur method by creating a buffered blur and made the method able to handle all edge and corner cases as well as interior pixels.
    //This shows mastery because I had to create a new 2d array as well as make a new for loop to loop through the new array and set Images value to be the same. For the handling all cases, I had to create an if statement that can handle every case as well as interior pixels\
    //I created a blend method that takes a different 2d array of colors in as a parameter and then averages the rgb values for each pixel.
    //This demonstrates mastery because i had to loop through, set values of and the tranfer the values of a 2d array to another array.
    public static void main(String[] args) {
        Color[][] img = new Color[256][256];
        for (int r=0; r<img.length; r++) {
            for (int c=0; c<img[r].length; c++) {
                img[r][c] = new Color (r , c, 255 - (r+c)/2);
            }
        }
        Image a = new Image(img);
        a.display("Red Image");

        Image b = new Image("p2p.jpg");
        b.display("Peak to Peak");

        Image c = new Image("p2p.jpg");
        c.removeBlue();
        c.display("P2P with no blue");

        Image d = new Image("p2p.jpg");
        d.removeRed();
        d.display("P2P with no red");

        Image e = new Image("p2p.jpg");
        e.blackWhite();
        e.display("P2P but black and white");

        Image f = new Image("p2p.jpg");
        f.invert();
        f.display("P2P but inverted");

        Image g = new Image("p2p.jpg");
        g.mirrorVertical();
        g.display("P2P but mirrored vertically");

        Image h = new Image("p2p.jpg");
        h.flipHorizontal();
        h.display("P2P but flipped horizontally");

        Image i = new Image("p2p.jpg");
        for (int j = 0; j < 20;            j++) {
            i.blur();
        }

        i.display("P2P but blurred");

        Image j = new Image("p2p.jpg");
        j.darken(3);
        j.display("P2P but darkened");

        j.lighten(3);
        j.display("P2P but lightened after being darkened");

        Image m = new Image("p2p.jpg");
        m.lighten(3);
        m.display("P2P but lightened from normal image");


        Color[][] image = new Color[500][500];
        for (int row =0; row<image.length; row++) {
            for (int column =0; column<image[row].length; column++) {
                image[row][column] = new Color (0 , 0, 0);
            }
        }
        Image white = new Image(image);

        Color[][] img2 = new Color[500][500];
        for (int row=0; row<img2.length; row++) {
            for (int column=0; column<img2[row].length; column++) {
                img2[row][column] = new Color (255 , 255, 255);
            }
        }


        white.blend(img2);
        white.display("White image blended with black image");
    }

}

