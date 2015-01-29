/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.neu.css.view;

import com.neu.css.model.PatientList;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import com.neu.css.model.Patient;
import com.neu.css.util.Consts;
import com.neu.css.util.ValidationUtils;
import javax.swing.JOptionPane;

/**
 *
 * @author Laksh
 */
public class ManagePatientJPanel extends javax.swing.JPanel {
    private PatientList patientList;
    private JPanel userProcessContainer;
    /**
     * Creates new form ManagePatientJPanel
     */
    public ManagePatientJPanel(JPanel userProcessContainer,PatientList patientList) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.patientList = patientList;
        refreshPatientTable();
    }
    /**
     * this method is used to refresh the table 
     */
    private void refreshPatientTable(){
        DefaultTableModel defaultTableModel = (DefaultTableModel)patientJTable.getModel();
        defaultTableModel.setRowCount(0); 
        //there are multiple ways to iterate the hash map ,but we need only objects
        for(Patient patient : patientList.getPatientMap().values()){
            Object[] rows =  new Object[5];
            rows[0] = patient;
            rows[1] = patient.getPatientName();
            rows[2] = patient.getPatientAge();
            rows[3] = patient.getPrimaryDoctorName();
            rows[4] = patient.getPreferredPharmacy();
            defaultTableModel.addRow(rows);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        patientJTable = new javax.swing.JTable();
        searchPatient = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        viewPatientButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();

        patientJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient Id", "Patient Name", "Patient Age", "Doctor Name", "Pharmacy"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(patientJTable);

        searchPatient.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        searchPatient.setText("Serach Patient");
        searchPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchPatientActionPerformed(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        deleteButton.setText("Delete Patient");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        viewPatientButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        viewPatientButton.setText("View Patient Details ");
        viewPatientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPatientButtonActionPerformed(evt);
            }
        });

        refreshButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        refreshButton.setText("Refresh Patient Table");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("View Patient List");

        backButton.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        backButton.setText("<< Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(refreshButton)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(searchPatient)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(deleteButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addComponent(viewPatientButton)))
                .addGap(45, 45, 45))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchPatient)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(refreshButton)
                    .addComponent(deleteButton)
                    .addComponent(viewPatientButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(backButton)
                .addGap(17, 17, 17))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout cardLayout = (CardLayout)userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow =  patientJTable.getSelectedRow();
        if (selectedRow >= 0){
            Patient patient = (Patient)patientJTable.getValueAt(selectedRow,0);
            patientList.getPatientMap().remove(patient.getPatientId());
            
        }else{
            JOptionPane.showMessageDialog(null,Consts.NO_SELECTION_VALIDATE_MESSAGE,"Warning",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void viewPatientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPatientButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow =  patientJTable.getSelectedRow();
        if (selectedRow >= 0){
            Patient patient = (Patient)patientJTable.getValueAt(selectedRow,0);
            ViewPatientDetailsJPanel viewPatientDetailsJPanel =  new ViewPatientDetailsJPanel(userProcessContainer,patientList,patient);
            userProcessContainer.add("ViewPatientDetailsJPanel",viewPatientDetailsJPanel);
            CardLayout cardLayout = (CardLayout)userProcessContainer.getLayout();
            cardLayout.next(userProcessContainer);
            
        }else{
            JOptionPane.showMessageDialog(null,Consts.NO_SELECTION_VALIDATE_MESSAGE,"Warning",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_viewPatientButtonActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        // TODO add your handling code here:
        refreshPatientTable();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void searchPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchPatientActionPerformed
        // TODO add your handling code here:
        String searchedValue = jTextField1.getText();
        if (ValidationUtils.isStringEmptyOrNull(searchedValue)){
            JOptionPane.showMessageDialog(null,Consts.INPUT_NULL_MESSAGE,"Warning",JOptionPane.WARNING_MESSAGE);
        }else {
            Patient patient = patientList.getPatientMap().get(searchedValue);
            if (null != patient){
                SearchPatientJPanel searchPatientJPanel = new SearchPatientJPanel(userProcessContainer,patient);
                userProcessContainer.add("SearchPatientJPanel",searchPatientJPanel);
                CardLayout cardLayout = (CardLayout)userProcessContainer.getLayout();
                cardLayout.next(userProcessContainer);
            }  else {
               JOptionPane.showMessageDialog(null,Consts.INPUT_VALIDATE_MESSAGE,"Warning",JOptionPane.WARNING_MESSAGE);                
            }         
        }
        
    }//GEN-LAST:event_searchPatientActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable patientJTable;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton searchPatient;
    private javax.swing.JButton viewPatientButton;
    // End of variables declaration//GEN-END:variables
}
