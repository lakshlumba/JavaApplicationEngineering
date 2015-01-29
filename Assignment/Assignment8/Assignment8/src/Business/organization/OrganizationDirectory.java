/*
 * Class : OrganizationDirectory.java
 * Developer : Laksh Lumba
 * Reviewer :
 * Description : 
 * Created On : Oct 18, 2014, 1:37:28 PM
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
package Business.organization;

import Business.organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author Laksh
 */
public class OrganizationDirectory {
     private final ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        this.organizationList = new ArrayList<Organization>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type) {
        Organization organization = null;
        if (type.getValue().equals(Type.Customer.getValue())){
            organization =  new CustomerOrganization();
        }
        else if (type.getValue().equals(Type.Supplier.getValue())){
            organization = new SupplierOrganization();
        } 
        else if (type.getValue().equals(Type.Sales.getValue())){
            organization = new SalesOrganization();
        }
        else if (type.getValue().equals(Type.Shipping.getValue())){
            organization = new ShippingOrganization();
        }
        organizationList.add(organization);
        return organization;    
    }
}
