/*
 * AdminWorkAreaJPanel.java
 *
 * Created on October 10, 2008, 8:50 AM
 */

package UserInterface.AdminstrativeRole;

import Business.business.Business;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author  laksh
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {
    private final JPanel userProcessContainer;
    private final Business business;
    
    /** Creates new form AdminWorkAreaJPanel
     * @param userProcessContainer
     * @param business
     */
    public AdminWorkAreaJPanel(JPanel userProcessContainer,Business business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        manageUserButton = new javax.swing.JButton();
        manageOrganizationButton = new javax.swing.JButton();
        managePersonButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setText("My Work Area   -  Aministrative Role");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 370, -1));

        manageUserButton.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        manageUserButton.setText("Manage User Account >>");
        manageUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageUserButtonActionPerformed(evt);
            }
        });
        add(manageUserButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 260, -1));

        manageOrganizationButton.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        manageOrganizationButton.setText("Manage Organization Directory");
        manageOrganizationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationButtonActionPerformed(evt);
            }
        });
        add(manageOrganizationButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 260, -1));

        managePersonButton.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        managePersonButton.setText("Manage Person >>");
        managePersonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managePersonButtonActionPerformed(evt);
            }
        });
        add(managePersonButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 260, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void manageUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageUserButtonActionPerformed
        // TODO add your handling code here:
        ManageUserAccountDirectoryJPanel manageUserAccountDirectoryJPanel = new ManageUserAccountDirectoryJPanel(userProcessContainer,business.getOrganizationDirectory());
        userProcessContainer.add("ManageUserAccountDirectoryJPanel", manageUserAccountDirectoryJPanel);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageUserButtonActionPerformed

    private void manageOrganizationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationButtonActionPerformed
        ManageOrganizationDirectoryJPanel manageOrganizationDirectoryJPanel = new ManageOrganizationDirectoryJPanel(userProcessContainer,business.getOrganizationDirectory());
        userProcessContainer.add("ManageOrganizationDirectoryJPanel",manageOrganizationDirectoryJPanel);
        ((CardLayout)userProcessContainer.getLayout()).next(userProcessContainer);
    }//GEN-LAST:event_manageOrganizationButtonActionPerformed

    private void managePersonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managePersonButtonActionPerformed
        ManagePersonDirectoryJPanel managePersonDirectoryJPanel = new ManagePersonDirectoryJPanel(userProcessContainer,business.getOrganizationDirectory());
        userProcessContainer.add("ManagePersonDirectoryJPanel",managePersonDirectoryJPanel);
        ((CardLayout)userProcessContainer.getLayout()).next(userProcessContainer);
    }//GEN-LAST:event_managePersonButtonActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageOrganizationButton;
    private javax.swing.JButton managePersonButton;
    private javax.swing.JButton manageUserButton;
    // End of variables declaration//GEN-END:variables
    
}
