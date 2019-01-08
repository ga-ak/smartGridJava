package java_festival;

import java.util.Scanner;

public class P13 {

    // 5개의 정수를 입력 받아 오름차순 정렬하여 출력하는 프로그램을 구현하시오(선택정렬)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] intArray = new int[5];

        for (int i = 0; i < intArray.length; i++) {
            System.out.print(i+1 + "번째 수 입력 : ");
            intArray[i] = sc.nextInt();
        }

        for (int i = 0; i < intArray.length-1; i++) {
            int min = intArray[i];
            int minIndex = i;
            for (int j = i+1; j < intArray.length; j++) {
                if (intArray[j] < min) {
                    min = intArray[j];
                    minIndex = j;
                }
            }
            int temp = intArray[i];
            intArray[i] = min;
            intArray[minIndex] = temp;
        }

        System.out.println("정렬 후");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i]+" ");
        }
    }
}
