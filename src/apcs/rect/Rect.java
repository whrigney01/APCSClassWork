package apcs.rect;

/**
 * this class creates a rectangle with a width and height
 */
public class Rect {
    private double width;
    private  double height;

    /**
     * Create a rectangle
     * @param width the new rectangle's width
     * @param height the new rectangle's height
     */
    public Rect(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Creates a rectangle with a width and height of 0
     */
    public Rect () {
        this.width = 0.0;
        this.height = 0.0;
    }

    /**
     * gets the width of the rectangle
     * @return the width
     */
    public double getWidth () {
        return this.width;
    }

    /**
     * sets the width of the rectangle
     * @param w new width
     */
    public void setWidth (double w) {
        this.width = w;
    }

    /**
     *gets the rectangle's height
     * @return the height
     */
    public double getHeight() {
        return  this.height;
    }

    /**
     * sets the rectangle's height
     * @param h new height
     */
    public void setHeight(double h) {
        this.height = h;
    }

    public boolean equals(Rect other){
        if (this.height == other.getHeight() && this.width == other.getWidth()){
            return true;
        } else {
            return false;
        }
    }

    /**
     * gets the area of the rectangle
     * @return the area
     */
    public double getArea () {
        double area = this.width * this.height;
        return area;
    }

    /**
     * gets the distance from one corner of the rectangle to the opposite corner
     * @return the length of the diagonal distance
     */
    public double getDiagonal () {
        double diagonal = Math.pow(this.height, 2) + Math.pow(this.width, 2);
        return Math.sqrt(diagonal);
    }

    /**
     * gets the rectangle's perimeter
     * @return the perimeter
     */
    public double getPerimeter () {
        return (2* width) + (2* height);
    }
    public String toString (){
        String info = "Rect: Width: " + this.width + " Height: " + this.height;
        return info;
    }

}
