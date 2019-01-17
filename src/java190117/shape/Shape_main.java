package java190117.shape;

public class Shape_main {

    //

    public static void main(String[] args) {
        Shape rec = new Shape_rec(5, 5);
        Shape squ = new Shape_squ(5, 5);
        Shape tri = new Shape_tri(5, 5);

        System.out.println(rec.area());
        System.out.println(squ.area());
        System.out.println(tri.area());
    }
}
