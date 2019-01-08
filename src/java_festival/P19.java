package java_festival;

import java.util.Scanner;

public class P19 {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        int num = 1;

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                array[i][j] = num;
                num++;
            }
        }
        for(int i = 4; i >= 0; i--) {
            for(int j = 0; j < 5; j++) {
                System.out.print(array[j][i] + "\t");
            }
            System.out.println();
        }

    }
}
