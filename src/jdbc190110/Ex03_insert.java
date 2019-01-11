package jdbc190110;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Ex03_insert {

    //

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("회원가입 시스템");
        System.out.println("id >> ");
        String inputId = sc.next();
        System.out.println("password >> ");
        String inputPw = sc.next();
        System.out.println("age >> ");
        int inputAge = sc.nextInt();
        System.out.println("tel >> ");
        String inputTel = sc.next();

        // 동적 로딩
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            String url = "jdbc190110:oracle:thin:@127.0.0.1:1521:xe";
            String id = "hr";
            String pw = "HR";

            Connection conn = DriverManager.getConnection(url, id, pw);

            if (conn != null) {
                System.out.println("연결성공!");
            } else {
                System.out.println("연결실패...");
            }

            // sql 문장의 매개변수 : "?"
            String sql = "INSERT INTO MEM VALUES(?,?,?,?)";

            // 실행문장 연결 해주는 PreparedStatement
            PreparedStatement psmt = conn.prepareStatement(sql);

            // psmt에 있는 sql문장의 매개변수에 변수 넣음 인덱스 1부터 시작
            psmt.setString(1, inputId);
            psmt.setString(2, inputPw);
            psmt.setInt(3, inputAge);
            psmt.setString(4, inputTel);

            int cnt = psmt.executeUpdate();

            if (cnt > 0) {
                System.out.println("데이터 삽입 성공");
            } else {
                System.out.println("데이터 삽입 실패...");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
