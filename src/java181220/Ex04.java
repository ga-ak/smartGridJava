package java181220;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		System.out.print("ù ��° ���� �Է� : ");
		num1 = sc.nextInt();
		System.out.print("�� ��° ���� �Է� : ");
		num2 = sc.nextInt();
		System.out.println(num1 > num2 ? "�μ��� �� : " + (num1 - num2) : "�μ��� �� :" + (num2 - num1));
		
	}
	
}
