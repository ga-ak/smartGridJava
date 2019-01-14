package java_festival_practice;

import java.util.Scanner;

public class P14 {

    // 문자열을 입력받아 알파벳 순서대로 정렬하여 반환하는 메소드를 구현하시오. 단, 대소문자는 구분한다.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        System.out.println(reverseStr(inputString));
    }

    public static String reverseStr(String inputString) {
        char[] charArray = inputString.toCharArray();

        for (int i = 0; i < charArray.length-1; i++) {
            int minValue = (int)charArray[i];
            int minIndex = i;
            for (int j = i + 1; j < charArray.length; j++) {
                if ((int) charArray[j] < minValue) {
                    minValue = charArray[j];
                    minIndex = j;
                }
            }
            int temp = charArray[i];
            charArray[i] = (char)minValue;
            charArray[minIndex] = (char)temp;
        }

        String result = String.valueOf(charArray);
        return result;
    }
}
