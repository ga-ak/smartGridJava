package java181219;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		
		System.out.print("잔돈계산 - 금액을 입력하세요 >>> ");
		Scanner sc = new Scanner(System.in);
		
		int money = sc.nextInt();
		int tenThou, fiveThou, thou, fiveHen, hen;
		
		tenThou = money / 10000;
		money %= 10000;
		fiveThou = money / 5000;
		money %= 5000;
		thou = money / 1000;
		money %= 1000;
		fiveHen = money / 500;
		money %= 500;
		hen = money / 100;
		money %= 100;
		
		System.out.println("10000\t: " + tenThou);
		System.out.println("5000\t: " + fiveThou);
		System.out.println("1000\t: " + thou);
		System.out.println("500\t: " + fiveHen);
		System.out.println("100\t: " + hen);
	}
}
