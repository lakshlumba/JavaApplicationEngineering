/*
 * Class : Enterprise.java
 * Developer : Laksh Lumba
 * Reviewer :
 * Description : 
 * Created On : Nov 8, 2014, 9:37:58 AM
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
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;

/**
 *
 * @author Laksh
 */
public abstract class Enterprise extends Organization{
   private final OrganizationDirectory organizationDirectory;
   private final EnterpriseType enterpriseType;
   public Enterprise(String name, EnterpriseType enterpriseType){
       super(name);
       this.enterpriseType = enterpriseType;
       organizationDirectory = new OrganizationDirectory();
   }
   public enum EnterpriseType{
       Hospital("Hospital");
       private String value;
       
       private EnterpriseType(String value){
           this.value = value;
       }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
       
   }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }
    
}
