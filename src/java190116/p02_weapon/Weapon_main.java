package java190116.p02_weapon;

public class Weapon_main {

    //

    public static void main(String[] args) {
        Weapon w = new Weapon();
        Sword s = new Sword();
        Ax a = new Ax();

        w.attack();
        s.attack();
        a.attack();
    }
}
