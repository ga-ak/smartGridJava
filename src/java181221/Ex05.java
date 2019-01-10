package java181221;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		String result = "홀수";
		if (num % 2 == 0) {
			result = "짝수";
		} 
		
		System.out.println(num+"은(는) "+result+"입니다.");
	}

}
