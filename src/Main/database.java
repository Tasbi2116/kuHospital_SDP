/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author tasbi
 */
public class database {
    public static void main(String[] args) throws SQLException {
        
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kuhospital", "root","");
        System.out.println("Successful");
        Statement stm = con.createStatement();
        stm.execute("insert into hello values ('maria' ,35)");
    }
    
}
