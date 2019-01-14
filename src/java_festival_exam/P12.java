package java_festival_exam;

import java.util.Scanner;

public class P12 {
    public static void main(String[] args) {
        int[] numValue = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};

        Scanner sc = new Scanner(System.in);
        System.out.print("첫 자리0을 제외한 숫자를 입력해주세요 >> ");
        String tempS = sc.next();
        int result = 0;

        for (int i = 0; i < tempS.length(); i++) {
            int index = Integer.parseInt(tempS.substring(i, i + 1));

            result += numValue[index];
        }

        System.out.println("대시의 총 합 : "+result);
    }
}
