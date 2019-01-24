package java190123.phone;

public interface Phone extends Camera {

    // 인터페이스끼리 상속받을 때는 extends를 사용한다.
    // 인터페이스 사이에서 extends는 상속과는 조금 다른 개념.
    void call();
    void receive();
}
