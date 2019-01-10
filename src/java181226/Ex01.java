package java181226;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input;
		while (true) {
			System.out.print("정수를 입력하세요 >>> ");
			input = sc.nextInt();
			if (input >= 10) {
				break;
			}
		}
		
		System.out.println("종료되었습니다.");
	}

}
