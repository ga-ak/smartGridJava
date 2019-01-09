package java181219;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		System.out.println("결과확인1 \"/\" 사용 : " + (num / 100 * 100));
		System.out.println("결과확인2 \"%\" 사용 : " + (num - num % 100));
		
	}

}
