package java_festival_exam;

import java.util.Scanner;

public class P8 {

    public static boolean isHarshad(int input) {
        boolean result = false;

        String workS = Integer.toString(input);
        int sum = 0;

        for (int i = 0; i < workS.length(); i++) {
            sum += Integer.parseInt(workS.substring(i, i + 1));
        }

        if (input % sum == 0) {
            result = true;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(isHarshad(sc.nextInt()));
    }
}
