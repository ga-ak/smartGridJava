package java_festival_practice;

import java.util.StringTokenizer;

public class P10 {

    // 아래와 같이 학생들의 성적정보가 문자열로 선언되어 있을 때 각 성적 별 학생 수를 출력하시오
    // String score = "A,A,B,C,D,A,C,D,D,D,F"

    public static void main(String[] args) {
        String score = "A,A,B,C,D,A,C,D,D,D,F";
        StringTokenizer st = new StringTokenizer(score,",");

        String[] basket = {"A", "B", "C", "D", "F"};
        int[] result = new int[5];
        int n = st.countTokens();

        for (int i = 0; i < n; i++) {
            String tempStr = st.nextToken();
            for (int j = 0; j < basket.length; j++) {
                if (tempStr.equals(basket[j])) {
                    result[j]++;
                }
            }
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println(basket[i]+" : "+result[i]+"명");
        }
    }
}
