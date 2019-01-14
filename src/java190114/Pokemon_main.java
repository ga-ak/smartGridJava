package java190114;

public class Pokemon_main {

    public static void main(String[] args) {
        PokemonVO pikachu = new PokemonVO("피카츄", 75, 50, 100, true);
        PokemonVO mu = new PokemonVO("뮤", 150, 30, 80, true);

        System.out.println("=======포켓몬 배틀=======");
        System.out.println(pikachu.getName() + " VS " + mu.getName());
        String firstAttacker;

        if (pikachu.getSpeed() > mu.getSpeed()) {
            firstAttacker = pikachu.getName();
        } else {
            firstAttacker = mu.getName();
        }

        System.out.println(firstAttacker+"(이)가 선제공격!!!");

        while (true) {

        }

    }




}
