package jdbc190111;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Ex01_insert {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=======회원가입 프로그램=======");
        System.out.print("아이디를 입력해주세요 : ");
        String id = sc.next();
        System.out.println("패스워드를 입력해주세요 : ");
        String pw = sc.next();
        System.out.println("나이를 입력해주세요 : ");
        int age = sc.nextInt();
        System.out.println("전화번호를 입력해주세요 : ");
        String tel = sc.next();

        Connection conn = null;
        PreparedStatement psmt = null;

        // jdbc 이용하여 데이터 넣기
        // 순서 : 동적로딩 -> 연결 -> sql실행할 통로 -> sql실행

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
            String oraId = "hr";
            String oraPw = "HR";

            conn = DriverManager.getConnection(url, oraId, oraPw);

            if (conn != null) {
                System.out.println("연결 성공!");
            } else {
                System.out.println("연결 실패....");
            }

            String sql = "INSERT INTO MEM VALUES(?,?,?,?)";
            psmt = conn.prepareStatement(sql);
            psmt.setString(1, id);
            psmt.setString(2, pw);
            psmt.setInt(3, age);
            psmt.setString(4, tel);

            int cnt = psmt.executeUpdate();

            if (cnt > 0) {
                System.out.println(cnt + "행이 삽입되었습니다!");
            } else {
                System.out.println("삽입 실패....");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
