package jdbc190110;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Ex02_insert {

    // ojdbc로 데이터 insert

    public static void main(String[] args) {

        String url = "jdbc190110:oracle:thin:@127.0.0.1:1521:xe";
        String id = "hr";
        String pw = "HR";

        // 동적 로딩
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection conn = DriverManager.getConnection(url, id, pw);

            if (conn != null) {
                System.out.println("연결성공!");
            } else {
                System.out.println("연결실패...");
            }

            String sql = "INSERT INTO MEM VALUES('철호', '1234', 27, '010-2014-2889')";

            PreparedStatement psmt = conn.prepareStatement(sql);

            // sql문 실행하는 메소드 주로 INSERT, DELETE, UPDATE문에 사용
            // 실행이 되면 int를 반환함 실행될 때마다 1증가한 값 반환
            int cnt = psmt.executeUpdate();

            if (cnt > 0) {
                System.out.println("데이터 삽입 성공!!!");
            } else {
                System.out.println("데이터 삽입 실패...");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
