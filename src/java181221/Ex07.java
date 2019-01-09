package java181221;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String inputData = sc.nextLine();
		
		switch (inputData) {
		case "안녕하세요.":
			System.out.println("네, 안녕하세요!");
			break;
		case "반가워요.":
			System.out.println("네, 반가워요!");
			break;
		case "수고하세요.":
			System.out.println("네, 수고하세요!");
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
			break;
		}
		

	}

}
