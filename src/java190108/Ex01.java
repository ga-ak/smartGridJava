package java190108;

import java.util.ArrayList;

public class Ex01 {
    public static void main(String[] args) {
        // ArrayList -> 가변배열

        ArrayList<String> data = new ArrayList<String>();

        data.add("키위");
        data.add("딸기");
        data.add("복숭아");
        data.add("오렌지");

        System.out.println(data.get(3));
        data.add(2, "포도");

        data.remove(0);
        System.out.println(data.get(0));

        //data.add(8,"이건 안되는 거여");
    }
}
