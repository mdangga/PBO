package Koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author angga murdika
 */
public class Koneksi {
    private Connection conn;
    private Statement stm;
    
    public Connection connect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver ditemukan, mencoba koneksi...");
            String url = "jdbc:mysql://localhost:3306/new_rakitin";
            String user = "root";
            String pass = "";
            conn = DriverManager.getConnection(url, user, pass);
            stm = conn.createStatement();
            System.out.println("Koneksi ke database berhasil!");
        }catch (ClassNotFoundException ex){
            System.err.println("Driver tidak ditemukan: " + ex.getMessage());
        }catch (SQLException e) {
            System.err.println("Koneksi gagal: " + e.getMessage());
        }
        return conn;
    }
    public Statement getStatement() {
        return stm;
    }
    
}
