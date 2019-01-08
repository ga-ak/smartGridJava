package temp;

import java.util.StringTokenizer;

public class Temp {
    public static void main(String[] args) {
        String a = "1 2 3 4 5 6 7 8 9 10";
        StringTokenizer st = new StringTokenizer(a);
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
