package java190110;

public class Ex01 {

    // 객체 생성 실습 : Tv 클래스

    public static void main(String[] args) {

        // Tv 객체 생성
        Tv samsung = new Tv();

        // Tv 객체의 필드에 값 넣기
//        samsung.number = "S-01";
//        samsung.channel = 10;
//        samsung.volumn = 50;
//        samsung.power = false;
        samsung.printState();
        samsung.channeUp();
        samsung.changeColor("빨강");
        System.out.println();
        samsung.printState();

        // 또 다른 Tv 객체 생성
        Tv lg = new Tv();
    }

}
