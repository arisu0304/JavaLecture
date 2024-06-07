package chap25_jdbc;

import java.sql.*;

public class JDBCUtil {
    public static Connection getConnection(String url, String user, String password) {
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            return DriverManager.getConnection(url, user, password);
        }catch(Exception e){
            System.out.println(e);
        }

        return null;
    }
    // ResultSet이 없는 close 메소드(insert, delete, update)
    public static void close(Statement stmt, Connection conn){
        if(stmt != null){
            try{
                stmt.close();
            }catch(SQLException se) {
                System.out.println(se.getMessage());
            }
        }
        if(conn != null){
            try{
                conn.close();
            }catch(SQLException se) {
                System.out.println(se.getMessage());
            }
        }
    }
    // ResultSet이  있는 close 메소드(select)
    public static void close(Statement stmt, ResultSet rs, Connection conn){
        if(stmt != null){
            try{
                stmt.close();
            }catch(SQLException se) {
                System.out.println(se.getMessage());
            }
        }
        if(rs != null){
            try{
                rs.close();
            }catch(SQLException se) {
                System.out.println(se.getMessage());
            }
        }
        if(conn != null){
            try{
                conn.close();
            }catch(SQLException se) {
                System.out.println(se.getMessage());
            }
        }
    }


}
