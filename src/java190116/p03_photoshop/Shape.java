package java190116.p03_photoshop;

public class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public void draw() {
        System.out.println("도형을 그립니다.");
    }

    public String getColor() {
        return color;
    }
}
