package java181221;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// 정보처리기사는 5과목을 가지고 있습니다
		// 데이터베이스, 전자계산기, 운영체제, 소프트웨어공학, 데이터통신
		// 평균 60점 이상, 과락 기준 40점
		
		// 5과목의 점수를 입력하라, 한 문제당 5점이다
		Scanner sc = new Scanner(System.in);
		int db,ec,os,se,dc;
		double avg;
		String result;
		
		System.out.print("데이터베이스 점수 : ");
		db = sc.nextInt();
		System.out.print("전자계산기 점수 : ");
		ec = sc.nextInt();
		System.out.print("운영체제 점수 : ");
		os = sc.nextInt();
		System.out.print("소프트웨어공학 점수 : ");
		se = sc.nextInt();
		System.out.print("데이터통신 점수 : ");
		dc = sc.nextInt();
		
		avg = (db+ec+os+se+dc)/5.0;
		
		if(db<40||ec<40||os<40||se<40||dc<40) {
			result = "불합격 -> 과락 ";
		} else if (avg<60) {
			result = "불합격 -> 평균미달 ";
		} else {
			result = "합격 ";
		}
		
		System.out.println(result + avg);
	}

}
