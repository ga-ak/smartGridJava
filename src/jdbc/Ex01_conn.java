package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class Ex01_conn {



    public static void main(String[] args) {

        // jdbc:oracle:thin : 데이터베이스의 주소
        // 오라클 포트 : 1512, 교육용 버전 : xe
        String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
        String id = "hr";
        String pw = "HR";

        //jdbc 동적로딩
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // 연동
            Connection conn = DriverManager.getConnection(url, id, pw);

            if (conn != null) {
                System.out.println("연결성공!");
            } else {
                System.out.println("실패...");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
