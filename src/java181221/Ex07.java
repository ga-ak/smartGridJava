package java181221;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String inputData = sc.nextLine();
		
		switch (inputData) {
		case "�ȳ��ϼ���.":
			System.out.println("��, �ȳ��ϼ���!");
			break;
		case "�ݰ�����.":
			System.out.println("��, �ݰ�����!");
			break;
		case "�����ϼ���.":
			System.out.println("��, �����ϼ���!");
			break;
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			break;
		}
		

	}

}
