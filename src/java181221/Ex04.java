package java181221;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int totalScore;
		System.out.print("������ �Է��ϼ��� : ");
		totalScore = sc.nextInt();
		String result = null;
		if (totalScore > 90) {
			result = "A";
		} else if (totalScore >= 80) { // �� if ���� �̹� 90�̸����� �����Ǿ��� ������ ������ �� �ʿ� ����.
			result = "B";
		} else if (totalScore >= 70) {
			result = "C";
		} else if (totalScore < 70) {
			result = "D";
		}

		System.out.println(result + "���� �Դϴ�.");
	}

}
