package java190116.p02_weapon;

public class Ax extends Weapon {
    @Override
    public void attack() {
        System.out.println(this.getClass().getSimpleName()+"도끼로 공격!");
    }

    @Override
    public void stab() {
        System.out.println(this.getClass().getSimpleName()+"도끼로 찌르기!");
    }
}
