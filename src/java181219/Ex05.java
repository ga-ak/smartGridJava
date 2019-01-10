package java181219;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.print("Java 점수 입력 : ");
		int jScore = sc.nextInt();
		count++;
		System.out.print("Web 점수 입력 : ");
		int wScore = sc.nextInt();
		count++;
		System.out.print("Android 점수 입력 : ");
		int aScore = sc.nextInt();
		count++;

		int sum = jScore + wScore + aScore;
		double avg = (int)(((double) sum / count) * 100) / 100.0;

		System.out.println("\n합계 : " + sum);
		System.out.println("평균 : " + avg);
		sc.close();
	}

}
