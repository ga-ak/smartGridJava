package java181221;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �� ���� �Է��ϼ��� : ");
		int month = sc.nextInt();
		String season = null;
		switch (month) {
		case 12:
			season = "�ܿ�";
			break; // break�� ���� ������ �Ʒ� ������ ��� ����Ǿ� ������. -> �������� �����Ű�� ���� �����̶�� break �Ⱦ��� ��
		case 1:
			season = "�ܿ�";
			break;
		case 2:
			season = "�ܿ�";
			break;
		case 3:
		case 4:
		case 5:
			season = "��";
			break;
		case 6:
		case 7:
		case 8:
			season = "����";
			break;
		case 9:
		case 10:
		case 11:
			season = "����";
			break;

		}
		
		System.out.println(month +"���� "+season+"�Դϴ�.");
	}

}
