package java181231;

public class Ex04 {

	public static void main(String[] args) {
		// 구구단 가로로 출력
		for (int i=2; i<=9; i++) {
			System.out.print(i+"단 : ");
			for (int j=1; j<=9; j++) {
				System.out.print(i+"*"+j+"="+(j*i)+"\t");
			}
			System.out.println();
		}

	}

}
