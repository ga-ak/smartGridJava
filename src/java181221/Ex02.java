package java181221;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int workTime;
		int standard = 8;
		int fee = 5000;
		System.out.print("노동시간을 입력하세요 : ");
		workTime = sc.nextInt();

		System.out.println("총 임금은 "
				+ (workTime > standard ? (int) ((workTime - standard) * fee * 1.5 + (standard * fee)) : workTime * fee)
				+ "입니다");

	}

}
