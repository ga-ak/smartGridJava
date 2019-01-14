package java_festival_practice;

import java.util.Scanner;

public class P19 {

    // 2차원 배열 왼쪽으로 90도 회전하여 출력

    public static void main(String[] args) {
        int[][] array = new int[5][5];
        int num = 1;

        // 배열 생성
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                array[i][j] = num;
                num++;
            }
        }

        // 배열 회전
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[j][array.length - 1 - i]+"\t");
            }
            System.out.println();
        }
    }
}
