package java181227;

import java.util.Random;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 1. ��ġ�� �ʴ� 3���� ����
		
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		int tempA,tempB,tempC;
		int min = 1;
		int max = 20;
		int count = 1;
		a = new Random().nextInt(max) + min;
		
		while(true) {
			b = new Random().nextInt(max) + min;
			if (b != a) {
				break;
			}
		}
		
		while(true) {
			c = new Random().nextInt(max) + min;
			if (c != a && c != b) {
				break;
			}
		}
		
		System.out.printf("�ų��� �߱�����!\n%d\t%d\t%d\n",a,b,c);
		
		while(true) {
			int strike = 0;
			int ball = 0;
			System.out.print("\nù ��° ���� �Է� >>> ");
			tempA = sc.nextInt();
			System.out.print("�� ��° ���� �Է� >>> ");
			tempB = sc.nextInt();
			System.out.print("�� ��° ���� �Է� >>> ");
			tempC = sc.nextInt();
			
			if (a==tempA && b==tempB && c==tempC) {
				break;
			}
			if (a==tempA) {
				strike ++;
			}
			if (b==tempB) {
				strike ++;
			}
			if (c==tempC) {
				strike ++;
			}
			if (tempA==b || tempA==c) {
				ball++;
			}
			if (tempB==a || tempB==c) {
				ball++;
			}
			if (tempC==a || tempC==b) {
				ball++;
			}
			if (strike==0 && ball==0) {
				System.out.println("OUT!");
			} else {
				System.out.printf("%d ball %d strike\n",ball,strike);
			}
			count++;
		}
		System.out.println("\nStrike!!! "+count+"�� ���� ������!");
	}

}
