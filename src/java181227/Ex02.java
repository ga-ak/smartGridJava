package java181227;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		final String originId = "��öȣ";
		final String originPw = "12345";
		
		while (true) {
			System.out.println("[1] �α��� [2] ����");
			int condition = sc.nextInt();
			sc.nextLine();
			if (condition == 2) {
				break;
			} else if (condition == 1) {
				System.out.print("ID ? >>> ");
				String tempId = sc.nextLine();
				
				System.out.print("PASSWORD ? >>> ");
				String tempPw = sc.nextLine();
				
				if(originId.equals(tempId) && originPw.equals(tempPw)) {
					System.out.println(originId+" �� �α��� ����!");
					break;
				} else {
					if (!originId.equals(tempId)) {
						System.out.println(tempId+" �� ���� ���̵� �Դϴ�.");
					}
					if (!originPw.equals(tempPw)) {
						System.out.println("Ʋ�� ��й�ȣ�Դϴ�.");
					}
				}
			} else {
				System.out.println("�߸������̾��!");
			}
			
		}
		
		System.out.println("���α׷� ����!!");
	}

}
