/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.neu.css.model;

import java.util.ArrayList;

/**
 *
 * @author Laksh
 */
public class VitalSignHistory {
    private ArrayList<VitalSign> vitalSignList;
    /**
    * constructor 
    */
    public VitalSignHistory() {
        this.vitalSignList = new ArrayList<VitalSign>();
    }
    /**
     * add the vital sign to the list
     */
    public VitalSign addVitalSign() {
        VitalSign vitalSign = new VitalSign();
        this.vitalSignList.add(vitalSign);
        return vitalSign;
     }
    /**
     * remove the vital sign from the list
     * @param vitalSign 
     */
    public void removeVitalSign(VitalSign vitalSign){
        this.vitalSignList.remove(vitalSign);
    }

    /**
     * @return the vitalSignList
     */
    public ArrayList<VitalSign> getVitalSignList() {
        return vitalSignList;
    }

    /**
     * @param vitalSignList the vitalSignList to set
     */
    public void setVitalSignList(ArrayList<VitalSign> vitalSignList) {
        this.vitalSignList = vitalSignList;
    }
}
