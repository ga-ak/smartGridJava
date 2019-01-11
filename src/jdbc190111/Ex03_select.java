package jdbc190111;

import java.sql.*;
import java.util.Scanner;

public class Ex03_select {

     // 입력한 id의 정보를 전화번호만 가져오도록 해라

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement psmt = null;

        Scanner sc = new Scanner(System.in);
        System.out.print("전화번호를 가져올 아이디를 입력하세요 >> ");
        String inputId = sc.next();

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
            String oraId = "hr";
            String oraPw = "HR";

            conn = DriverManager.getConnection(url, oraId, oraPw);

            String sql = "select tel from MEM where id = ?";
            psmt = conn.prepareStatement(sql);
            psmt.setString(1, inputId);
            ResultSet rs = psmt.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getString(1));
                System.out.println("=============");
            }
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
