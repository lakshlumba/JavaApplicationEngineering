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
    private int respiratoryRate;
    private int heartRate;
    private int bloodPressure;
    private int weight;
    private String time;

    /**
     * @return the respiratoryRate
     */
    public int getRespiratoryRate() {
        return respiratoryRate;
    }

    /**
     * @param respiratoryRate the respiratoryRate to set
     */
    public void setRespiratoryRate(int respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    /**
     * @return the heartRate
     */
    public int getHeartRate() {
        return heartRate;
    }

    /**
     * @param heartRate the heartRate to set
     */
    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    /**
     * @return the bloodPressure
     */
    public int getBloodPressure() {
        return bloodPressure;
    }

    /**
     * @param bloodPressure the bloodPressure to set
     */
    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    /**
     * @return the weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * @return the time
     */
    public String getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return time;
    }
          
}
