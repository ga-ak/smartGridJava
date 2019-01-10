package java181226;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("현재 몸무게 >>> ");
		int a = sc.nextInt();
		System.out.print("목표 몸무게 >>> ");
		int b = sc.nextInt();
		while (true) {
			if (b > a) {
				System.out.print("목표가 현재 몸무게보다 높습니다. 다시입력하세요 >>> ");
				b = sc.nextInt();
			} else {
				break;
			}
		}
		int count = 1;
		int temp = a;
		while(true) {
			System.out.print((count++)+"주차 감량 몸무게 : ");
			temp -= sc.nextInt();
			// 종료 조건 
			if(temp <= b) {
				break;
			}
		}
		System.out.println(temp+"kg 달성!! 축하합니다!");
	}

}
