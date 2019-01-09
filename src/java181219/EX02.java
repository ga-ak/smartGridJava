package java181219;

public class EX02 {

	public static void main(String[] args) {
		// 논리형
		boolean boo = true; // false 도 가능
		System.out.println(boo);

		// 문자형
		char c = '가';
		System.out.println(c);

		// 정수형
		byte by = 1;
		System.out.println(by);
		short sh = 10;
		System.out.println(sh);
		int i = 100;
		System.out.println(i);
		long l = 1000l;
		System.out.println(l);
		// by = (byte)l;

		System.out.println(by + i);

		// 실수형
		float f = 10.23f;
		double d = 33.24;
		System.out.println(f + "\n" + d);

		// 문자열
		String s = "안녕";
		String s1 = "이제 곧 ";
		String s2 = "점심시간입니다.";
		System.out.println(s);
		System.out.println(s1 + s2);
		
		// 자동형변환
		byte b2 = 10; // 변수에 값을 넣어서 초기화 할 필요는 없다!
		int i2;
		
		i2 = b2;
		
		// 강제형변환
		float f2 = 10.23f;
		int i3 = 10;
		i3 = (int)f2;
		System.out.println(i3);
	}

}
