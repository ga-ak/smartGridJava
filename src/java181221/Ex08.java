package java181221;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("User : ");
		String inputData = sc.nextLine();
		System.out.print("Com : ");
		if(inputData.equals("�ȳ��ϼ���")) {
			System.out.println("��, �ȳ��ϼ���!");
		}else if(inputData.equals("�ݰ�����")) {
			System.out.println("��, �ݰ�����!");
		}else if(inputData.equals("�����ϼ���")) {
			System.out.println("��, �����ϼ���!");
		}else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}

}
