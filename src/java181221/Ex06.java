package java181221;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 월 인지 입력하세요 : ");
		int month = sc.nextInt();
		String season = null;
		switch (month) {
		case 12:
			season = "겨울";
			break; // break를 쓰지 않으면 아래 문장이 모두 실행되어 버린다. -> 연속으로 실행시키고 싶은 문장이라면 break 안쓰면 됨
		case 1:
			season = "겨울";
			break;
		case 2:
			season = "겨울";
			break;
		case 3:
		case 4:
		case 5:
			season = "봄";
			break;
		case 6:
		case 7:
		case 8:
			season = "여름";
			break;
		case 9:
		case 10:
		case 11:
			season = "가을";
			break;

		}
		
		System.out.println(month +"월은 "+season+"입니다.");
	}

}
