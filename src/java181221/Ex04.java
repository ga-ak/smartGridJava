package java181221;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int totalScore;
		System.out.print("점수를 입력하세요 : ");
		totalScore = sc.nextInt();
		String result = null;
		if (totalScore > 90) {
			result = "A";
		} else if (totalScore >= 80) { // 윗 if 에서 이미 90미만임이 입증되었기 때문에 조건을 쓸 필요 없다.
			result = "B";
		} else if (totalScore >= 70) {
			result = "C";
		} else if (totalScore < 70) {
			result = "D";
		}

		System.out.println(result + "학점 입니다.");
	}

}
