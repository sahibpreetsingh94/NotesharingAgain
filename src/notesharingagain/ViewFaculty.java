/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notesharingagain;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Sahib
 */
public class ViewFaculty extends javax.swing.JFrame {

    /**
     * Creates new form ViewFaculty
     */
    DBConnect ob;
    MyTableModel tm;
    ArrayList<Faculty> al;

    public ViewFaculty() {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        ob = new DBConnect();
        facultytb.setVisible(false);
        jButton1.setVisible(false);
        try {
            Statement stmt = ob.conn.createStatement();
            ResultSet rs = stmt.executeQuery("select name from department");
            while (rs.next()) {
                departmentcb.addItem(rs.getString("Name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void updateTable() {
        try {
            Statement stmt = ob.conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery("select * from faculty where department = '" + departmentcb.getSelectedItem().toString() + "' and course = '" + coursecb.getSelectedItem().toString() + "'");
            while (rs.next()) {
                int id = rs.getInt("id");
                String username = rs.getString("username");
                String email = rs.getString("email");
                String contact = rs.getString("contact");
                String address = rs.getString("address");
                String qualfication = rs.getString("qualification");
                boolean photo = rs.getInt("photo") == 1 ? true : false;
                al.add(new Faculty(id, username, email, contact, address, qualfication, photo));
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
        departmentcb = new javax.swing.JComboBox();
        coursecb = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        facultytb = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel1.setText("VIEW FACULTY");

        departmentcb.setFont(new java.awt.Font("Tempus Sans ITC", 0, 16)); // NOI18N
        departmentcb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Department" }));
        departmentcb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                departmentcbItemStateChanged(evt);
            }
        });
        departmentcb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departmentcbActionPerformed(evt);
            }
        });

        coursecb.setFont(new java.awt.Font("Tempus Sans ITC", 0, 16)); // NOI18N
        coursecb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Course" }));
        coursecb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                coursecbItemStateChanged(evt);
            }
        });
        coursecb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coursecbActionPerformed(evt);
            }
        });

        facultytb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(facultytb);

        jButton1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 16)); // NOI18N
        jButton1.setText("DELETE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 16)); // NOI18N
        jButton2.setText("View");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(departmentcb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75)
                                .addComponent(coursecb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                                .addComponent(jButton2)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(175, 175, 175))))
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(departmentcb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(coursecb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            ResultSet rs = stmt.executeQuery("select name from course where department='" + departmentcb.getSelectedItem() + "'");
            if (rs.next() != false) {
                coursecb.addItem("Course");
                coursecb.addItem(rs.getString("name"));

                while (rs.next()) {
                    coursecb.addItem(rs.getString("name"));
                }
            } else {
                JOptionPane.showMessageDialog(this, "No course of  this department exist");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "faculty could not be added");
        }
    }//GEN-LAST:event_departmentcbItemStateChanged

    private void coursecbItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_coursecbItemStateChanged

    }//GEN-LAST:event_coursecbItemStateChanged

    private void departmentcbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departmentcbActionPerformed

    }//GEN-LAST:event_departmentcbActionPerformed

    private void coursecbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coursecbActionPerformed
     }//GEN-LAST:event_coursecbActionPerformed

    void view() {
        al = new ArrayList<>();
        updateTable();
        if (al.size() == 0) {
            JOptionPane.showMessageDialog(this, "No faculty associated with this course");
            facultytb.setVisible(false);
            jButton1.setVisible(false);
        } else {
            tm = new MyTableModel((ArrayList<Object>) (Object) al);
            facultytb.setModel(tm);
            tm.fireTableDataChanged();
            facultytb.setVisible(true);
            jButton1.setVisible(true);
        }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (departmentcb.getSelectedIndex() == 0 || coursecb.getSelectedIndex() == 0) {
            view();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (facultytb.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "No Faculty selected");
        } else {
            int id = al.get(facultytb.getSelectedRow()).id;
            Statement stmt;
            try {
                stmt = ob.conn.createStatement();
                int rs = stmt.executeUpdate("delete from faculty where id = " + id);
                if (rs == 1) {
                    JOptionPane.showMessageDialog(this, "Selected Faculty has been deleted");
                    view();
                }
            } catch (SQLException ex) {
                Logger.getLogger(ViewFaculty.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(ViewFaculty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewFaculty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewFaculty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewFaculty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewFaculty().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox coursecb;
    private javax.swing.JComboBox departmentcb;
    private javax.swing.JTable facultytb;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
