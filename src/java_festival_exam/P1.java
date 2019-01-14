package java_festival_exam;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("일한시간을 입력하세요 : ");
        int workT = sc.nextInt();
        int result = 0;

        if (workT <= 8) {
            result = workT * 5000;
        } else {
            result = 8* 5000 + (workT-8)*7500;
        }

        System.out.println("총 임금은"+result+"원 입니다.");
    }
}
