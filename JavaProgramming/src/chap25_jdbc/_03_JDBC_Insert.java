package chap25_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class _03_JDBC_Insert {
    public static void main(String[] args) {
        Connection conn = null;
        // Statement를 상속받은 PreparedStatement 객체
        // PreparedStatement는 쿼리에 파라미터를 추가할 수 있다.
        PreparedStatement stmt = null;

        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter the number of your student");
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
            // 물음표(?)를 이용해서 파라미터 지정
            String insertStudent = "insert into student values(?,?,?,?,?,?)";
        
            // Statement 객체는 Connection의 createStatement() 메소드를 통해 생성
            // PreparedStatement 객체는 Connection의 PreparedStatement() 메소드를 통해 생성
            stmt = conn.prepareStatement(insertStudent);
            
            // ?로 지정된 파라미터 들어갈 값들을 매핑
            // 쿼리문이기 때문에 인덱스가 1부터 시작
            stmt.setString(1, sno);
            stmt.setString(2, sname);
            stmt.setString(3, gender);
            stmt.setInt(4, syear);
            stmt.setString(5, major);
            stmt.setDouble(6, avr);
            
            // update, delete, insert는 영향받은 행의 개수를 리턴
            // update, delete, insert는 executeUpdate() 메소드로 쿼리 실행
            int result = stmt.executeUpdate();

            if(result != 0){
                System.out.println("Student inserted successfully");
            } else {
                System.out.println("Student not inserted successfully");
            }

        }catch(SQLException se){
            System.out.println(se);
        }catch(Exception e){
            System.out.println(e);
        } finally {
            JDBCUtil.close(stmt, conn);
        }


    }
}
