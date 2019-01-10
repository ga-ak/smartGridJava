package java181228;

public class Ex06 {

	public static void main(String[] args) {
		// 피보나치 수열 20번째 항은?
		int a = 1;
		int b = 1;
		int c = 1;
		System.out.println(1+"\t"+1);
		System.out.println(2+"\t"+1);
		for (int i=0; i<18; i++) {
			c = a+b;
			b = a;
			a = c;
			System.out.println(i+3+"\t"+a);
		}

	}

}
