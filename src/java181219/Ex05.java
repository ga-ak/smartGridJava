package java181219;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.print("Java ���� �Է� : ");
		int jScore = sc.nextInt();
		count++;
		System.out.print("Web ���� �Է� : ");
		int wScore = sc.nextInt();
		count++;
		System.out.print("Android ���� �Է� : ");
		int aScore = sc.nextInt();
		count++;

		int sum = jScore + wScore + aScore;
		double avg = (int)(((double) sum / count) * 100) / 100.0;

		System.out.println("\n�հ� : " + sum);
		System.out.println("��� : " + avg);
		sc.close();
	}

}
