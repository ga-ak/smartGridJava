package java190116.p03_photoshop;

import java.util.Scanner;

public class Shape_main {

    //

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("[1]원 [2]직사각형 [3]삼각형");
        int choice = sc.nextInt();
        System.out.print("색상을 입력해주세요 >> ");
        String color = sc.next();
        Shape s;

        if (choice == 1) {
            class Circle extends Shape {
                public Circle(String color) {
                    super(color);
                }

                @Override
                public void draw() {
                    System.out.println(getColor()+"원을 그립니다.");
                }
            }

            // 업캐스팅
            s = new Circle(color);
            s.draw();
        } else if (choice == 2) {
            class Rectangle extends Shape {
                public Rectangle(String color) {
                    super(color);
                }

                @Override
                public void draw() {
                    System.out.println(getColor()+"사각형을 그립니다.");
                }
            }
            s = new Rectangle(color);
            s.draw();
        } else if (choice == 3) {
            class triangle extends Shape {
                public triangle(String color) {
                    super(color);
                }

                @Override
                public void draw() {
                    System.out.println(getColor()+"삼각형을 그립니다.");
                }
            }
            s = new triangle(color);
            s.draw();
        }
    }
}
