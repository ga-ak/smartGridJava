package jdbc;

import java.sql.DriverManager;

public class Ex02_insert {

    // ojdbc로 데이터 insert

    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@127.0.0.1:1251:xe";
        String id = "hr";
        String pw = "HR";

        // 동적 로딩
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");


            DriverManager.getConnection(url, id, pw);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
