package java181221;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("User : ");
		String inputData = sc.nextLine();
		System.out.print("Com : ");
		if(inputData.equals("안녕하세요")) {
			System.out.println("네, 안녕하세요!");
		}else if(inputData.equals("반가워요")) {
			System.out.println("네, 반가워요!");
		}else if(inputData.equals("수고하세요")) {
			System.out.println("네, 수고하세요!");
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}

}
