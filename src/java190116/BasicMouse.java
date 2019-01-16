package java190116;

public class BasicMouse {

    public void leftClick() {
        System.out.println(this.getClass().getSimpleName()+"좌클릭하기");
    }

    public void rightClick() {
        System.out.println(this.getClass().getSimpleName()+"우클릭하기");
    }

    public void drag() {
        System.out.println(this.getClass().getSimpleName()+"드래그하기");
    }
}
