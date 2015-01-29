/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.neu.css.view;

import com.neu.css.model.VitalSign;
import com.neu.css.util.Consts;
import com.neu.css.util.ValidationUtils;
import java.awt.CardLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Laksh
 */
public class ViewVitalSignJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private VitalSign vitalSign;
    /**
     * Creates new form ViewVitalSignJPanel
     */
    public ViewVitalSignJPanel(JPanel userProcessContainer, VitalSign vitalSign) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.vitalSign = vitalSign;
        populateValues();
    }
    private void populateValues(){
         if (null != vitalSign ){
            respiratoryRateTextField.setText(String.valueOf(vitalSign.getRespiratoryRate()));
            heartRateTextField.setText(String.valueOf(vitalSign.getHeartRate()));
            bloodPressureTextField.setText(String.valueOf(vitalSign.getBloodPressure()));
            weightTextField.setText(String.valueOf(vitalSign.getWeight()));
            dateTextField.setText(String.valueOf(vitalSign.getTime()));
            disabledEnabledTextFields(false);
        } 
    }    
     /**
     * disable or enable the textfields
     * @param value 
     */
    private void disabledEnabledTextFields(boolean value){
        respiratoryRateTextField.setEnabled(value);
        heartRateTextField.setEnabled(value);
        bloodPressureTextField.setEnabled(value);
        weightTextField.setEnabled(value);
        dateTextField.setEnabled(false);
    }
        /**
     * validate the fields before submitting
     */
    private boolean validateFields()
    {
        StringBuffer validationMessage = new StringBuffer();
        boolean isValidationPassed = true;
        if(ValidationUtils.isStringEmptyOrNull(respiratoryRateTextField.getText()) || !(ValidationUtils.isInteger(respiratoryRateTextField.getText()))){
            validationMessage.append(Consts.RESPIRATORY_VALIDATE_MESSAGE);
            validationMessage.append(Consts.NEXT_LINE);
            isValidationPassed = false;
        }
        if(ValidationUtils.isStringEmptyOrNull(heartRateTextField.getText()) || !(ValidationUtils.isInteger(heartRateTextField.getText()))){
            validationMessage.append(Consts.HEART_VALIDATE_MESSAGE);
            validationMessage.append(Consts.NEXT_LINE);
            isValidationPassed = false;
        }
        if(ValidationUtils.isStringEmptyOrNull(bloodPressureTextField.getText()) || !(ValidationUtils.isInteger(bloodPressureTextField.getText())) ){
            validationMessage.append(Consts.BLOOD_PRESSURE_VALIDATE_MESSAGE);
            validationMessage.append(Consts.NEXT_LINE);
            isValidationPassed = false;
        }
        if(ValidationUtils.isStringEmptyOrNull(weightTextField.getText()) || !(ValidationUtils.isInteger(weightTextField.getText()))){
            validationMessage.append(Consts.WEIGHT_VALIDATE_MESSAGE);
            validationMessage.append(Consts.NEXT_LINE);
            isValidationPassed = false;
        }        
        if(!isValidationPassed){
            JOptionPane.showMessageDialog(null,validationMessage);
        } 
        return isValidationPassed;
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
        backButton = new javax.swing.JButton();
        updateVitalSignButton = new javax.swing.JButton();
        saveVitalSignButton = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("View Vital Sign ");

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

        backButton.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        backButton.setText("<< Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        updateVitalSignButton.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        updateVitalSignButton.setText("Update Vital Sign");
        updateVitalSignButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateVitalSignButtonActionPerformed(evt);
            }
        });

        saveVitalSignButton.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        saveVitalSignButton.setText("Save Vital Sign");
        saveVitalSignButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveVitalSignButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(109, 109, 109)
                                .addComponent(heartRateTextField))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(respiratoryRateLabel)
                                .addGap(72, 72, 72)
                                .addComponent(respiratoryRateTextField))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(85, 85, 85)
                                .addComponent(bloodPressureTextField))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12))
                                .addGap(132, 132, 132)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dateTextField)
                                    .addComponent(weightTextField)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(updateVitalSignButton)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(86, 86, 86)
                .addComponent(saveVitalSignButton)
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(respiratoryRateLabel)
                    .addComponent(respiratoryRateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(heartRateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(bloodPressureTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(weightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(dateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveVitalSignButton)
                    .addComponent(updateVitalSignButton))
                .addGap(1, 1, 1)
                .addComponent(backButton)
                .addGap(29, 29, 29))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void updateVitalSignButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateVitalSignButtonActionPerformed
        // TODO add your handling code here:
        disabledEnabledTextFields(true);
    }//GEN-LAST:event_updateVitalSignButtonActionPerformed

    private void saveVitalSignButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveVitalSignButtonActionPerformed
    // TODO add your handling code here:
//         if (ValidationUtils.isStringEmptyOrNull(patient.getPatientId())){
//            JOptionPane.showMessageDialog(null,Consts.CREATE_PATIENT_MESSAGE);
//       } else {
        if (validateFields()){
            vitalSign.setRespiratoryRate(Integer.parseInt(respiratoryRateTextField.getText()));
            vitalSign.setHeartRate(Integer.parseInt(heartRateTextField.getText()));
            vitalSign.setBloodPressure(Integer.parseInt(bloodPressureTextField.getText()));
            vitalSign.setWeight(Integer.parseInt(weightTextField.getText()));
            // get the simple date format
            DateFormat dateFormat = new SimpleDateFormat(Consts.DATE_FORMAT);
            // Get the today's date
            Date today = Calendar.getInstance().getTime();
            String reportDate = dateFormat.format(today);
            vitalSign.setTime(reportDate);      
            clearAll();
        }
    }//GEN-LAST:event_saveVitalSignButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout cardLayout = (CardLayout)userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed
    private void clearAll(){
        respiratoryRateTextField.setText(Consts.EMPTY);
        heartRateTextField.setText(Consts.EMPTY);
        bloodPressureTextField.setText(Consts.EMPTY);
        weightTextField.setText(Consts.EMPTY); 
        dateTextField.setText(Consts.EMPTY);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTextField bloodPressureTextField;
    private javax.swing.JTextField dateTextField;
    private javax.swing.JTextField heartRateTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel respiratoryRateLabel;
    private javax.swing.JTextField respiratoryRateTextField;
    private javax.swing.JButton saveVitalSignButton;
    private javax.swing.JButton updateVitalSignButton;
    private javax.swing.JTextField weightTextField;
    // End of variables declaration//GEN-END:variables
}
