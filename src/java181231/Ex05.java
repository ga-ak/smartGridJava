package java181231;

public class Ex05 {

	public static void main(String[] args) {
		// 구구단 세로로 출력
				for (int i=1; i<=9; i++) {
					
					for (int j=2; j<=9; j++) {
						System.out.print(j+"*"+i+"="+(j*i)+"\t");
					}
					System.out.println();
				}

	}

}
