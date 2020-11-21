package DAO.DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConn {
    public static Connection conn=null;
    public static Statement stmt=null;
    public static ResultSet rs=null;
    private static String dbClassName = "com.mysql.cj.jdbc.Driver";
    private static String dbUrl = "";
    private static String dbUser="";
    private static String dbPwd="";

    public static Connection getConnection(){
        Connection conn = null;
        try{
            Class.forName(dbClassName);
            conn=DriverManager.getConnection(dbUrl, dbUser, dbPwd);
        }
        catch(Exception ee){
            ee.printStackTrace();
        }
        if(conn == null){
            System.err.println("警告:获得数据库连接失败.\r\n\r\n链接类型:"+dbClassName+"\r\n链接位置:"+dbUrl+"\r\n用户名/密码:"+dbUser+"/"+ dbPwd);
        }
        return conn;
    }
    /*关闭数据库连接*/
    public static void close() {
        try {
            if (rs != null)
                rs.close();
            if (stmt != null)
                stmt.close();
            if (conn != null)
                conn.close();
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }
}


