package java181221;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 5�� ���� �ڽ��� �Է¹��� �󱸰��� �������� �� ���� �ڽ��� �ʿ��Ѱ�?
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�󱸰��� ������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		System.out.println("�ʿ��� ������ �� : " + (num % 5 == 0 ? num / 5 : num / 5 + 1));
		// �Է¹��� ���� 5�� ������ �������� ���� �ʿ��� ���� ��, �ƴ϶�� ���ڰ� �ϳ� �� �ʿ���
		
	}

}
