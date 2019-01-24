package java190123.phone;

public class SmartPhone implements Phone, Camera {

    //Phone 인터페이스 구현
    @Override
    public void call() {
        System.out.println("자동으로 전화걸기");
    }

    @Override
    public void receive() {
        System.out.println("밀어서 전화 받기");
    }


    // Camera 인터페이스 구현
    @Override
    public void pick() {
        System.out.println("고화질로 찍는다");
    }
}
