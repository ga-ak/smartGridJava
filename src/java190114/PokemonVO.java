package java190114;

public class PokemonVO {
    private String name;
    private int hp;
    private int attack;
    private int speed;
    private boolean state;

    public PokemonVO(String name, int hp, int attack, int speed, boolean state) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.speed = speed;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}
