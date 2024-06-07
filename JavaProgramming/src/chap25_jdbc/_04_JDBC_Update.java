package chap25_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class _04_JDBC_Update {
    public static void main(String[] args) {
        // 사용자가 입력한 sno에 해당하는 학생의 정보를
        // 사용자가 입력한 내용으로 JDBC를 이용해서 수정

        Connection conn = null;
        PreparedStatement stmt = null;

        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter the number of student");
            String sno = sc.nextLine();
            System.out.println("Enter the name of your student");
            String sname = sc.nextLine();
            System.out.println("Enter the gender of your student");
            String gender = sc.nextLine();
            System.out.println("Enter the year of your student");
            int syear = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the major of your student");
            String major = sc.nextLine();
            System.out.println("Enter the avr of your student");
            double avr = sc.nextDouble();

            conn = JDBCUtil.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe", "C##STUDY", "!dkdlxl1234");

            String UpdateStudent = "Update student set sname = ?, sex = ?, syear = ?, major = ?, avr = ? where sno = ?";
            stmt = conn.prepareStatement(UpdateStudent);

            stmt.setString(1, sname);
            stmt.setString(2, gender);
            stmt.setInt(3, syear);
            stmt.setString(4, major);
            stmt.setDouble(5, avr);
            stmt.setString(6, sno);

            int result = stmt.executeUpdate();

            if(result != 0){
                System.out.println("Student updated successfully");
            } else {
                System.out.println("Student not updated successfully");
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
