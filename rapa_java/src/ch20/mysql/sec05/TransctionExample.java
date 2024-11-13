package ch20.mysql.sec05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TransctionExample {

    public static void main(String[] args) {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sf", "root", "1234");
            System.out.println("mysql연결성공");

            // 타임아웃 설정
            conn.setAutoCommit(false);
            conn.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);  // 격리 수준 설정

            System.out.println("이체시작");

            String sql1 = "UPDATE accounts SET balance = balance - ? WHERE ano = ?;";
            PreparedStatement pstmt1 = conn.prepareStatement(sql1);
            pstmt1.setInt(1, 50);
            pstmt1.setString(2, "111-111-1111");
            int rows1 = pstmt1.executeUpdate();
            if (rows1 == 0) { throw new Exception("출금 실패"); }
            pstmt1.close();

            String sql2 = "UPDATE accounts SET balance = balance + ? WHERE ano = ?;";
            PreparedStatement pstmt2 = conn.prepareStatement(sql2);
            pstmt2.setInt(1, 50);
            pstmt2.setString(2, "222-222-2221");
            int rows2 = pstmt2.executeUpdate();
            if (rows2 == 0) { throw new Exception("입금 실패"); }
            pstmt2.close();

            conn.commit();
            System.out.println("이체성공");

        } catch (Exception e) {
            try {
                if (conn != null) {
                    conn.rollback();
                    System.out.println("트랜잭션 롤백");
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                    System.out.println("연결 종료");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
