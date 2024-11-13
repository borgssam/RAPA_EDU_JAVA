package ch17.sec01;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBAssist {
    // MySQL JDBC 연결 설정
    private static final String URL = "jdbc:mysql://localhost:3306/book";  // 데이터베이스 URL
    private static final String USER = "root";  // 사용자 이름
    private static final String PASSWORD = "1234";  // 비밀번호

    private Connection conn;
    private Statement stmt;

    // 생성자: 데이터베이스 연결 및 Statement 객체 생성
    public DBAssist() {
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            stmt = conn.createStatement();
            System.out.println("MySQL 데이터베이스에 성공적으로 연결되었습니다!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 데이터 조회 메서드: SELECT 쿼리를 받아서 ResultSet 반환
    public ResultSet executeQuery(String query) {
        try {
            return stmt.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    // INSERT, UPDATE, DELETE 쿼리 실행 메서드
    public int executeUpdate(String query) {
        try {
            return stmt.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    // 연결 종료 메서드
    public void close() {
        try {
            if (stmt != null) stmt.close();
            if (conn != null) conn.close();
            System.out.println("데이터베이스 연결이 종료되었습니다.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
