package java181220;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		System.out.println(num % 2 == 0 ? num + "��(��) ¦���Դϴ�." : num + "��(��) Ȧ���Դϴ�.");
		//������ ������ if ������ ���׿����ڰ� ������.

	}

}
