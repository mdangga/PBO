/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Koneksi;

/**
 *
 * @author angga murdika
 */
import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;

import java.sql.Statement;

public class Koneksi {

    private Connection conn;

    private Statement stm;

    public Connection connect() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver ditemukan, mencoba koneksi...");
            String url = "jdbc:mysql://localhost:3306/mahasiswa";
            String user = "root";
            String pass = "";
            conn = DriverManager.getConnection(url, user, pass);
            stm = conn.createStatement();
            System.out.println("Koneksi ke database berhasil!");
        } catch (ClassNotFoundException ex) {
            System.err.println("Driver tidak ditemukan: " + ex.getMessage());
        } catch (SQLException e) {
            System.err.println("Koneksi gagal: " + e.getMessage());
        }
        return conn;
    }

    public Statement getStatement() {
        return stm;
    }

}
