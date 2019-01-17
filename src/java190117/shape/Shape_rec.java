package java190117.shape;

public class Shape_rec extends Shape {

    public Shape_rec(int height, int width) {
        super(height, width);
    }

    @Override
    public double area() {
        return this.height*this.width;
    }
}
