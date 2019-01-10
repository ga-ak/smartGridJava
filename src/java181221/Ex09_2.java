package java181221;

import java.util.Scanner;

public class Ex09_2 {

	public static void main(String[] args) {
		// switch 사용 자판기 예제
		Scanner sc = new Scanner(System.in);
		int money, beverage, cost = 0, result;
		
		System.out.print("금액을 입력하세요 >>> ");
		money = sc.nextInt();
		System.out.println("메뉴를 고르세요");
		System.out.print("1. 콜라(800원) 2. 생수(500원) 3. 비타민 워터(1500원) >>> ");
		beverage = sc.nextInt();
		
		switch (beverage) {
		case 1:
			cost = 800;
			break;
		case 2:
			cost = 500;
			break;
		case 3:
			cost = 1500;
			break;	
		}
		
		result = money - cost;
		System.out.println(result>=0 ? "잔돈 : "+result : "돈이 "+(-1*result)+"원 부족합니다");

	}

}
