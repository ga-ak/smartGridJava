package java181227;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		final String originId = "김철호";
		final String originPw = "12345";
		
		while (true) {
			System.out.println("[1] 로그인 [2] 종료");
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
					System.out.println(originId+" 님 로그인 성공!");
					break;
				} else {
					if (!originId.equals(tempId)) {
						System.out.println(tempId+" 는 없는 아이디 입니다.");
					}
					if (!originPw.equals(tempPw)) {
						System.out.println("틀린 비밀번호입니다.");
					}
				}
			} else {
				System.out.println("잘못누르셨어요!");
			}
			
		}
		
		System.out.println("프로그램 종료!!");
	}

}
