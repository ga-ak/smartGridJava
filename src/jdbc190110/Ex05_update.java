package jdbc190110;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex05_update {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("회원 수정하는 프로그램");
        System.out.print("수정할 id를 입력하세요 >> ");
        String updateId = "철호";
        System.out.println("수정할 내용을 입력하세요");
        System.out.print("1.pw 2.tel >> ");
        int choice = 1;
        String col = choice == 1 ? "PW" : "TEL";
        System.out.println(col);
        System.out.println("수정할 데이터 입력 >> ");
        String inputData = "철호가";
        Connection conn = null;
        PreparedStatement psmt = null;

        try {

            // 동적 로딩
            Class.forName("oracle.jdbc.driver.OracleDriver");

            String url = "jdbc190110:oracle:thin:@127.0.0.1:1521:xe";
            String id = "hr";
            String pw = "HR";

            conn = DriverManager.getConnection(url, id, pw);

            if (conn != null) {
                System.out.println("연결성공!");
            } else {
                System.out.println("연결실패...");
            }

            String sql = "UPDATE MEM SET ? = ? WHERE ID = ?";
            if (choice == 1) {
                sql = "UPDATE MEM SET PW = ? WHERE ID = ?";
            } else {
                sql = "UPDATE MEM SET TEL = ? WHERE ID = ?";
            }
            System.out.println(sql);
            psmt = conn.prepareStatement(sql);
            //psmt.setString(1, col);
            psmt.setString(1, inputData);
            psmt.setString(2, updateId);

            int cnt = psmt.executeUpdate();

            if (cnt > 0) {
                System.out.println("변경 성공!");
            } else {
                System.out.println("변경 실패...");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (psmt != null) {
                try {
                    psmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }

    }
}
