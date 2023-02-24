package apcs.pixLab;

import java.awt.Color;

public class PixRunner {

    public static void main(String[] args) {
//        Color[][] img = new Color[256][256];
//        for (int r=0; r<img.length; r++) {
//            for (int c=0; c<img[r].length; c++) {
//                img[r][c] = new Color (r , c, 255 - (r+c)/2);
//            }
//        }
//        Image a = new Image(img);
//        a.display("Red Image");

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

        i.display("P2P but blured ");

        Image j = new Image("p2p.jpg");
        j.darken();
        j.display("P2P but darkened ");

        Image k = new Image("p2p.jpg");
        j.blur();
        j.sharpen();
        j.display("P2P but sharpened after blur");


    }

}

