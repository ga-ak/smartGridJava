package java181219;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		System.out.println("���Ȯ��1 \"/\" ��� : " + (num / 100 * 100));
		System.out.println("���Ȯ��2 \"%\" ��� : " + (num - num % 100));
		
	}

}
