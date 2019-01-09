package java190109;

public class Ex07 {

    // String 다루기

    public static void main(String[] args) {
        String data = "동해물과 백두산이 마르고 닳도록";
        String str1 = "마우스 ";
        String str2 = "마우스";

        // String 객체에서 특정 문자의 위치를 반환, 없으면 -1 반환함
        System.out.println(data.indexOf("동백산"));

        // String 객체에서 특정구간만 잘라서 반환
        System.out.println(data.substring(5, 8));

        // 문자열의 길이 반환
        System.out.println(data.length());

        // 해당 키워드를 포함하고 있는지 boolean으로 반환
        // equals랑 다른점 : equals는 모조리 같아야 true지만 contains는 일부분만 같아도 true반환한다.
        System.out.println(data.contains("동해"));

        // 문자열 대체
        System.out.println(data.replace("동해","서해"));

        // 양끝의 공백을 제거
        System.out.println(str1.trim().equals(str2));

        // 인덱스에 해당하는 문자열을 char형으로 반환
        System.out.println(data.charAt(3));

        // 기준으로 String을 잘라 String[]을 반환
        String[] split_data = data.split(" ");
        System.out.println(split_data[0]);

    }
}
