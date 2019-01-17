package java190117.shape;

public class Shape_squ extends Shape {
    public Shape_squ(int height, int width) {
        super(height, width);
    }

    @Override
    public double area() {
        return this.height*this.width;
    }
}
