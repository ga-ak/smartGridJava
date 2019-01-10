package java190110;

public class Tv {
    // Tv클래스의 필드 선언
    private String number;
    private int channel;
    private int volumn;
    private boolean power;

    // 채널 올리는 메소드
    public void channeUp() {
        channel++;
    }

    public void channeDown() {
        channel--;
    }

    public void volumnUp() {
        volumn++;
    }

    public void volumnDown() {
        volumn--;
    }

    public void powerOnOff() {
        if (power == false) {
            power = true;
        } else {
            power = false;
        }
    }


}
