package apcs.pixLab;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import javax.imageio.ImageIO;

public class Image {
    /*
     * Instance variables: image - a 2D Array of Colors
     */
    private static Color[][] image;

    /**
     * Creates a new Image based on an existing 2D array of colors
     *
     * @param image the array of Colors
     */
    public Image(Color[][] image) {
        this.image = image;
    }

    /**
     * Creates a new Image from an image stored in a file
     *
     * @param file the name of the file to create the Image from
     */
    public Image(String file) {
        // read image and load into array of Colors
        try {
            BufferedImage img = ImageIO.read(new File(file));
            image = new Color[img.getHeight()][img.getWidth()];
            for (int r = 0; r < image.length; r++) {
                for (int c = 0; c < image[r].length; c++) {
                    image[r][c] = new Color(img.getRGB(c, r));
                }
            }
        } catch (IOException e) {  // couldn't open file
            e.printStackTrace();
            System.exit(-1);
        }
    }

    /**
     * Displays a COPY of the image into a Java GUI Window
     *
     * @param title The title to be displayed in the window's title bar
     */
    public void display(String title) {
        new ImageGUI(image, title);
    }

    /**
     * copy - creates and returns a duplicate copy of an image
     * <p>
     * precondition: the image has at least one row and at least one column
     *
     * @return a copy of the image
     */
    public Image copy() {
        Color[][] theCopy = new Color[image.length][image[0].length];
        for (int r = 0; r < image.length; r++) {
            for (int c = 0; c < image[0].length; c++) {
                theCopy[r][c] = new Color(image[r][c].getRGB());
            }
        }
        return new Image(theCopy);
    }


    /**
     * removeBlue - modifies an image by removing the blue component form all pixels
     * <p>
     * Postcondition: the image itself is modified
     */
    public void removeBlue() {

        // loop through all pixels
        for (int r = 0; r < image.length; r++) {
            for (int c = 0; c < image[r].length; c++) {

                // get component parts of pixel's color
                Color pixel = image[r][c];
                int red = pixel.getRed();
                int green = pixel.getGreen();
                int blue = pixel.getBlue();

                // construct a new pixel with the same red and green but no blue
                image[r][c] = new Color(red, green, 0);
            }
        }
        return;
    }

    public void removeRed() {

        // loop through all pixels
        for (int r = 0; r < image.length; r++) {
            for (int c = 0; c < image[r].length; c++) {

                // get component parts of pixel's color
                Color pixel = image[r][c];
                int red = pixel.getRed();
                int green = pixel.getGreen();
                int blue = pixel.getBlue();

                // construct a new pixel with the same red and green but no blue
                image[r][c] = new Color(0, green, blue);
            }
        }
        return;
    }

    public void blackWhite() {
        for (int r = 0; r < image.length; r++) {
            for (int c = 0; c < image[r].length; c++) {

                // get component parts of pixel's color
                Color pixel = image[r][c];
                int red = pixel.getRed();
                int green = pixel.getGreen();
                int blue = pixel.getBlue();

                int ave = (red + green + blue) / 3;
                // construct a new pixel with the same red and green but no blue
                image[r][c] = new Color(ave, ave, ave);
            }
        }
        return;
    }

    public void invert() {
        for (int r = 0; r < image.length; r++) {
            for (int c = 0; c < image[r].length; c++) {

                // get component parts of pixel's color
                Color pixel = image[r][c];
                int red = pixel.getRed();
                int green = pixel.getGreen();
                int blue = pixel.getBlue();

                // construct a new pixel with the same red and green but no blue
                image[r][c] = new Color(255 - red, 255 - green, 255 - blue);
            }
        }
        return;
    }

    public void mirrorVertical() {
        for (int r = 0; r < image.length / 2; r++) {
            for (int c = 0; c < image[r].length; c++) {

                // get component parts of pixel's color
                Color pixel = image[r][c];
                int red = pixel.getRed();
                int green = pixel.getGreen();
                int blue = pixel.getBlue();

                // construct a new pixel with the same red and green but no blue
                image[image.length - 1 - r][c] = new Color(red, green, blue);
            }
        }
    }

    public void flipHorizontal() {
        for (int r = 0; r < image.length; r++) {
            for (int c = 0; c < image[r].length / 2; c++) {

                // get component parts of pixel's color
                Color pixel = image[r][c];
                int red = pixel.getRed();
                int green = pixel.getGreen();
                int blue = pixel.getBlue();

                Color pixel1 = image[r][image[r].length - c - 1];
                int red1 = pixel1.getRed();
                int green1 = pixel1.getGreen();
                int blue1 = pixel1.getBlue();
                // construct a new pixel with the same red and green but no blue
                image[r][image[r].length - 1 - c] = new Color(red, green, blue);
                image[r][c] = new Color(red1, green1, blue1);
            }
        }
    }

    public void blur() {
        Color[][] newImage1 = new Color[image.length][image[0].length];

        for (int r = 0; r < image.length; r++) {
            for (int c = 0; c < image[r].length; c++) {
                int totalR = 0;
                int totalG = 0;
                int totalB = 0;
                int numPix = 0;


                for (int r1 = r - 1; r1 <= r + 1; r1++) {
                    for (int c1 = c - 1; c1 <= c + 1; c1++) {
                        if (!(r1 < 0 || r1 > image.length - 1 || c1 < 0 || c1 > image[r1].length - 1)) {
                            numPix++;
                            totalR += image[r1][c1].getRed();
                            totalG += image[r1][c1].getGreen();
                            totalB += image[r1][c1].getBlue();
                        }
                    }


                }
                totalR /= numPix;
                totalG /= numPix;
                totalB /= numPix;
                newImage1[r][c] = new Color(totalR, totalG, totalB);
            }

        }
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                image[i][j] = newImage1[i][j];
            }
        }
    }

    public void darken(int amount) {
        for(int r = 0; r < image.length; r++){
            for(int c = 0; c < image[r].length; c++){
                Color pixel = image[r][c];
                image[r][c] = new Color(pixel.getRed() / amount, pixel.getGreen()/amount, pixel.getBlue()/ amount);
            }
        }
    }

    public void lighten(int amount){
        for(int r = 0; r < image.length; r++){
            for(int c = 0; c < image[r].length; c++){
                Color pixel = image[r][c];
                int newRed = pixel.getRed() * 3;
                int newBlue = pixel.getBlue() * 3;
                int newGreen = pixel.getGreen() * 3;
                if(newRed >= 255){
                    newRed = 255;
                }
                if(newBlue >= 255){
                    newBlue = 255;
                }
                if(newGreen >= 255){
                    newGreen = 255;
                }
                image[r][c] = new Color(newRed, newGreen, newBlue);
            }
        }
    }

    public void blend(Color[][] image2){
        Color [][] combinedImage = new Color[image.length][image[0].length];

        for(int r = 0; r < combinedImage.length; r++){
            for(int c = 0; c < combinedImage[r].length; c++){
                Color pixel = image[r][c];
                Color pixel2 = image2[r][c];
                combinedImage[r][c] = new Color((pixel.getRed() + pixel2.getRed()) / 2, (pixel.getGreen() + pixel2.getGreen()) / 2, (pixel.getBlue() + pixel2.getBlue()) / 2);
            }
        }

        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                image[i][j] = combinedImage[i][j];
            }
        }

    }

}


