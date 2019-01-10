package java181220;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		System.out.println(num % 2 == 0 ? num + "는(은) 짝수입니다." : num + "는(은) 홀수입니다.");
		//간단한 문장은 if 문보다 삼항연산자가 빠르다.

	}

}
