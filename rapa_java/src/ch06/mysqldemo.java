package ch06;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class mysqldemo {
    // MySQL JDBC 연결 설정
    private static final String URL = "jdbc:mysql://localhost:3306/book";  // 데이터베이스 URL
    private static final String USER = "root";  // 사용자 이름
    private static final String PASSWORD = "1234";  // 비밀번호 (설정한 루트 비밀번호로 변경)


	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // 1. 데이터베이스 연결
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("MySQL 데이터베이스에 성공적으로 연결되었습니다!");

            // 2. Statement 객체 생성
            stmt = conn.createStatement();

            // 3. 데이터 조회
            String query = "SELECT * FROM book";
            rs = stmt.executeQuery(query);

            // 4. 결과 출력
            while (rs.next()) {
                int id = rs.getInt("bk_ucode");
                String name = rs.getString("bk_title");
                String email = rs.getString("bk_writer");
                System.out.println("ID: " + id + ", Name: " + name + ", 작가: " + email);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 5. 연결 종료
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
	}

}
