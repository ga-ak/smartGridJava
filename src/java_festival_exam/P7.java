package java_festival_exam;

import java.util.Scanner;

public class P7 {

    public static char[] sort(char[] temp) {
        for (int i = 0; i < temp.length; i++) {
            int min = (int)temp[i];
            int minIndex = i;

            for (int j = i + 1; j < temp.length; j++) {
                if ((int) temp[j] < min) {
                    min = (int) temp[j];
                    minIndex = j;
                }

            }
            int tempI = (int)temp[i];
            temp[i] = (char)min;
            temp[minIndex] = (char)tempI;
        }

        return temp;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String temp = sc.next();
        char[] result = temp.toCharArray();

        result = sort(result);

        for (char c : result) {
            System.out.print(c);
        }

    }
}
