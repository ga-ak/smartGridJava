package java190116.p04_toy;

import java.util.ArrayList;
import java.util.Random;

public class Toy_main {


    public static void main(String[] args) {
        ArrayList<Toy> toyArrayList = new ArrayList<>();
        Random ran = new Random();

        toyArrayList.add(new Toy_poki());
        toyArrayList.add(new Toy_bear());
        toyArrayList.add(new Toy_kakao());

        int whichToy = ran.nextInt(toyArrayList.size());

        toyArrayList.get(whichToy).pick();

    }
}
