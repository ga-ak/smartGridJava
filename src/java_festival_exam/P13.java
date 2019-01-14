package java_festival_exam;

import java.util.Scanner;

public class P13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 1).equals("1")) {
                result += Math.pow(2, str.length() - 1-i);
            }
        }
        System.out.println(result);
    }
}
