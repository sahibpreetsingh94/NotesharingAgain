/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notesharingagain;

import java.sql.*;

/**
 *
 * @author Sahib
 */
public class DBConnect {

    Connection conn;

    public DBConnect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/notesharingagain", "root", "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
