package java190117.shape;

public class Shape_tri extends Shape {
    public Shape_tri(int height, int width) {
        super(height, width);
    }

    @Override
    public double area() {
        return this.height*this.width*0.5;
    }
}
