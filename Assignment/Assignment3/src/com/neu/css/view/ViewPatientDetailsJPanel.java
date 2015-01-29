/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.neu.css.view;

import com.neu.css.model.Patient;
import com.neu.css.model.PatientList;
import com.neu.css.model.VitalSign;
import com.neu.css.model.VitalSignHistory;
import com.neu.css.util.Consts;
import com.neu.css.util.ValidationUtils;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author Laksh
 */
public class ViewPatientDetailsJPanel extends javax.swing.JPanel {
    private final Patient patient;
    private JPanel userProcessContainer;
    private PatientList patientList;

    /**
     * Creates new form ViewDetailsJPanel
     * @param patient
     */
    public ViewPatientDetailsJPanel(JPanel userProcessContainer,PatientList patientList,Patient patient) {
        initComponents();
        this.patient = patient;
        this.userProcessContainer = userProcessContainer;
        this.patientList = patientList;
        viewPatientDetails();
    }
    /**
     * set the patient details in the text fields
     * view the patient details
     */
    private void viewPatientDetails(){
        if (!ValidationUtils.isStringEmptyOrNull(patient.getPatientId())){
            patientNameTextField.setText(String.valueOf(patient.getPatientName()));
            patientIdTextField.setText(String.valueOf(patient.getPatientId()));
            patientAgeTextField.setText(String.valueOf(patient.getPatientAge()));
            preferredDoctorNameTextField.setText(String.valueOf(patient.getPrimaryDoctorName()));
            preferredPharmacyTextField.setText(String.valueOf(patient.getPreferredPharmacy()));
            populateTable();
        }
    }
    /**
     * populate the table with the vital sign history object
     */
    private void populateTable(){
        DefaultTableModel defaultTableModel = (DefaultTableModel)jTable1.getModel();
        defaultTableModel.setRowCount(0);
        VitalSignHistory vitalSignHistory = patient.getVitalSignHistory();
        if (null != vitalSignHistory){
            ArrayList<VitalSign> vitalSignList = vitalSignHistory.getVitalSignList();
            for(VitalSign vitalSign : vitalSignList){
                Object[] rows = new Object[2];
                rows[0] = vitalSign;
                rows[1] = (String)checkSymtoms(vitalSign);
                defaultTableModel.addRow(rows);
            }
        }       
    }
    /**
     *  check the symptoms of the vital sign based on the age and vital signs values 
     * @param vitalSign
     * @return 
     */
    private String checkSymtoms(VitalSign vitalSign){
        if (patient.getPatientAge() <= 3 ){
            if ((vitalSign.getRespiratoryRate() >= 20  && vitalSign.getRespiratoryRate() <= 30)
                 && (vitalSign.getHeartRate()>= 80  && vitalSign.getHeartRate() <= 130)   
                 && (vitalSign.getBloodPressure()>= 80  && vitalSign.getBloodPressure()<= 110)
                 && (vitalSign.getWeight() >= 22  && vitalSign.getWeight() <= 31)){
                     return Consts.NORMAL;
            }else {
                return Consts.ABNORMAL;
            }
        } else if(patient.getPatientAge() >= 4  && patient.getPatientAge() <=5 ) {
            if ((vitalSign.getRespiratoryRate() >= 20  && vitalSign.getRespiratoryRate() <= 30)
                    && (vitalSign.getHeartRate()>= 80  && vitalSign.getHeartRate() <= 120)   
                    && (vitalSign.getBloodPressure()>= 80  && vitalSign.getBloodPressure()<= 110)
                    && (vitalSign.getWeight() >= 31  && vitalSign.getWeight() <= 40)){
                        return Consts.NORMAL;
               }else {
                   return Consts.ABNORMAL;
               }
        }  else if(patient.getPatientAge() >= 6  && patient.getPatientAge() <= 12 ) {
            if ((vitalSign.getRespiratoryRate() >= 20  && vitalSign.getRespiratoryRate() <= 30)
                    && (vitalSign.getHeartRate()>= 70  && vitalSign.getHeartRate() <= 110)   
                    && (vitalSign.getBloodPressure()>= 80  && vitalSign.getBloodPressure()<= 120)
                    && (vitalSign.getWeight() >= 41  && vitalSign.getWeight() <= 92)){
                        return Consts.NORMAL;
               }else {
                   return Consts.ABNORMAL;
               }
        } else if(patient.getPatientAge() >= 13 ) {
            if ((vitalSign.getRespiratoryRate() >= 12  && vitalSign.getRespiratoryRate() <= 20)
                    && (vitalSign.getHeartRate()>= 55  && vitalSign.getHeartRate() <= 105)   
                    && (vitalSign.getBloodPressure()>= 110  && vitalSign.getBloodPressure()<= 120)
                    && (vitalSign.getWeight() >= 110)){
                        return Consts.NORMAL;
               }else {
                   return Consts.ABNORMAL;
               }
        } 
        return null;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        patientNameTextField = new javax.swing.JTextField();
        patientIdTextField = new javax.swing.JTextField();
        patientAgeTextField = new javax.swing.JTextField();
        preferredDoctorNameTextField = new javax.swing.JTextField();
        preferredPharmacyTextField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        viewVitalSignButton = new javax.swing.JButton();
        deleteVitalSignButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        addVitalSignButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        showGraphButton = new javax.swing.JButton();

        jSplitPane1.setDividerLocation(250);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("View Patient Details");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Patient Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Patient Id");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Patient Age");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Doctor Name");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Pref Pharmacy");

        patientNameTextField.setEnabled(false);

        patientIdTextField.setEnabled(false);

        patientAgeTextField.setEnabled(false);

        preferredDoctorNameTextField.setEnabled(false);

        preferredPharmacyTextField.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel1)
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)))
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(patientNameTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                    .addComponent(patientIdTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(patientAgeTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(preferredDoctorNameTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(preferredPharmacyTextField, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(patientNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(patientIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(patientAgeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(preferredDoctorNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(preferredPharmacyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(186, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 153));
        jLabel7.setText("Vital Sign History");

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Symtoms"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        viewVitalSignButton.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        viewVitalSignButton.setText("View Details");
        viewVitalSignButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewVitalSignButtonActionPerformed(evt);
            }
        });

        deleteVitalSignButton.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        deleteVitalSignButton.setText("Delete Vital Sign");
        deleteVitalSignButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteVitalSignButtonActionPerformed(evt);
            }
        });

        backButton.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        backButton.setText("<< Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        addVitalSignButton.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        addVitalSignButton.setText("Add Vital Sign");
        addVitalSignButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addVitalSignButtonActionPerformed(evt);
            }
        });

        refreshButton.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        showGraphButton.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        showGraphButton.setText("Show Vital Sign Graphs");
        showGraphButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showGraphButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jLabel7))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(deleteVitalSignButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(showGraphButton))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(refreshButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(addVitalSignButton)
                        .addGap(18, 18, 18)
                        .addComponent(viewVitalSignButton)))
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addGap(130, 130, 130)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewVitalSignButton)
                    .addComponent(addVitalSignButton)
                    .addComponent(refreshButton))
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteVitalSignButton)
                    .addComponent(showGraphButton))
                .addGap(37, 37, 37)
                .addComponent(backButton)
                .addContainerGap())
        );

        jSplitPane1.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewVitalSignButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewVitalSignButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow =  jTable1.getSelectedRow();
        if(selectedRow >= 0){
            VitalSign vitalSign = (VitalSign)jTable1.getValueAt(selectedRow,0);
            ViewVitalSignJPanel viewVitalSignJPanel = new ViewVitalSignJPanel(userProcessContainer,vitalSign);
            userProcessContainer.add("ViewVitalSignJPanel",viewVitalSignJPanel);
            CardLayout cardLayout = (CardLayout)userProcessContainer.getLayout();
            cardLayout.next(userProcessContainer);
        }
        else {
            JOptionPane.showMessageDialog(null,Consts.NO_SELECTION_VALIDATE_MESSAGE,"Warning",JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_viewVitalSignButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout cardLayout = (CardLayout)userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void addVitalSignButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addVitalSignButtonActionPerformed
        // TODO add your handling code here:
        AddVitalSignJPanel addVitalSignJPanel = new AddVitalSignJPanel(userProcessContainer,patientList,patient);
        userProcessContainer.add("AddVitalSignJPanel",addVitalSignJPanel);
        CardLayout cardLayout = (CardLayout)userProcessContainer.getLayout();
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_addVitalSignButtonActionPerformed

    private void showGraphButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showGraphButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow =  jTable1.getSelectedRow();
        if(selectedRow >= 0){
            VitalSign vitalSign = (VitalSign)jTable1.getValueAt(selectedRow,0);
            DefaultPieDataset defaultPieDataset = new DefaultPieDataset();
            defaultPieDataset.setValue("Repiratory Rate", vitalSign.getRespiratoryRate());
            defaultPieDataset.setValue("Heart Rate", vitalSign.getHeartRate());
            defaultPieDataset.setValue("Blood Pressure", vitalSign.getBloodPressure());
            defaultPieDataset.setValue("Weight", vitalSign.getWeight());
            JFreeChart jFreeChart = ChartFactory.createPieChart("Vital Sign Graphical Representation", defaultPieDataset, true, true, Locale.US);
            PiePlot piePlot = (PiePlot)jFreeChart.getPlot();
            ChartFrame chartFrame = new ChartFrame("Pie Chart", jFreeChart);
            chartFrame.setVisible(true);
            chartFrame.setSize(450,500);
            
        }
        else {
            JOptionPane.showMessageDialog(null,Consts.NO_SELECTION_VALIDATE_MESSAGE,"Warning",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_showGraphButtonActionPerformed

    private void deleteVitalSignButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteVitalSignButtonActionPerformed
        // TODO add your handling code here:
         // TODO add your handling code here:
        int selectedRow =  jTable1.getSelectedRow();
        if(selectedRow >= 0){
            VitalSign vitalSign = (VitalSign)jTable1.getValueAt(selectedRow,0);
            if (null != patient.getVitalSignHistory()){
                patient.getVitalSignHistory().removeVitalSign(vitalSign);
            }   
            populateTable();
        }
        else {
            JOptionPane.showMessageDialog(null,Consts.NO_SELECTION_VALIDATE_MESSAGE,"Warning",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_deleteVitalSignButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addVitalSignButton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton deleteVitalSignButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField patientAgeTextField;
    private javax.swing.JTextField patientIdTextField;
    private javax.swing.JTextField patientNameTextField;
    private javax.swing.JTextField preferredDoctorNameTextField;
    private javax.swing.JTextField preferredPharmacyTextField;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton showGraphButton;
    private javax.swing.JButton viewVitalSignButton;
    // End of variables declaration//GEN-END:variables
}
