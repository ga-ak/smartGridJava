package java181228;

public class Ex03 {
	// 하이
	public static void main(String[] args) {
		int sum = 0;
		for (int i=1; i<=78; i++) {
			sum += (79-i) * (i);
		}
		System.out.println(sum);
	}

}
