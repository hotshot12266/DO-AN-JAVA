/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;

/**
 *
 * @author nhuta
 */
public class Database {
    static  final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL= "jdbc:mysql://localhost/nhanvien"; 
    static  final String USER = "root"; 
    static  final String PASS = ""; 
     Connection conn = null; 
    public  Connection getConnection(){
        Connection conn = null; 
        try { 
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        try { 
            conn = (Connection) DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (SQLException ex) {
            System.out.println("Không thể kết nối đến Server");
        }
        return conn; 
    }
    
    public ResultSet loadData(String sql) {
        conn = getConnection(); 
        ResultSet result = null;
        try {
            Statement statement = conn.createStatement();
            return statement.executeQuery(sql);
        } catch (SQLException e) {
            System.err.println("Có lỗi lấy "+ sql );
        }
        return result;
    }
}
