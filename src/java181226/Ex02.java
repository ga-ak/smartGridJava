package java181226;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ������ >>> ");
		int a = sc.nextInt();
		System.out.print("��ǥ ������ >>> ");
		int b = sc.nextInt();
		while (true) {
			if (b > a) {
				System.out.print("��ǥ�� ���� �����Ժ��� �����ϴ�. �ٽ��Է��ϼ��� >>> ");
				b = sc.nextInt();
			} else {
				break;
			}
		}
		int count = 1;
		int temp = a;
		while(true) {
			System.out.print((count++)+"���� ���� ������ : ");
			temp -= sc.nextInt();
			// ���� ���� 
			if(temp <= b) {
				break;
			}
		}
		System.out.println(temp+"kg �޼�!! �����մϴ�!");
	}

}
