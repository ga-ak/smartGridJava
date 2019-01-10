package java181221;

import java.util.Scanner;

public class Ex09_1 {

	public static void main(String[] args) {
		// if 이용 자판기 예제
		Scanner sc = new Scanner(System.in);
		int money;
		int beverage;
		int cost = 0;
		int result;
		int cola = 800;
		int water = 500;
		int vitamin = 1500;
		System.out.print("금액을 입력하세요 >>> ");
		money = sc.nextInt();
		System.out.println("메뉴를 고르세요");
		System.out.printf("1. 콜라(%d원) 2. 생수(%d원) 3. 비타민 워터(%d원) >>> ",cola, water, vitamin);
		beverage = sc.nextInt();
		
		if(beverage == 1) {
			cost = cola;
		} else if(beverage == 2) {
			cost = water;
		} else if(beverage == 3) {
			cost = vitamin;
		}
		
		result = money - cost;
		
		System.out.println(result>=0 ? "잔돈 : "+result : "돈이 "+(-1*result)+"원 부족합니다. >>> "+money+"원반납!");
		int a,b,c;
		a = result / 1000;
		result %= 1000;
		
		b = result / 500;
		result %= 500;
		
		c = result / 100;
		result %= 100;
		
		System.out.printf("천원 : %d개, 오백원 : %d개, 백원 %d개",a,b,c);
		
	}

}
