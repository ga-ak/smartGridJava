package java181226;

import java.util.Random;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// minusGame
		// 1. �������� �� ���� �̴´�. (1~9) -> ���� ������ �� ����.
		// 2. ������ ��� (7 - 1 = ?)
		// 3. Ʋ������ "��û��...." ���
		// 4. �� �Է� �Ŀ��� ���������� ��µ�
		// 5. ��ȸ(life)�� �� 3��

		int life = 3;
		int a, b;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		while (life>0) {
			a = new Random().nextInt(9) + 1;
			b = new Random().nextInt(a) + 1;
			
			int result = a - b;
			System.out.printf("%d - %d = ",a,b);
			if (sc.nextInt() != result) {
				System.out.println("��û��..... life : "+(--life));
				
			} else {
				count++;
			}
		}
		System.out.printf("���� ������ : %d��",count);
	}

}
