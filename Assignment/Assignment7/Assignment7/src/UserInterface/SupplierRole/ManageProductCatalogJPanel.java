/*
 * ManageProductCatalogJPanel.java
 *
 * Created on September 24, 2008, 2:40 PM
 */
package UserInterface.SupplierRole;

import Business.product.Product;
import Business.supplier.Supplier;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author laksh
 */
public class ManageProductCatalogJPanel extends javax.swing.JPanel {

    private final JPanel userProcessContainer;
    private final Supplier supplier;  
    /** Creates new form ManageProductCatalogJPanel
     * @param userProcessContainer
     * @param supplier */
    public ManageProductCatalogJPanel(JPanel userProcessContainer, Supplier supplier) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.supplier = supplier;
        sNameTextField.setText(supplier.getName());
        refreshTable();
    }
    
    private void refreshTable() {
        DefaultTableModel model = (DefaultTableModel)productCatalog.getModel();
        model.setRowCount(0);        
        for(Product product : supplier.getProductCatalog().getProductList()) {
            Object row[] = new Object[3];
            row[0] = product;
            row[1] = product.getModelNumber();
            row[2] = product.getPrice();
            model.addRow(row);
            }
        }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        productCatalog = new javax.swing.JTable();
        viewPButton = new javax.swing.JButton();
        createPButton = new javax.swing.JButton();
        searchPButton = new javax.swing.JButton();
        backButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        sNameTextField = new javax.swing.JTextField();
        refreshButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setText("Manage Product Catalog");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 200, -1));

        productCatalog.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        productCatalog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Product Name", "Product ID", "Price"
            }
        ));
        jScrollPane1.setViewportView(productCatalog);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 500, 90));

        viewPButton.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        viewPButton.setText("View Product Detail >>");
        viewPButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPButtonActionPerformed(evt);
            }
        });
        add(viewPButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 220, -1));

        createPButton.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        createPButton.setText("Create New Product >>");
        createPButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPButtonActionPerformed(evt);
            }
        });
        add(createPButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, -1, -1));

        searchPButton.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        searchPButton.setText("Search >>");
        searchPButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchPButtonActionPerformed(evt);
            }
        });
        add(searchPButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 130, -1));

        backButton4.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        backButton4.setText("<< Back");
        backButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton4ActionPerformed(evt);
            }
        });
        add(backButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 110, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Supplier:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 170, 20));

        sNameTextField.setEditable(false);
        sNameTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        sNameTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sNameTextField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(102, 102, 102), null, null));
        add(sNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 170, 20));

        refreshButton.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        refreshButton.setText("Refresh");
        refreshButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        refreshButton.setMargin(new java.awt.Insets(2, 1, 2, 1));
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });
        add(refreshButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 90, -1));

        deleteButton.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        deleteButton.setText("Delete Product(s)");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 190, -1));
    }// </editor-fold>//GEN-END:initComponents
    private void viewPButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPButtonActionPerformed
        // TODO add your handling code here:
        int row = productCatalog.getSelectedRow();
        if(row > 0) {
            Product product = (Product)productCatalog.getValueAt(row, 0);
            ViewProductDetailJPanel viewProductDetailJPanel = new ViewProductDetailJPanel(userProcessContainer, product);
            userProcessContainer.add("ViewProductDetailJPanelSupplier", viewProductDetailJPanel);
            CardLayout layout = (CardLayout)userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        
    }//GEN-LAST:event_viewPButtonActionPerformed

    private void createPButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPButtonActionPerformed
        CreateNewProductJPanel createNewProductJPanel = new CreateNewProductJPanel(userProcessContainer, supplier);
        userProcessContainer.add("SupplierWorkAreaJPanel",createNewProductJPanel);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_createPButtonActionPerformed

    private void searchPButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchPButtonActionPerformed
        // TODO add your handling code here:
        SearchForProductJPanel searchForProductJPanel = new SearchForProductJPanel(userProcessContainer, supplier);
        userProcessContainer.add("SearchForProductJPanel", searchForProductJPanel);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_searchPButtonActionPerformed

    private void backButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton4ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButton4ActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        // TODO add your handling code here:
        refreshTable();
}//GEN-LAST:event_refreshButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        int row = productCatalog.getSelectedRow();
        if(row > 0) {
            Product product = (Product)productCatalog.getValueAt(row, 0);
            supplier.getProductCatalog().removeProduct(product);
            refreshTable();
        }
       
    }//GEN-LAST:event_deleteButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton4;
    private javax.swing.JButton createPButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable productCatalog;
    private javax.swing.JButton refreshButton;
    private javax.swing.JTextField sNameTextField;
    private javax.swing.JButton searchPButton;
    private javax.swing.JButton viewPButton;
    // End of variables declaration//GEN-END:variables
}
