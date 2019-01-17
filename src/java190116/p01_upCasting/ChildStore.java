package java190116.p01_upCasting;

public class ChildStore extends ParentStore {
    @Override
    public void jajang() {
        System.out.println(this.getClass().getSimpleName() + "더 특별한 짜장면을 만듭니다.");
    }

    public void tangsu() {
        System.out.println(this.getClass().getSimpleName() + "탕수육을 만듭니다");
    }
}
