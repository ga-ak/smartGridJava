package java181220;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		System.out.print("첫 번째 정수 입력 : ");
		num1 = sc.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		num2 = sc.nextInt();
		System.out.println(num1 > num2 ? "두수의 차 : " + (num1 - num2) : "두수의 차 :" + (num2 - num1));
		
	}
	
}
