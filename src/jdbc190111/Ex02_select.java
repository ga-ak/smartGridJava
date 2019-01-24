package jdbc190111;

import java.sql.*;

public class Ex02_select {

    // select

    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement psmt = null;


        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
            String oraId = "hr";
            String oraPw = "HR";

            conn = DriverManager.getConnection(url, oraId, oraPw);
            String sql = "select * from MEM";
            psmt = conn.prepareStatement(sql);

            // select문은 executeQuery() 메소드를 이용하여 sql를 실행시킨다.
            // 반환 값은 ResultSet타입으로 반환된다.
            // ResultSet 안에는 select한 모든 결과가 들어있고 다음 행에 정보가 있는한
            // ResultSet의 next() 메소드는 true를 반환한다.
            // 따라서 while(rs.next()) 를 이용하면 ResultSet안의 모든 정보에 접근할 수 있다.
            ResultSet rs = psmt.executeQuery();

            while (rs.next()) {

                String id = rs.getString(1);
                String pw = rs.getString(2);
                int age = rs.getInt(3);
                String tel = rs.getString(4);

                System.out.printf("아이디 : %s\n패스워드 : %s\n나이 : %d\n전화번호 : %s\n", id, pw, age, tel);
                System.out.println("===========================");
            }

        } catch (Exception e) {

        } finally{
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
