package java181220;

public class Ex02 {

	public static void main(String[] args) {
		int a = 30;
		int b = 40;

		System.out.println(a > b);
		System.out.println(a == b);
		System.out.println(a != b);

		System.out.println((3 > 5) && (5 < 8)); // IDE에서 뒷 부분 연산에 경고표시 뜨는 이유 : 앞 연산이 false이기때문에 뒷 부분을 볼 필요도 없다.
		System.out.println((3 > 5) || (5 < 8));

		System.out.println(a > b ? "a가 더 크다" : "b가 더 크다");
	}

}
