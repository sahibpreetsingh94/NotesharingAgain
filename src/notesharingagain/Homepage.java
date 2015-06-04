/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notesharingagain;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Sahib
 */
public class Homepage extends javax.swing.JFrame {

    /**
     * Creates new form Homepage
     */
    ServerSocket sersock;

    public Homepage() {
        initComponents();
        try {
            new Thread(new Runnable() {

                @Override
                public void run() {
                    try {
                        sersock = new ServerSocket(65000);
                        System.out.println("Server started");
                        while (true) {
                            Socket sock = sersock.accept();
                            ClientHandler ch = new ClientHandler(sock);
                            Thread t = new Thread(ch);
                            t.start();

                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Unable to start thread");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel1.setText("HOMEPAGE");

        jButton9.setFont(new java.awt.Font("Microsoft Himalaya", 0, 24)); // NOI18N
        jButton9.setText("Exit");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel2.setText("Department");

        jButton1.setFont(new java.awt.Font("Microsoft Himalaya", 0, 18)); // NOI18N
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Microsoft Himalaya", 0, 18)); // NOI18N
        jButton2.setText("VIEW");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel3.setText("Course");

        jButton3.setFont(new java.awt.Font("Microsoft Himalaya", 0, 18)); // NOI18N
        jButton3.setText("ADD");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Microsoft Himalaya", 0, 18)); // NOI18N
        jButton4.setText("VIEW");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel4.setText("Faculty");

        jButton5.setFont(new java.awt.Font("Microsoft Himalaya", 0, 18)); // NOI18N
        jButton5.setText("ADD");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Microsoft Himalaya", 0, 18)); // NOI18N
        jButton6.setText("VIEW");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel5.setText("Student");

        jButton7.setFont(new java.awt.Font("Microsoft Himalaya", 0, 18)); // NOI18N
        jButton7.setText("ADD");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Microsoft Himalaya", 0, 18)); // NOI18N
        jButton8.setText("VIEW");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(138, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jButton7)
                    .addComponent(jButton8))
                .addGap(18, 18, 18)
                .addComponent(jButton9)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new AddDepartment().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new ViewDepartment().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        new ViewFaculty().setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        new AddStudent().setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new AddCourse().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new AddFaculty().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new ViewCourse().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        new ViewStudents().setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Homepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables

    private static class ClientHandler implements Runnable {

        Socket sock;
        DataInputStream dis;
        DataOutputStream dos;
        FileOutputStream fos;
        FileInputStream fis;
        DBConnect ob;
        File f;

        public ClientHandler(Socket sock) {
            this.sock = sock;

            f = new File("C:\\pics");
            if (f.exists()) {
                f = new File("C:\\pics\\Student");
                if (f.exists()) {
                } else {
                    f.mkdir();
                }
                f = new File("C:\\pics\\Faculty");
                if (f.exists()) {
                } else {
                    f.mkdir();
                }
            } else {
                f.mkdir();
                f = new File("C:\\pics\\Student");
                f.mkdir();
                f = new File("C:\\pics\\Faculty");
                f.mkdir();
            }
            f = new File(System.getProperty("user.home") + File.separator + "notes");
            if (!f.exists()) {
                f.mkdir();
            }
        }

        @Override
        public void run() {
            try {
                System.out.println("Connection Accepted");
                dis = new DataInputStream(sock.getInputStream());
                dos = new DataOutputStream(sock.getOutputStream());
                dos.writeBytes("Hello\r\n");
                //String ClientMessage = dis.readLine();
                //System.out.println("ClientMessage :" + ClientMessage);
                ob = new DBConnect();
                while (true) {
                    String s = dis.readLine();
                    if (s.equals("Request Department")) {
                        try {
                            Statement stmt = ob.conn.createStatement();
                            ResultSet rs = stmt.executeQuery("select name from department");
                            if (rs.next() == true) {
                                dos.writeBytes("Department March\r\n");
                                dos.writeBytes(rs.getString("name") + "\r\n");
                                while (rs.next()) {
                                    dos.writeBytes(rs.getString("name") + "\r\n");
                                }
                                dos.writeBytes("khatam\r\n");
                            }

                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else if (s.equals("Request Course")) {
                        String s1 = dis.readLine();
                        try {
                            Statement stmt = ob.conn.createStatement();
                            ResultSet rs = stmt.executeQuery("select name from course where department = '" + s1 + "'");
                            if (rs.next() == true) {
                                dos.writeBytes("Course March\r\n");
                                dos.writeBytes(rs.getString("name") + "\r\n");
                                while (rs.next()) {
                                    dos.writeBytes(rs.getString("name") + "\r\n");
                                }
                                dos.writeBytes("khatam\r\n");
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else if (s.equals("Register Faculty Request")) {
                        try {
                            dos.writeBytes("Register Faculty Request Accepted\r\n");
                            String name = dis.readLine();
                            String password = dis.readLine();
                            String department = dis.readLine();
                            String course = dis.readLine();
                            long time = dis.readLong();
                            Statement stmt = ob.conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                            int rs = stmt.executeUpdate("insert into faculty (username, password, department,course,timestamp) values ('" + name + "' , '" + password + "' , '" + department + "' , '" + course + "' ," + time + ")");
                            if (rs == 1) {
                                dos.writeBytes("Registered Successfully\r\n");
                                Statement stmt1 = ob.conn.createStatement();
                                ResultSet rs1 = stmt1.executeQuery("select id from faculty where timestamp = " + time);
                                if (rs1.next()) {
                                    dos.writeInt(rs1.getInt("id"));
                                }
                            } else {
                                dos.writeBytes("Registration Failed\r\n");
                            }

                        } catch (Exception e) {
                            dos.writeBytes("Registration Failed\r\n");
                        }
                    } else if (s.equals("Faculty Login Request")) {
                        try {
                            dos.writeBytes("Faculty Login Request Accepted\r\n");
                            int id = dis.readInt();
                            String password = dis.readLine();
                            Statement stmt = ob.conn.createStatement();
                            ResultSet rs = stmt.executeQuery("select * from faculty where id=" + id + " and password='" + password + "'");
                            if (rs.next()) {
                                dos.writeBytes("Login Successful\r\n");
                            } else {
                                dos.writeBytes("Login Unsuccessful\r\n");
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else if (s.equals("Faculty Data Request")) {
                        try {
                            dos.writeBytes("Faculty Data Request Accepted\r\n");
                            int id = dis.readInt();

                            Statement stmt = ob.conn.createStatement();
                            ResultSet rs = stmt.executeQuery("select * from faculty where id=" + id);
                            if (rs.next()) {
                                dos.writeBytes(rs.getString("username") + "\r\n");
                                dos.writeBytes(rs.getString("department") + "\r\n");
                                dos.writeBytes(rs.getString("course") + "\r\n");
                                dos.writeBytes(rs.getString("email") + "\r\n");
                                dos.writeBytes(rs.getString("contact") + "\r\n");
                                dos.writeBytes(rs.getString("address") + "\r\n");
                                dos.writeBytes(rs.getString("qualification") + "\r\n");
                                boolean photo = (rs.getInt("Photo") == 0) ? false : true;
                                System.out.println(photo);
                                String file = "";
                                if (!photo) {
                                    file = "C:\\pics\\default.jpg";
                                } else {
                                    file = "C:\\pics\\faculty\\" + id + ".jpg";
                                }
                                f = new File(file);
                                dos.writeLong(f.length());
                                fis = new FileInputStream(file);
                                byte b[] = new byte[100000];
                                int r;
                                while (true) {
                                    r = fis.read(b, 0, 100000);
                                    if (r == -1) {
                                        break;
                                    }
                                    dos.write(b, 0, r);
                                }
                                fis.close();
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else if (s.equals("Faculty Change Password Request")) {
                        try {
                            dos.writeBytes("Faculty Change Password Request Accepted\r\n");
                            int facultyid = dis.readInt();
                            String currentpass = dis.readLine();
                            String newpass = dis.readLine();
                            System.out.println("3");
                            Statement stmt = ob.conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                            ResultSet rs = stmt.executeQuery("select * from faculty where id = " + facultyid + " and password = '" + currentpass + "'");
                            if (rs.next()) {
                                rs.updateString("password", newpass);
                                rs.updateRow();
                                dos.writeBytes("Password Change Successful\r\n");
                            } else {
                                dos.writeBytes("Invalid Current Password\r\n");
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else if (s.equals("Faculty Edit Profile Request")) {
                        try {
                            dos.writeBytes("Faculty Edit Profile Request Accepted\r\n");
                            int id = dis.readInt();
                            String email = dis.readLine();
                            String contact = dis.readLine();
                            String address = dis.readLine();
                            String qualification = dis.readLine();
                            Statement stmt = ob.conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                            int rs = stmt.executeUpdate("update faculty set email= '" + email + "', contact='" + contact + "', address ='" + address + "', qualification='" + qualification + "' where id=" + id);
                            if (rs == 1) {
                                dos.writeBytes("Profile Updated Successfully\r\n");
                            } else {
                                dos.writeBytes("Profile Updation Unsuccessful\r\n");
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else if (s.equals("Faculty Profile Pic Coming")) {
                        dos.writeBytes("Edit Photo Accepted\r\n");
                        int id = dis.readInt();
                        long count = 0, size = dis.readLong();
                        fos = new FileOutputStream("C:\\pics\\Faculty\\" + id + ".jpg");
                        byte b[] = new byte[100000];
                        int r;
                        while (true) {
                            r = dis.read(b, 0, 100000);
                            fos.write(b, 0, r);
                            count += r;
                            if (count == size) {
                                break;
                            }
                        }
                        System.out.println(count);
                        Statement stmt = ob.conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                        stmt.executeUpdate("update faculty set photo = " + 1 + " where id = " + id);
                        dos.writeBytes("File Uploaded Successfully\r\n");
                    } else if (s.equals("Register Student Request")) {
                        try {
                            dos.writeBytes("Register Student Request Accepted\r\n");

                            String rollno = dis.readLine();
                            String name = dis.readLine();
                            String password = dis.readLine();
                            String department = dis.readLine();
                            String course = dis.readLine();
                            Statement stmt = ob.conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

                            int rs = stmt.executeUpdate("insert into student (rollno,name,password,department,course) values ('" + rollno + "' , '" + name + "' , '" + password + "' , '" + department + "' , '" + course + "')");

                            if (rs == 1) {
                                dos.writeBytes("Registered Successfully\r\n");
                            } else {

                                dos.writeBytes("Registration Failed\r\n");
                            }

                        } catch (Exception e) {
                            dos.writeBytes("Registration Failed\r\n");
                        }
                    } else if (s.equals("Student Login Request")) {
                        try {
                            dos.writeBytes("Student Login Request Accepted\r\n");
                            String rollno = dis.readLine();
                            String password = dis.readLine();
                            Statement stmt = ob.conn.createStatement();
                            ResultSet rs = stmt.executeQuery("select * from student where rollno = '" + rollno + "' and password = '" + password + "'");
                            if (rs.next()) {
                                dos.writeBytes("Login Successful\r\n");
                            } else {
                                dos.writeBytes("Login Unsuccessful\r\n");
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else if (s.equals("Student Data Request")) {
                        try {
                            dos.writeBytes("Student Data Request Accepted\r\n");
                            String rollno = dis.readLine();
                            Statement stmt = ob.conn.createStatement();
                            ResultSet rs = stmt.executeQuery("select * from student where rollno = '" + rollno + "'");
                            if (rs.next()) {
                                dos.writeBytes(rs.getString("name") + "\r\n");
                                dos.writeBytes(rs.getString("department") + "\r\n");
                                dos.writeBytes(rs.getString("course") + "\r\n");
                                dos.writeBytes(rs.getString("email") + "\r\n");
                                dos.writeBytes(rs.getString("contact") + "\r\n");
                                dos.writeBytes(rs.getString("address") + "\r\n");
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else if (s.equals("Student Change Password Request")) {
                        try {
                            dos.writeBytes("Student Change Password Request Accepted\r\n");
                            String rollno = dis.readLine();
                            String currentpass = dis.readLine();
                            String newpass = dis.readLine();
                            Statement stmt = ob.conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                            int rs = stmt.executeUpdate("update student set password='" + newpass + "' where rollno='" + rollno + "'  and password='" + currentpass + "'");
                            if (rs == 1) {
                                dos.writeBytes("Password Change Successful\r\n");
                            } else {
                                dos.writeBytes("Password Change Unsuccessful\r\n");
                            }
                        } catch (Exception e) {
                            dos.writeBytes("Invalid Current Password\r\n");
                        }
                    } else if (s.equals("Student Edit Profile Request")) {
                        try {
                            dos.writeBytes("Student Edit Profile Request Accepted\r\n");
                            String rollno = dis.readLine();
                            String email = dis.readLine();
                            String contact = dis.readLine();
                            String address = dis.readLine();
                            Statement stmt = ob.conn.createStatement();

                            int rs = stmt.executeUpdate("update student set email='" + email + "' ,contact='" + contact + "' ,address='" + address + "' where rollno='" + rollno + "'");

                            System.out.println(rs);
                            if (rs == 1) {
                                dos.writeBytes("Profile Updated Successfully\r\n");
                            } else {
                                dos.writeBytes("Profile Update Failed\r\n");
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
