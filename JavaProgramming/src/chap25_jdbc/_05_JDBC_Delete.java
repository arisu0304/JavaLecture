package chap25_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class _05_JDBC_Delete {

    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement stmt = null;

        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter the number of student");
            String sno = sc.nextLine();

            conn = JDBCUtil.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe", "C##STUDY", "!dkdlxl1234");

            String DeleteStudent = "delete  from student where sno = ?";
            stmt = conn.prepareStatement(DeleteStudent);

            stmt.setString(1, sno);

            int result = stmt.executeUpdate();

            if(result != 0){
                System.out.println("Student deleted successfully");
            } else {
                System.out.println("Student not deleted successfully");
            }

        }catch(SQLException se){
            System.out.println(se);
        }catch(Exception e){
            System.out.println(e);
        }finally{
            JDBCUtil.close(stmt, conn);
        }


    }

}
