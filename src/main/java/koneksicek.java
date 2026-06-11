/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author USER
 */
public class koneksicek {
 
    public static void main(String[] args) {

        try {

            Connection conn =
                    DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/database_member",
                            "root",
                            ""
                    );

            System.out.println("Koneksi Berhasil");

        } catch (Exception e) {

            System.out.println("Koneksi Gagal");
            System.out.println(e.getMessage());

        }
    }
}  

