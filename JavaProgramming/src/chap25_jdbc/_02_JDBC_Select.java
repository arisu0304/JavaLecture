package chap25_jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class _02_JDBC_Select {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            conn = JDBCUtil.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe", "C##STUDY", "!dkdlxl1234");

            stmt = conn.createStatement();
            // JDBC를 이용해서 과목별 기말고사의 평균 성적 조회
            // 과목번호, 이름, 교수번호, 이름, 성적 평균
            String selectCourseInfo = "SELECT C.CNO, C.CNAME, P.PNO, P.PNAME, ROUND(AVG(SC.RESULT), 2) AS AVG_RES"
                    + " FROM COURSE C JOIN PROFESSOR P ON P.PNO = C.PNO JOIN SCORE SC ON SC.CNO = C.CNO GROUP BY C.CNO, C.CNAME, P.PNO, P.PNAME";

            rs = stmt.executeQuery(selectCourseInfo);


            while(rs.next()) {
                String cno = rs.getString("cno");
                String cname = rs.getString("cname");
                String pno = rs.getString("pno");
                String pname = rs.getString("pname");
                double avgRes = rs.getDouble("avg_res");

                System.out.println("과목번호 : " + cno + ", 과목이름:" + cname + "교수번호 : " + pno + ", 교수이름:" + pname +
                        ", 과목 평균점수: " + avgRes);
            }

        } catch (SQLException se) {
            System.out.println(se.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            JDBCUtil.close(stmt, rs ,conn);
        }

    }
}
