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
public class VitalSign {
    private float temparature;
    private float bloodpressure;
    private int pulse;
    private String date;

    /**
     * @return the temparature
     */
    public float getTemparature() {
        return temparature;
    }

    /**
     * @param temparature the temparature to set
     */
    public void setTemparature(float temparature) {
        this.temparature = temparature;
    }

    /**
     * @return the bloodpressure
     */
    public float getBloodpressure() {
        return bloodpressure;
    }

    /**
     * @param bloodpressure the bloodpressure to set
     */
    public void setBloodpressure(float bloodpressure) {
        this.bloodpressure = bloodpressure;
    }

    /**
     * @return the pulse
     */
    public int getPulse() {
        return pulse;
    }

    /**
     * @param pulse the pulse to set
     */
    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return date;
    }
    
}
