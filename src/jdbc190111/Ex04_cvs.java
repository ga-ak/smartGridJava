package jdbc190111;

import java.sql.*;
import java.util.Scanner;

public class Ex04_cvs {

    //
    static Scanner sc = new Scanner(System.in);

    public static int insert(Connection conn, PreparedStatement psmt) {
        String sql = "INSERT INTO CVS VALUES(?,?,?,?)";
        int cnt = -1;
        try {
            System.out.print("과자 이름 입력 >> ");
            String name = sc.next();
            System.out.print("과자 가격 입력 >> ");
            int price = sc.nextInt();
            System.out.print("과자 재고 입력 >> ");
            int  stock = sc.nextInt();
            System.out.print("과자 제조사 입력 >> ");
            String c_name = sc.next();
            psmt = conn.prepareStatement(sql);
            psmt.setString(1, name);
            psmt.setInt(2, price);
            psmt.setInt(3, stock);
            psmt.setString(4, c_name);
            cnt = psmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return cnt;
    }

    public static int delete(Connection conn, PreparedStatement psmt) {
        String sql = "DELETE FROM CVS WHERE SNACK_NAME=?";
        int cnt = -1;
        try {
            System.out.print("재고 삭제할 과자 이름 입력 >> ");
            String name = sc.next();

            psmt = conn.prepareStatement(sql);
            psmt.setString(1, name);

            cnt = psmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return cnt;

    }

    public static int update(Connection conn, PreparedStatement psmt) {
        String sql = "UPDATE CVS SET STOCK = ? WHERE SNACK_NAME=?";
        int cnt = -1;
        try {
            System.out.print("재고 수정할 과자 이름 입력 >> ");
            String name = sc.next();

            System.out.print("재고를 몇으로 수정할까요? >> ");
            int stock = sc.nextInt();

            psmt = conn.prepareStatement(sql);
            psmt.setInt(1, stock);
            psmt.setString(2, name);
            cnt = psmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return cnt;

    }

    public static ResultSet select(Connection conn, PreparedStatement psmt) {
        ResultSet rs=null;

        String sql = "SELECT SNACK_NAME, STOCK FROM CVS";

        try {
            System.out.print("[1]모든 재고 파악 [2]특정 과자 재고 파악 >> ");
            int choice = sc.nextInt();

            if (choice == 2) {
                System.out.print("재고파악할 과자 이름 입력 >> ");
                String name = sc.next();
                sql = "SELECT SNACK_NAME, STOCK FROM CVS WHERE SNACK_NAME = ?";
                psmt = conn.prepareStatement(sql);
                psmt.setString(1, name);
            } else if (choice == 1) {
                psmt = conn.prepareStatement(sql);
            }

            rs = psmt.executeQuery();

        } catch (SQLException e) {
            e.printStackTrace();
        }


        return rs;
    }

    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement psmt = null;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
            String oraId = "hr";
            String oraPw = "HR";

            conn = DriverManager.getConnection(url, oraId, oraPw);

            if (conn != null) {
                System.out.println("연결성공!");
            } else {
                System.out.println("연결실패...");
            }

            while (true) {
                System.out.println("=======편의점 포스(점주용)=======");
                System.out.print("[1]재고 등록 [2]재고 삭제 [3]수량 수정 [4]재고 현황 [5]종료 >>> ");
                int choice = sc.nextInt();

                if (choice == 1) {

                    int cnt = insert(conn, psmt);

                    if (cnt > 0) {
                        System.out.println("데이터 삽입 완료!");
                    } else {
                        System.out.println("데이터 삽입 실패...");
                    }

                } else if (choice == 2) {
                    int cnt = delete(conn, psmt);

                    if (cnt > 0) {
                        System.out.println("데이터 삭제 완료!");
                    } else {
                        System.out.println("데이터 삭제 실패...");
                    }
                } else if (choice == 3) {
                    int cnt = update(conn, psmt);

                    if (cnt > 0) {
                        System.out.println("데이터 변경 완료!");
                    } else {
                        System.out.println("데이터 변경 실패...");
                    }
                } else if (choice == 4) {
                    ResultSet rs = select(conn, psmt);
                    System.out.println("=================");
                    while (rs.next()) {
                        System.out.println(rs.getString(1) +"\t"+rs.getInt(2)+"개");
                    }
                    System.out.println("=================");
                } else if (choice == 5) {
                    break;
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            if (conn != null) {
                try {
                    conn.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("Connection 종료!");
            }

            if (psmt != null) {
                try {
                    psmt.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }

                System.out.println("PreparedStatement 종료!");
            }

        }

        System.out.println("프로그램 종료!");

    }
}
