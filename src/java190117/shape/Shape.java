package java190117.shape;

public abstract class Shape {
    int height;
    int width;
    int r;

    public Shape(int r) {
        this.r = r;
    }

    public Shape(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public abstract double area();
}
