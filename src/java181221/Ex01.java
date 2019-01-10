package java181221;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 5개 들이 박스에 입력받은 농구공을 넣으려면 몇 개의 박스가 필요한가?
		Scanner sc = new Scanner(System.in);
		
		System.out.print("농구공의 개수를 입력하세요 : ");
		int num = sc.nextInt();
		
		System.out.println("필요한 상자의 수 : " + (num % 5 == 0 ? num / 5 : num / 5 + 1));
		// 입력받은 수가 5로 나누어 떨어지면 몫이 필요한 상자 수, 아니라면 상자가 하나 더 필요함
		
	}

}
