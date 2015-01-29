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
public class AccountDirectory {
    private ArrayList<Account> accountList;
    /**
     * custructor
     */
    public AccountDirectory() {
        this.accountList = new ArrayList<Account>();
    }

    /**
     * @return the accountList
     */
    public ArrayList<Account> getAccountList() {
        return accountList;
    }

    /**
     * @param accountList the accountList to set
     */
    public void setAccountList(ArrayList<Account> accountList) {
        this.accountList = accountList;
    }
    
    public Account searchAccount(String key){
        for(Account account : accountList){
            if(account.getAccountNumber().equals(key)){
                return account;
            } 
        }
        return null;
    }
    
    public void deleteAccount(Account account){
        accountList.remove(account);
    }
    
    public Account addAccount(){
        Account account = new Account();
        accountList.add(account);
        return account;
    }
    
}
