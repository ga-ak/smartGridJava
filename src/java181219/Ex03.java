package java181219;

public class Ex03 {
	public static void main(String[] args) {
		String a = 10 + 7 + ""; // 숫자와 문자열 연산 -> 문자열, 더하기 연산이기 때문에 앞부터 연산
		String b = 8 + "" + 2;
		String c = "" + 5 + 2;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		int num1 = 7;
		int num2 = 3;
		System.out.println("더하기 결과\t: " + (num1 + num2));
		System.out.println("빼기 결과\t: " + (num1 - num2));
		System.out.println("곱하기 결과\t: " + (num1 * num2));
		System.out.println("나누기결과\t: " + ((double) num1 / num2));
	}
}
