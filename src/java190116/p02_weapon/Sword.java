package java190116.p02_weapon;

public class Sword extends Weapon {
    @Override
    public void attack() {
        System.out.println(this.getClass().getSimpleName()+"검으로 공격!");
    }

    @Override
    public void stab() {
        System.out.println(this.getClass().getSimpleName()+"검으로 공격!");
    }
}
