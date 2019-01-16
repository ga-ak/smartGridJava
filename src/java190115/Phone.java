package java190115;

public class Phone {

    public void receiveCall() {
        System.out.println("전화 받았습니다."+this.getClass().getSimpleName());
    }

    public void makeCall() {
        System.out.println("전화 걸겠습니다."+this.getClass().getSimpleName());
    }

    @Override
    public String toString() {
        return "김철호가 주소 바꿔버림 헤헤";
    }
}
