/*
 * Class : ValidationUtils.java
 * Developer : Laksh Lumba
 * Reviewer :
 * Description : 
 * Created On : Oct 6, 2014, 2:49:28 AM
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
package com.neu.css.util;

/**
 *
 * @author Laksh
 */
public class ValidationUtils {
    /**
     * null and empty check for strings
     * @param str
     * @return 
     */
    public static boolean isStringEmptyOrNull(String str)
    {
        if(null == str || "".equals(str.trim())){
            return true;
        }else {
            return false;
        }
    }
    public static boolean isFloat(String str)
    {
        try{
            Float.parseFloat(str);
            return true;
        }catch(Exception e) {
            return false;
        }
    }
     
    public static boolean isInteger(String str)
    {
        try{
            Integer.parseInt(str);
            return true;
        }catch(NumberFormatException numberFormatException) {
            return false;
        }
    }
}
