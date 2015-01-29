/*
 * Class : ProductSalesReviewJPanel.java
 * Developer : Laksh Lumba
 * Reviewer :
 * Description : 
 * Created On : Oct 6, 2014, 4:57:56 PM
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
package UserInterface.SupplierRole;

import Business.Product;
import Business.Supplier;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Laksh
 */
public class ProductSalesReviewJPanel extends javax.swing.JPanel {
    private final JPanel userProcessContainer;
    private final Supplier supplier;
    /**
     * Creates new form ProductSalesReviewJPanel
     * @param userProcessContainer
     * @param supplier
     */
    public ProductSalesReviewJPanel(JPanel userProcessContainer,Supplier supplier) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.supplier = supplier;
        populateSalesTable();
        getMaximumSellingProduct();
        getMaximumSalesProduct();
    }
    private void getMaximumSellingProduct(){
        int productSalesValue = 0;
        if (null != supplier.getProductCatalog()){
           String[] productMax = new String[2];
           productMax[1] = String.valueOf(0);
           for (Product product : supplier.getProductCatalog().getProductList()){               
                productSalesValue = product.getPrice()*(product.getInitialQuantity() - product.getAvailable());
                if (productSalesValue > Integer.parseInt(productMax[1])) {
                    productMax[0] = product.getProdName();
                    productMax[1] = String.valueOf(productSalesValue);
                }               
            }
         maximumSaleValueTextField.setText(productMax[0]);
        }
    }
    private void getMaximumSalesProduct(){
        int productSaleProduct = 0;
        if (null != supplier.getProductCatalog()){
           String[] productMax = new String[2];
           productMax[1] = String.valueOf(0);
           for (Product product : supplier.getProductCatalog().getProductList()){               
                productSaleProduct = product.getInitialQuantity() - product.getAvailable();
                if (productSaleProduct > Integer.parseInt(productMax[1])) {
                    productMax[0] = product.getProdName();
                    productMax[1] = String.valueOf(productSaleProduct);
                }               
            }
         maximumSoldTextField.setText(productMax[0]);
        }        
    }
    private void populateSalesTable(){
        DefaultTableModel defaultTableModel = (DefaultTableModel)salesTable.getModel();
        defaultTableModel.setRowCount(0);  
        if (null != supplier.getProductCatalog()){
           int totalSalesValue = 0;
           int productSalesValue = 0;
           for (Product product : supplier.getProductCatalog().getProductList()){
               Object[] rows =  new Object[4];
               productSalesValue = product.getPrice()*(product.getInitialQuantity() - product.getAvailable());
               rows[0] = product;
               rows[1] = product.getInitialQuantity() - product.getAvailable();
               rows[2] = product.getPrice();
               rows[3] = productSalesValue;
               totalSalesValue = totalSalesValue + productSalesValue;
               defaultTableModel.addRow(rows);
            }
            totalSaleTextField.setText(String.valueOf(totalSalesValue));
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        salesTable = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        showTopProductButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        totalSaleTextField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        maximumSoldTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        maximumSaleValueTextField = new javax.swing.JTextField();

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setText("Sales Review & Product Performance");

        salesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Product Name", "Quantity Sold", "Quantity per Price", "Sale Value"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(salesTable);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setForeground(new java.awt.Color(102, 102, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        showTopProductButton.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        showTopProductButton.setText("Show Top Selling Product");
        showTopProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showTopProductButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel2.setText("Total Sale :");

        totalSaleTextField.setEditable(false);

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButton1.setText("<< Back ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel3.setText("Maximum Sold Product");

        maximumSoldTextField.setEditable(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel4.setText("Maximum Sale Value Product");

        maximumSaleValueTextField.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addGap(309, 309, 309)
                        .addComponent(jLabel4)
                        .addGap(33, 33, 33)
                        .addComponent(maximumSaleValueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(showTopProductButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(maximumSoldTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalSaleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showTopProductButton)
                    .addComponent(jLabel2)
                    .addComponent(totalSaleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(maximumSoldTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 347, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(maximumSaleValueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void showTopProductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showTopProductButtonActionPerformed
        // TODO add your handling code here:
        DefaultCategoryDataset barchartDataset =  new DefaultCategoryDataset();
        if (null != supplier.getProductCatalog()){
           int productSalesValue = 0;
           for (Product product : supplier.getProductCatalog().getProductList()){
               productSalesValue = product.getPrice()*(product.getInitialQuantity() - product.getAvailable());
               barchartDataset.setValue(productSalesValue, "SALES VALUE",product.getProdName());
            }            
            JFreeChart barChartData = ChartFactory.createBarChart("PRODUCT SALES VALUE", "PRODUCT NAME", "SALE AMOUNT", barchartDataset, PlotOrientation.VERTICAL, true, true, true);
            CategoryPlot barchart =  barChartData.getCategoryPlot();
            barchart.setRangeGridlinePaint(Color.ORANGE);
            ChartPanel barPanel = new ChartPanel(barChartData);
            jPanel1.removeAll();
            jPanel1.add(barPanel);
        }
        
    }//GEN-LAST:event_showTopProductButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout cardLayout = (CardLayout)userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField maximumSaleValueTextField;
    private javax.swing.JTextField maximumSoldTextField;
    private javax.swing.JTable salesTable;
    private javax.swing.JButton showTopProductButton;
    private javax.swing.JTextField totalSaleTextField;
    // End of variables declaration//GEN-END:variables
}
