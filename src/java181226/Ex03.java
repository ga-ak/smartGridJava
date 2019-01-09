package java181226;

import java.util.Random;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// 1. 랜덤수 하나 뽑기
		// 2. 사용자가 숫자를 입력한다
		// 3. 랜덤수 > 숫자 -> up 출력
		// 4. 맞추면 게임종료

		//int ranNum = (int) (Math.random() * 99 + 1);
		int max = 99;
		int min = 1;
		int num = new Random().nextInt(max) + min;
		Scanner sc = new Scanner(System.in);
		int count = 1;
		System.out.printf("%d ~ %d사이의 정수를 입력하세요 >>> ",min,max);
		while (true) {
			int input = sc.nextInt();
			if (input == num) {
				break;
			} else if (input>num) {
				System.out.print("더 작은 수를 입력하세요 >>> ");
			} else if (input<num) {
				System.out.print("더 큰 수를 입력하세요 >>> ");
			}
			count++;
		}
		System.out.println(count+"번만에 맞추셨습니다!");

	}

}
