/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notesharingagain;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Sahib
 */
public class AddStudent extends javax.swing.JFrame {

    DBConnect ob;

    /**
     * Creates new form AddStudent
     */
    public AddStudent() {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        try {
            ob = new DBConnect();
            Statement stmt = ob.conn.createStatement();
            ResultSet rs = stmt.executeQuery("select name from department");
            while (rs.next()) {
                departmentcb.addItem(rs.getString("name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rollnotf = new javax.swing.JTextField();
        emailtf = new javax.swing.JTextField();
        contacttf = new javax.swing.JTextField();
        departmentcb = new javax.swing.JComboBox();
        coursecb = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        addressta = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        nametf = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel1.setText("ADD STUDENT");

        jLabel2.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel2.setText("Roll No");

        jLabel3.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel3.setText("Department");

        jLabel4.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel4.setText("Course");

        jLabel5.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel5.setText("Email");

        jLabel6.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel6.setText("Contact");

        jLabel7.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel7.setText("Address");

        departmentcb.setFont(new java.awt.Font("Tempus Sans ITC", 0, 16)); // NOI18N
        departmentcb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Department" }));
        departmentcb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                departmentcbItemStateChanged(evt);
            }
        });

        coursecb.setFont(new java.awt.Font("Tempus Sans ITC", 0, 16)); // NOI18N
        coursecb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Course" }));

        addressta.setColumns(20);
        addressta.setRows(5);
        jScrollPane1.setViewportView(addressta);

        jButton1.setFont(new java.awt.Font("Microsoft Himalaya", 1, 24)); // NOI18N
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel8.setText("Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(86, 86, 86)
                        .addComponent(rollnotf)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(42, 42, 42)
                                .addComponent(departmentcb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(84, 84, 84)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(coursecb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(emailtf)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(74, 74, 74)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(contacttf)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE))))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(95, 95, 95)
                        .addComponent(nametf)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(rollnotf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nametf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(departmentcb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(coursecb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(emailtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(contacttf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void departmentcbItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_departmentcbItemStateChanged
        coursecb.removeAllItems();
        try {
            Statement stmt = ob.conn.createStatement();
            ResultSet rs = stmt.executeQuery("select name from course where department = '" + departmentcb.getSelectedItem() + "'");
            if (rs.next()) {
                coursecb.addItem("Select Course");
                coursecb.addItem(rs.getString("name"));
                while (rs.next()) {
                    coursecb.addItem(rs.getString("name"));
                }
            } else {
                JOptionPane.showMessageDialog(this, "No Course of this department exists");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_departmentcbItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (rollnotf.getText().equals("") || nametf.getText().equals("") || departmentcb.getSelectedIndex() == 0 || coursecb.getSelectedIndex() == 0 || emailtf.getText().equals("") || contacttf.getText().equals("") || addressta.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "All fields are mandatory");
        } else {
            boolean flag = true, flag2 = true;
            String contact = contacttf.getText();
            String email = emailtf.getText();
            if (contact.length() >= 10 && contact.length() <= 12) {
                try {
                    Long.parseLong(contact);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Contact must contain digits only");
                    flag = false;
                }
            } else {
                JOptionPane.showMessageDialog(this, "Contact must of length 10-12");
                flag = false;
            }
            if (email.contains("@")) {
                email = email.substring(email.indexOf('@'));
                if (email.contains(".")) {
                } else {
                    flag2 = false;
                    JOptionPane.showMessageDialog(this, "Email address not valid");
                }
            } else {
                flag2 = false;
                JOptionPane.showMessageDialog(this, "@ must be included in email");
                emailtf.requestFocus();
            }
            if (flag && flag2) {
                try {
                    Statement stmt = ob.conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                    int rs = stmt.executeUpdate("insert into student (rollno, name, department, course, email, contact, address) values ('" + rollnotf.getText() + "' , '" + nametf.getText() + "' , '" + departmentcb.getSelectedItem().toString() + "' , '" + coursecb.getSelectedItem().toString() + "' , '" + emailtf.getText() + "' , '" + contact + "' , '" + addressta.getText() + "')");
                    if (rs == 1) {
                        JOptionPane.showMessageDialog(this, "Student Added Successfully");
                        rollnotf.setText("");
                        nametf.setText("");
                        contacttf.setText("");
                        emailtf.setText("");
                        addressta.setText("");
                        rollnotf.requestFocus();
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Roll  No Already Exists");
                    rollnotf.setText("");
                }

            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea addressta;
    private javax.swing.JTextField contacttf;
    private javax.swing.JComboBox coursecb;
    private javax.swing.JComboBox departmentcb;
    private javax.swing.JTextField emailtf;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nametf;
    private javax.swing.JTextField rollnotf;
    // End of variables declaration//GEN-END:variables
}
