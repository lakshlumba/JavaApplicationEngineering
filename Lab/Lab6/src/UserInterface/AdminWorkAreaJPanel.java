/*
 * Class : AdminWorkAreaJPanel.java
 * Developer : Laksh Lumba
 * Reviewer :
 * Description : 
 * Created On : Oct 11, 2014, 1:51:38 PM
 * ---------------------------------------------------------------------------
 * Change History
 * Develper :
 * Reviwer :
 * Changed ON :
 * ---------------------------------------------------------------------------
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.EmployeeDirectory;
import Business.UserAccountDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Laksh
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {
    private final UserAccountDirectory userAccountDirectory;
    private final EmployeeDirectory employeeDirectory;
    private final JPanel userProcessContainer;

    /**
     * Creates new form AdminWorkAreaJPanel
     * @param userProcessContainer
     * @param employeeDirectory
     * @param userAccountDirectory
     */
    public AdminWorkAreaJPanel(JPanel userProcessContainer,EmployeeDirectory employeeDirectory,UserAccountDirectory userAccountDirectory) {
        initComponents();
        this.userAccountDirectory = userAccountDirectory;
        this.employeeDirectory = employeeDirectory;
        this.userProcessContainer = userProcessContainer;
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
        manageUserButton = new javax.swing.JButton();
        manageEmployeeButton = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setText("Admin Work Area ");

        manageUserButton.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        manageUserButton.setText("Manage User Account");
        manageUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageUserButtonActionPerformed(evt);
            }
        });

        manageEmployeeButton.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        manageEmployeeButton.setText("Manage Employee");
        manageEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(manageEmployeeButton)
                            .addComponent(manageUserButton))))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addComponent(manageUserButton)
                .addGap(27, 27, 27)
                .addComponent(manageEmployeeButton)
                .addContainerGap(156, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageUserButtonActionPerformed
        // TODO add your handling code here:
        ManageUserAccountDirectoryJPanel manageUserAccountDirectoryJPanel  = new ManageUserAccountDirectoryJPanel(userProcessContainer,userAccountDirectory,employeeDirectory);
        userProcessContainer.add("ManageUserAccountDirectoryJPanel",manageUserAccountDirectoryJPanel);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageUserButtonActionPerformed

    private void manageEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeeButtonActionPerformed
        // TODO add your handling code here:
        ManageEmployeeDirectoryJPanel manageEmployeeDirectoryJPanel  = new ManageEmployeeDirectoryJPanel(userProcessContainer,employeeDirectory);
        userProcessContainer.add("ManageEmployeeDirectoryJPanel",manageEmployeeDirectoryJPanel);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageEmployeeButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageEmployeeButton;
    private javax.swing.JButton manageUserButton;
    // End of variables declaration//GEN-END:variables
}