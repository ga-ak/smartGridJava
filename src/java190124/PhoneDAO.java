package java190124;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.DefaultListModel;

public class PhoneDAO {
	Connection conn = null;
    PreparedStatement psmt = null;

    // PHONE 테이블 column : name varchar2(20), phonenum varchar2(20), age number(3)

    // 생성자로 데이터베이스에 접근
	public PhoneDAO() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // 자신 데이터베이스 설정에 따라 변경해야 함
            String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
            String oraId = "hr";
            String oraPw = "hr";

            conn = DriverManager.getConnection(url, oraId, oraPw);

            if (conn != null) {
                System.out.println("연결성공!");
            } else {
                System.out.println("연결실패...");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

	//
	public void insert(String name, String phoneNum, int age) {
		String sql = "INSERT INTO PHONE (NAME, PHONENUM, AGE) VALUES (?,?,?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, name);
			psmt.setString(2, phoneNum);
			psmt.setInt(3, age);
			
			psmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void delete(String name) {
		String sql = "DELETE FROM PHONE WHERE NAME = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, name);
			psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Vector<String> listPrint() {
		Vector<String> model = new Vector<String>();
		String sql = "SELECT NAME FROM PHONE ORDER BY NAME";
		try {
			psmt = conn.prepareStatement(sql);
			ResultSet rs = psmt.executeQuery();
			while(rs.next()) {
				model.addElement(rs.getString(1));
			}
			if(rs == null) {
				System.out.println("list가 비어있다!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return model;
	}
	
	public String getName(String name) {
		String result="";
		String sql = "SELECT NAME FROM PHONE WHERE NAME=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, name);
			ResultSet rs = psmt.executeQuery();
			
			while(rs.next()) {
				result = rs.getString(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public String getAge(String name) {
		String result="";
		String sql = "SELECT AGE FROM PHONE WHERE NAME=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, name);
			ResultSet rs = psmt.executeQuery();
			
			while(rs.next()) {
				result = rs.getString(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public String getPhoneNum(String name) {
		String result="";
		String sql = "SELECT PHONENUM FROM PHONE WHERE NAME=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, name);
			ResultSet rs = psmt.executeQuery();
			
			while(rs.next()) {
				result = rs.getString(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public void close() {
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
