/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.neu.css.model;

import java.util.HashMap;

/**
 *
 * @author Laksh
 */
public class PatientList {
    private HashMap<String,Patient> patientMap; 
    /**
     * constructor
     */
    public PatientList() {
        patientMap = new HashMap<String,Patient>();
    }

    /**
     * @return the patientMap
     */
    public HashMap<String,Patient> getPatientMap() {
        return patientMap;
    }

    /**
     * @param patientMap the patientMap to set
     */
    public void setPatientMap(HashMap<String,Patient> patientMap) {
        this.patientMap = patientMap;
    }
    
}
