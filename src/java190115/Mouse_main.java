package java190115;

public class Mouse_main {

    //

    public static void main(String[] args) {
        BasicMouse basicMouse = new BasicMouse();
        WheelMouse wheelMouse = new WheelMouse();
        GamingMouse gamingMouse = new GamingMouse();
        basicMouse.leftClick();
        wheelMouse.wheel();
        wheelMouse.leftClick();
        gamingMouse.leftClick();
        gamingMouse.drag();
        gamingMouse.wClick();

    }
}
