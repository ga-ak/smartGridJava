package java190117.shape;

public class Shape_cir extends Shape {
    final double PI = 3.141592;

    public Shape_cir(int r) {
        super(r);
    }

    @Override
    public double area() {
        return r*r* PI;
    }

}
