/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notesharingagain;

import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Owner
 */
public class Test {

    public static void main(String[] args) throws NoSuchFieldException {
        ArrayList<Department> al = new ArrayList<>();

        try {

            Statement stmt = new DBConnect().conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery("select * from department");
            while (rs.next()) {
                String name = rs.getString("Name");
                String hod = rs.getString("HODName");
                String contact = rs.getString("Contact");
                String email = rs.getString("Email");
                String description = rs.getString("Description");
                al.add(new Department(name, hod, contact, email, description));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(al.get(0).getClass());
        Field f[];
        f = al.get(0).getClass().getDeclaredFields();
   
        for (int i = 0; i < f.length; i++) {
                        System.out.println(f[i].toString().substring(45));

        }
        
    }
}
