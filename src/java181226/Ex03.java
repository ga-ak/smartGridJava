package java181226;

import java.util.Random;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// 1. ������ �ϳ� �̱�
		// 2. ����ڰ� ���ڸ� �Է��Ѵ�
		// 3. ������ > ���� -> up ���
		// 4. ���߸� ��������

		//int ranNum = (int) (Math.random() * 99 + 1);
		int max = 99;
		int min = 1;
		int num = new Random().nextInt(max) + min;
		Scanner sc = new Scanner(System.in);
		int count = 1;
		System.out.printf("%d ~ %d������ ������ �Է��ϼ��� >>> ",min,max);
		while (true) {
			int input = sc.nextInt();
			if (input == num) {
				break;
			} else if (input>num) {
				System.out.print("�� ���� ���� �Է��ϼ��� >>> ");
			} else if (input<num) {
				System.out.print("�� ū ���� �Է��ϼ��� >>> ");
			}
			count++;
		}
		System.out.println(count+"������ ���߼̽��ϴ�!");

	}

}
