/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.neu.css.model;

/**
 *
 * @author Laksh
 */
public class Patient {
    private String patientName;
    private String patientId;
    private int patientAge;
    private String primaryDoctorName;
    private String preferredPharmacy;
    private VitalSignHistory vitalSignHistory;

    /**
     * @return the patientName
     */
    public String getPatientName() {
        return patientName;
    }

    /**
     * @param patientName the patientName to set
     */
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    /**
     * @return the patientId
     */
    public String getPatientId() {
        return patientId;
    }

    /**
     * @param patientId the patientId to set
     */
    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    /**
     * @return the patientAge
     */
    public int getPatientAge() {
        return patientAge;
    }

    /**
     * @param patientAge the patientAge to set
     */
    public void setPatientAge(int patientAge) {
        this.patientAge = patientAge;
    }

    /**
     * @return the primaryDoctorName
     */
    public String getPrimaryDoctorName() {
        return primaryDoctorName;
    }

    /**
     * @param primaryDoctorName the primaryDoctorName to set
     */
    public void setPrimaryDoctorName(String primaryDoctorName) {
        this.primaryDoctorName = primaryDoctorName;
    }

    /**
     * @return the preferredPharmacy
     */
    public String getPreferredPharmacy() {
        return preferredPharmacy;
    }

    /**
     * @param preferredPharmacy the preferredPharmacy to set
     */
    public void setPreferredPharmacy(String preferredPharmacy) {
        this.preferredPharmacy = preferredPharmacy;
    }

    /**
     * @return the vitalSignHistory
     */
    public VitalSignHistory getVitalSignHistory() {
        return vitalSignHistory;
    }

    /**
     * @param vitalSignHistory the vitalSignHistory to set
     */
    public void setVitalSignHistory(VitalSignHistory vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }
    
}
