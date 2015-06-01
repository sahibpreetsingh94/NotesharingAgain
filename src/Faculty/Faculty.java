/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Faculty;

import com.oracle.jrockit.jfr.ContentType;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Sahib
 */
public class Faculty extends javax.swing.JFrame {

    /**
     * Creates new form Faculty
     */
    Socket sock;
    DataInputStream dis;
    DataOutputStream dos;

    public Faculty() {
        initComponents();
        setSize(400, 200);
        registerpan.setVisible(false);
        loginpan.setVisible(false);
        facultypan.setVisible(false);
        try {
            sock = new Socket("127.0.0.1", 65000);
            System.out.println("Success");
            dis = new DataInputStream(sock.getInputStream());
            dos = new DataOutputStream(sock.getOutputStream());
            String s = dis.readLine();
            if (s.equals("Hello")) {
                Thread t = new Thread(new Receiver());
                t.start();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Connection could not be established");
            System.exit(0);
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

        jLabel1 = new javax.swing.JLabel();
        facultypan = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        registerpan = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nametf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        passwordtf = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        confirmtf = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        coursecb = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        departmentcb = new javax.swing.JComboBox();
        jButton3 = new javax.swing.JButton();
        loginpan = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        facultytf = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        password1tf = new javax.swing.JPasswordField();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel1.setText("FACULTY");

        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Login");

        jLabel2.setText("Name");

        jLabel3.setText("Password");

        jLabel4.setText("Confirm Password");

        jLabel5.setText("Course");

        coursecb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Course" }));

        jLabel6.setText("Department");

        departmentcb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Department" }));
        departmentcb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departmentcbActionPerformed(evt);
            }
        });

        jButton3.setText("REGISTER");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout registerpanLayout = new javax.swing.GroupLayout(registerpan);
        registerpan.setLayout(registerpanLayout);
        registerpanLayout.setHorizontalGroup(
            registerpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerpanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(registerpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(registerpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(coursecb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(departmentcb, 0, 197, Short.MAX_VALUE)
                    .addComponent(confirmtf)
                    .addComponent(nametf)
                    .addComponent(passwordtf))
                .addContainerGap())
            .addGroup(registerpanLayout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        registerpanLayout.setVerticalGroup(
            registerpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerpanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(registerpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nametf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(registerpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(passwordtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(registerpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(confirmtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(registerpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(departmentcb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(registerpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(coursecb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel7.setText("Faculty Id");

        jLabel8.setText("Password");

        jButton4.setText("LOGIN");

        javax.swing.GroupLayout loginpanLayout = new javax.swing.GroupLayout(loginpan);
        loginpan.setLayout(loginpanLayout);
        loginpanLayout.setHorizontalGroup(
            loginpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginpanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(loginpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(loginpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(password1tf, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                    .addComponent(facultytf))
                .addContainerGap())
            .addGroup(loginpanLayout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        loginpanLayout.setVerticalGroup(
            loginpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginpanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(loginpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(facultytf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(loginpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(password1tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout facultypanLayout = new javax.swing.GroupLayout(facultypan);
        facultypan.setLayout(facultypanLayout);
        facultypanLayout.setHorizontalGroup(
            facultypanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, facultypanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(facultypanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(loginpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(registerpan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, facultypanLayout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        facultypanLayout.setVerticalGroup(
            facultypanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(facultypanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(facultypanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(30, 30, 30)
                .addComponent(registerpan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginpan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(facultypan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(facultypan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        registerpan.setVisible(true);
        loginpan.setVisible(false);
        setSize(400, 420);
        try {
            dos.writeBytes("Request Department\r\n");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Could not fetch Sufficient Data");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void departmentcbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departmentcbActionPerformed
        try {
            if (departmentcb.getSelectedIndex() != 0) {
                dos.writeBytes("Request Course\r\n");
                dos.writeBytes(departmentcb.getSelectedItem() + "\r\n");
            } else {
                coursecb.removeAllItems();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_departmentcbActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(nametf.getText().equals("") || passwordtf.getText().equals("") || confirmtf.getText().equals("") || departmentcb.getSelectedIndex() == 0 || coursecb.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "All Fields are mandatory");
        } else {
            if(passwordtf.getText().equals(confirmtf.getText())){
                try {
                    dos.writeBytes("Register Faculty Request\r\n");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "Unable to send register request");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Passwords do not match");
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    class Receiver implements Runnable {

        @Override
        public void run() {
            facultypan.setVisible(true);
            try {
                while (true) {
                    String s = dis.readLine();
                    if (s.equals("Department March")) {
                        departmentcb.removeAllItems();
                        departmentcb.addItem("Select Department");
                        while (true) {
                            String s1 = dis.readLine();
                            if (s1.equals("khatam")) {
                                break;
                            } else {
                                departmentcb.addItem(s1);
                            }
                        }
                    } else if (s.equals("Course March")) {
                        coursecb.removeAllItems();
                        coursecb.addItem("Select Course");
                        dos.writeBytes(s);
                        while (true) {
                            System.out.println("HELLO");
                            String s1 = dis.readLine();
                            if (s1.equals("khatam")) {
                                break;
                            } else {
                                coursecb.addItem(s1);
                            }
                        }
                    } else if(s.equals("Register Faculty Request Accepted")) {
                        dos.writeBytes(nametf.getText()+"\r\n");
                        dos.writeBytes(passwordtf.getText()+"\r\n");
                        dos.writeBytes(departmentcb.getSelectedItem().toString()+"\r\n");
                        dos.writeBytes(coursecb.getSelectedItem().toString()+"\r\n");
                        Date d = new Date();
                        dos.writeLong(d.getTime());
                        String s1 = dis.readLine();
                        if(s1.equals("Registered Successfully")) {
                            JOptionPane.showMessageDialog(null, "Registered Successfully");
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }

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
            java.util.logging.Logger.getLogger(Faculty.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Faculty.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Faculty.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Faculty.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Faculty().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField confirmtf;
    private javax.swing.JComboBox coursecb;
    private javax.swing.JComboBox departmentcb;
    private javax.swing.JPanel facultypan;
    private javax.swing.JTextField facultytf;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel loginpan;
    private javax.swing.JTextField nametf;
    private javax.swing.JPasswordField password1tf;
    private javax.swing.JPasswordField passwordtf;
    private javax.swing.JPanel registerpan;
    // End of variables declaration//GEN-END:variables
}
