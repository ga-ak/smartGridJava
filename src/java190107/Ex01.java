package java190107;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        // 한번에 2차원 배열 선언
        int sum = 0;
        int[][] total = new int[3][5];
        int[] answer = {4, 5, 4, 1, 2};
        int[] score = {10, 20, 30, 20, 20};
        total[0] = answer;
        total[2] = score;

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<total[1].length; i++) {
            total[1][i] = sc.nextInt();
        }

        for(int i=0; i<total[1].length; i++) {
            if(total[0][i] == total[1][i]) {
                sum += total[2][i];
                System.out.print("O");
            }else {
                System.out.print("X");
            }
            System.out.print("\t");
        }

        System.out.println("\n"+sum);

    }
}
