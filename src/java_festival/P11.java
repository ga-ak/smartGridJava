package java_festival;

import java.util.Scanner;

public class P11 {

    // 아래와 같이 1차원의 점들이 주어졌을 때, 그 중 거리가 짧은 점(index)들을 출력하시오
    // 단, 점들 사이의 거리는 모두 다르다
    // int[] point = {92, 32, 52, 9, 81, 2, 68};

    public static void main(String[] args) {
        int[] point = {92, 32, 52, 9, 81, 2, 68};
        Scanner sc = new Scanner(System.in);
        int minValue = Integer.MAX_VALUE;
        int[] result = new int[2];

        for (int i = 0; i < point.length; i++) {
            for (int j = i + 1; j < point.length; j++) {
                if (Math.abs(point[i] - point[j]) < minValue) {
                    minValue = Math.abs(point[i] - point[j]);
                    result[0] = i;
                    result[1] = j;
                }
            }
        }

        System.out.println("result = ["+result[0]+", "+result[1]+"]");
    }
}
