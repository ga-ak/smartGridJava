package java_festival_practice;

import java.util.Scanner;

public class P18 {

    // 배열 s자로 출력하기

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input number : ");
        int num = scan.nextInt();
        int n = 1;

        int[][] array = new int[num][num];

        for(int i = 0; i < num; i++) {
            for(int j = 0; j < num; j++) {
                array[i][j] = n;
                n++;
            }
        }
        for(int i = 0; i < num; i++) {
            for(int j = 0; j < num; j++) {
                System.out.print(array[j][i] + "\t");
            }
            System.out.println();
        }
    }

}
