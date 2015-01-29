/*
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
    
}
