package java190122;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MemberDAO {

    public void conn() {
        Connection conn = null;
        PreparedStatement psmt = null;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
            String oraId = "hr";
            String oraPw = "HR";

            conn = DriverManager.getConnection(url, oraId, oraPw);

        //            if (conn != null) {
        //                System.out.println("연결성공!");
        //            } else {
        //                System.out.println("연결실패...");
        //            }

            String sql = "";
            psmt = conn.prepareStatement(sql);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                psmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
