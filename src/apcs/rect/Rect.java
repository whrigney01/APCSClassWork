package apcs.rect;

public class Rect {
    private double width;
    private  double height;

    public Rect(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public Rect () {
        this.width = 0.0;
        this.height = 0.0;
    }
    public double getWidth () {
        return this.width;
    }
    public void setWidth (double w) {
        this.width = w;
    }
    public double getHeight() {
        return  this.height;
    }
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
    public double getArea () {
        double area = this.width * this.height;
        return area;
    }
    public double getDiagonal () {
        double diagonal = Math.pow(this.height, 2) + Math.pow(this.width, 2);
        return Math.sqrt(diagonal);
    }
    public double getPerimeter () {
        return (2* width) + (2* height);
    }
    public String toString (){
        String info = "Rect: Width: " + this.width + " Height: " + this.height;
        return info;
    }

}
