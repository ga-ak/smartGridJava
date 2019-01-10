package java190110;

public class Tv {
    // Tv클래스의 필드 선언
    private String number;
    private int channel;
    private int volumn;
    private boolean power;
    private String color;

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
        power = !power;
    }

    public void changeColor(String color) {
        this.color = color;
        //System.out.println(this.color);
    }

    // 객체 메소드 안에 System.out.println()을 쓰는게 안좋은 이유 : 콘솔에만 출력가능한 메소드로 제한되어버린다
    public String printState() {
//        System.out.println("number : "+this.number);
//        System.out.println("channel : "+this.channel);
//        System.out.println("volumn : "+this.volumn);
//        System.out.println("power : "+this.power);
//        System.out.println("color : "+this.color);

        String result = this.number+" "+this.channel+" "+this.volumn+" "+this.power+" "+this.color;

        return result;
    }




}
