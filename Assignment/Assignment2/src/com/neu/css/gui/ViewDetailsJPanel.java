/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.neu.css.gui;

import com.neu.css.model.Patient;
import com.neu.css.model.VitalSign;
import com.neu.css.model.VitalSignHistory;
import com.neu.css.util.Consts;
import com.neu.css.util.ValidationUtils;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Laksh
 */
public class ViewDetailsJPanel extends javax.swing.JPanel {
    private final Patient patient;

    /**
     * Creates new form ViewDetailsJPanel
     * @param patient
     */
    public ViewDetailsJPanel(Patient patient) {
        initComponents();
        this.patient = patient;
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
        int rowLength = defaultTableModel.getRowCount();
        for (int i = (rowLength-1); i > 0 ;i--){
            defaultTableModel.removeRow(i);
        }
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
        respiratoryRateLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        respiratoryRateTextField = new javax.swing.JTextField();
        heartRateTextField = new javax.swing.JTextField();
        bloodPressureTextField = new javax.swing.JTextField();
        weightTextField = new javax.swing.JTextField();
        dateTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

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

        respiratoryRateLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        respiratoryRateLabel.setText("Respiratory Rate");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Heart Rate");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Blood Pressure");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Weight");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Time");

        respiratoryRateTextField.setEnabled(false);

        heartRateTextField.setEnabled(false);

        bloodPressureTextField.setEnabled(false);

        weightTextField.setEnabled(false);

        dateTextField.setEnabled(false);

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

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 153));
        jLabel8.setText("Selected Vital Sign Details");

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButton1.setText("View Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(83, 83, 83))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(respiratoryRateLabel)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(respiratoryRateTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                            .addComponent(heartRateTextField)
                            .addComponent(bloodPressureTextField)
                            .addComponent(weightTextField)
                            .addComponent(dateTextField)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jLabel7))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jButton1)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(8, 8, 8)
                .addComponent(jLabel8)
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(respiratoryRateLabel)
                    .addComponent(respiratoryRateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(heartRateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(bloodPressureTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(weightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(dateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         int selectedRow =  jTable1.getSelectedRow();
        if(selectedRow >= 0){
            VitalSign vitalSign = (VitalSign)jTable1.getValueAt(selectedRow,0);
            respiratoryRateTextField.setText(String.valueOf(vitalSign.getRespiratoryRate()));
            heartRateTextField.setText(String.valueOf(vitalSign.getHeartRate()));            
            bloodPressureTextField.setText(String.valueOf(vitalSign.getBloodPressure()));
            weightTextField.setText(String.valueOf(vitalSign.getWeight()));
            dateTextField.setText(String.valueOf(vitalSign.getTime()));
        }
        else {
            (new JOptionPane()).showMessageDialog(null,Consts.NO_SELECTION_VALIDATE_MESSAGE,"Warning",JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bloodPressureTextField;
    private javax.swing.JTextField dateTextField;
    private javax.swing.JTextField heartRateTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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
    private javax.swing.JLabel respiratoryRateLabel;
    private javax.swing.JTextField respiratoryRateTextField;
    private javax.swing.JTextField weightTextField;
    // End of variables declaration//GEN-END:variables
}
