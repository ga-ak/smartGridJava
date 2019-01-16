package java190115;

public class SmartPhone extends Phone {
    public void startMusic() {
        System.out.println("음악 재생"+this.getClass().getSimpleName());
    }

    public void internet() {
        System.out.println("인터넷"+this.getClass().getSimpleName());
    }

    public void receiveCall() {
        System.out.println("smartphone 전화받았습니다"+this.getClass().getSimpleName());
    }
}
