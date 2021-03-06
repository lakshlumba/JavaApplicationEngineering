/*
 * Class : ManageOrganizationDirectoryJPanel.java
 * Developer : Laksh Lumba
 * Reviewer :
 * Description : 
 * Created On : Oct 18, 2014, 1:41:17 PM
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
package UserInterface.AdminstrativeRole;

import Business.organization.CustomerOrganization;
import Business.organization.Organization;
import Business.organization.Organization.Type;
import Business.organization.OrganizationDirectory;
import Business.organization.SupplierOrganization;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Laksh
 */
public class ManageOrganizationDirectoryJPanel extends javax.swing.JPanel {
    private final JPanel userProcessContainer;
    private final OrganizationDirectory organizationDirectory;
    /**
     * Creates new form ManageOrganizationDirectoryJPanel
     * @param userProcessContainer
     * @param organizationDirectory
     */
    public ManageOrganizationDirectoryJPanel(JPanel userProcessContainer,OrganizationDirectory organizationDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organizationDirectory = organizationDirectory;
        populateTable();
        populateCombobox();
    }
    private void populateTable(){
        DefaultTableModel orgTable = (DefaultTableModel)manageOrganizationTable.getModel();
        orgTable.setRowCount(0);
        if (null != organizationDirectory.getOrganizationList()){
            for(Organization organization : organizationDirectory.getOrganizationList()){
                Object row[] = new Object[2];
                row[0] = organization.getOrgId();
                row[1] = organization;
                orgTable.addRow(row);
            }
        }
    }
    
    private void populateCombobox(){
        organizationComboBox.removeAllItems();
        for(Type organization : Type.values()) { 
            organizationComboBox.addItem(organization);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        manageOrganizationTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        organizationComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        createOrganizationButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        viewOrganizationButton = new javax.swing.JButton();

        manageOrganizationTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Organization Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(manageOrganizationTable);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setText("Manage Organization");

        organizationComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                organizationComboBoxItemStateChanged(evt);
            }
        });
        organizationComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationComboBoxActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Organization");

        createOrganizationButton.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        createOrganizationButton.setText("Create Organization");
        createOrganizationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createOrganizationButtonActionPerformed(evt);
            }
        });

        backButton.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        backButton.setText("<< Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        viewOrganizationButton.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        viewOrganizationButton.setText("View Organization");
        viewOrganizationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewOrganizationButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(173, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backButton)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(viewOrganizationButton)
                                        .addGap(51, 51, 51)
                                        .addComponent(createOrganizationButton))
                                    .addComponent(organizationComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(175, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(organizationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createOrganizationButton)
                    .addComponent(backButton)
                    .addComponent(viewOrganizationButton))
                .addContainerGap(245, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void organizationComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationComboBoxActionPerformed
        
    }//GEN-LAST:event_organizationComboBoxActionPerformed

    private void createOrganizationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createOrganizationButtonActionPerformed
        boolean isAlready = false;
        if (null != organizationDirectory.getOrganizationList()){
            for(Organization organization : organizationDirectory.getOrganizationList()){
                if (organization.getName().equals(((Type)organizationComboBox.getSelectedItem()).getValue())){
                    isAlready = true;
                    break;
                }                    
            }
        } if (!isAlready){
            organizationDirectory.createOrganization((Type)organizationComboBox.getSelectedItem());
        } else {
            JOptionPane.showMessageDialog(null, "Organization already exist");
        }
        populateTable();
    }//GEN-LAST:event_createOrganizationButtonActionPerformed

    private void organizationComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_organizationComboBoxItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_organizationComboBoxItemStateChanged

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void viewOrganizationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewOrganizationButtonActionPerformed
         int selectedRow = manageOrganizationTable.getSelectedRow();
          if (selectedRow > 0){
              Organization organization = (Organization)manageOrganizationTable.getValueAt(selectedRow, 1);
              if (organization instanceof SupplierOrganization){                  
                  ManageSuppliers manageSuppliers = new ManageSuppliers(userProcessContainer,organization.getPersonDirectory().getSupplierDirectory());
                  userProcessContainer.add("ManageSuppliers", manageSuppliers);
                  CardLayout layout = (CardLayout)userProcessContainer.getLayout();
                  layout.next(userProcessContainer);
              }
              else if (organization instanceof CustomerOrganization){
                  ManageCustomerJPanel manageCustomerJPanel = new ManageCustomerJPanel(userProcessContainer,organization.getPersonDirectory().getCustomerDirectory());
                  userProcessContainer.add("ManageCustomerJPanel", manageCustomerJPanel);
                  CardLayout layout = (CardLayout)userProcessContainer.getLayout();
                  layout.next(userProcessContainer);
              }
           }
    }//GEN-LAST:event_viewOrganizationButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton createOrganizationButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable manageOrganizationTable;
    private javax.swing.JComboBox organizationComboBox;
    private javax.swing.JButton viewOrganizationButton;
    // End of variables declaration//GEN-END:variables
}
