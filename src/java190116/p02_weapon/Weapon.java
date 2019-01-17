package java190116.p02_weapon;

public class Weapon {

    public void attack() {
        System.out.println(this.getClass().getSimpleName() + "일반공격!");
    }

    public void stab() {
        System.out.println(this.getClass().getSimpleName() + "일반찌르기");
    }

}
