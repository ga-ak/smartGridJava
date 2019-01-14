package java_festival_exam;

import java.util.Random;

public class P5 {

    public static void main(String[] args) {
        int[] intArray = new int[8];

        for (int i = 1; i <= 8; i++) {
            intArray[i - 1] = i;
        }

        Random ran = new Random();

        for (int i = 0; i < intArray.length; i++) {
            int a = ran.nextInt(8);
            int b = ran.nextInt(8);

            int temp = intArray[a];
            intArray[a] = intArray[b];
            intArray[b] = temp;
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] < min) {
                min = intArray[i];
            }
            if (intArray[i] > max) {
                max = intArray[i];
            }
        }
        System.out.print("배열에 있는 모든 값 : ");
        for (int i : intArray) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("가장 큰 값 : " + max);
        System.out.println("가장 작은 값 : " + min);
    }
}
