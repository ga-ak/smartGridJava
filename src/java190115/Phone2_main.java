package java190115;

public class Phone2_main {


    public static void main(String[] args) {
        Phone p = new Phone();
        SmartPhone sp = new SmartPhone();
        p.makeCall();
        p.receiveCall();
        sp.makeCall();
        sp.receiveCall();
        sp.startMusic();
        sp.internet();
        System.out.println(p);

    }


}
