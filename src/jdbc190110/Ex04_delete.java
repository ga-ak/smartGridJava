package jdbc190110;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Ex04_delete {

    // delete 실습

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("회원 삭제 프로그램");
        System.out.print("삭제할 ID를 입력하세요 : ");
        String delId = sc.next();


        try {
            // 동적 로딩
            Class.forName("oracle.jdbc.driver.OracleDriver");

            String url = "jdbc190110:oracle:thin:@127.0.0.1:1521:xe";
            String id = "hr";
            String pw = "HR";

            // db와 자바 연결
            Connection conn = DriverManager.getConnection(url, id, pw);
            if (conn != null) {
                System.out.println("연결 성공");

            } else {
                System.out.println("연결 실패");
            }

            String sql = "DELETE FROM MEM WHERE ID=?";

            // sql 실행할 통로
            PreparedStatement psmt = conn.prepareStatement(sql);
            psmt.setString(1, delId);
            int cnt = psmt.executeUpdate();

            if (cnt > 0) {
                System.out.println("삭제 성공");
            } else {
                System.out.println("삭제 실패");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
