/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notesharingagain;

import java.sql.*;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author Sahib
 */
public class AddDepartment extends javax.swing.JFrame {

    DBConnect ob = new DBConnect();

    /**
     * Creates new form AddDepartment
     */
    public AddDepartment() {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nametf = new javax.swing.JTextField();
        hodtf = new javax.swing.JTextField();
        contacttf = new javax.swing.JTextField();
        emailtf = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionta = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel1.setText("ADD DEPARTMENT");

        jLabel2.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel3.setText("HOD ");

        jLabel4.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel4.setText("Contact");

        jLabel5.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel5.setText("Email");

        jLabel6.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel6.setText("Description");

        hodtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hodtfActionPerformed(evt);
            }
        });

        descriptionta.setColumns(20);
        descriptionta.setRows(5);
        jScrollPane1.setViewportView(descriptionta);

        jButton1.setFont(new java.awt.Font("Microsoft Himalaya", 1, 24)); // NOI18N
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(emailtf)
                        .addComponent(contacttf)
                        .addComponent(hodtf)
                        .addComponent(nametf)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(nametf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(hodtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(contacttf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(emailtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hodtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hodtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hodtfActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (nametf.getText().equals("") || hodtf.getText().equals("") || contacttf.getText().equals("") || emailtf.getText().equals("") || descriptionta.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "All Fields are mandatory");
        } else {
            boolean flag = true, flag2 = true;
            String contact = contacttf.getText();
            String email = emailtf.getText();
            if (contact.length() >= 10 && contact.length() <= 12) {
                try {
                    Long.parseLong(contact);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Contact can contain only digits");
                    flag = false;
                }
            } else {
                JOptionPane.showMessageDialog(this, "Contact can only contain 10-12 digits");
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
                    /*ResultSet rs = stmt.executeQuery("select * from department where name = \'" + nametf.getText() + "\'");

                     if (rs.next()) {
                     JOptionPane.showMessageDialog(this, "Department Already Exists");
                     nametf.setText("");
                     } else {
                     rs.moveToInsertRow();
                     rs.updateString("Name", nametf.getText());
                     rs.updateString("HODName", hodtf.getText());
                     rs.updateString("Contact", contact);
                     rs.updateString("Email", emailtf.getText());
                     rs.updateString("Description", descriptionta.getText());
                     rs.insertRow();
                     JOptionPane.showMessageDialog(this, "Department Added Successfully");
                     nametf.setText("");
                     hodtf.setText("");
                     contacttf.setText("");
                     emailtf.setText("");
                     descriptionta.setText("");
                     nametf.requestFocus();
                     }*/
                    int rs = stmt.executeUpdate("insert into department values ('" + nametf.getText() + "' , '" + hodtf.getText() + "' , '" + contact + "' , '" + emailtf.getText() + "' , '" + descriptionta.getText() + "')");
                    if (rs == 1) {
                        JOptionPane.showMessageDialog(this, "Department Added Successfully");
                        nametf.setText("");
                        hodtf.setText("");
                        contacttf.setText("");
                        emailtf.setText("");
                        descriptionta.setText("");
                        nametf.requestFocus();
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Department Already Exists");
                    nametf.setText("");
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
            java.util.logging.Logger.getLogger(AddDepartment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddDepartment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddDepartment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddDepartment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddDepartment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField contacttf;
    private javax.swing.JTextArea descriptionta;
    private javax.swing.JTextField emailtf;
    private javax.swing.JTextField hodtf;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField nametf;
    // End of variables declaration//GEN-END:variables
}
