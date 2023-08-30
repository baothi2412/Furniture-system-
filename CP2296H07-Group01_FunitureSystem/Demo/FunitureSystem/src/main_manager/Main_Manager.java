package main_manager;

import funiture_system.Main_App;
import main_manager.import_statistics.Import_Statistic;
import main_manager.manage_import_products_1.View_Import_Products;
import main_manager.manage_staff_2.StaffFrame;
import main_manager.manage_supplier_1.View_Supplier;
import main_manager.manage_warehouse_1.View_Warehouse;
import main_manager.view_product.Productmange;

/**
 *
 * @author Duy Nguyen
 */
public class Main_Manager extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public Main_Manager() {
        initComponents();
        setLocationRelativeTo(null);
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
        btnSupplier = new javax.swing.JButton();
        btnWarehouse = new javax.swing.JButton();
        btnImport = new javax.swing.JButton();
        btnStaff = new javax.swing.JToggleButton();
        btnApp = new javax.swing.JButton();
        btnProduct = new javax.swing.JButton();
        btnBarChart = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(250, 150));
        setResizable(false);
        setSize(new java.awt.Dimension(770, 440));
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Manager");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(310, 60, 151, 48);

        btnSupplier.setBackground(new java.awt.Color(0, 238, 238));
        btnSupplier.setText("Manage Supplier");
        btnSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupplierActionPerformed(evt);
            }
        });
        getContentPane().add(btnSupplier);
        btnSupplier.setBounds(510, 210, 140, 41);

        btnWarehouse.setBackground(new java.awt.Color(0, 238, 238));
        btnWarehouse.setText("Manage Warehouse");
        btnWarehouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWarehouseActionPerformed(evt);
            }
        });
        getContentPane().add(btnWarehouse);
        btnWarehouse.setBounds(307, 211, 140, 39);

        btnImport.setBackground(new java.awt.Color(0, 238, 238));
        btnImport.setText("Manage Import");
        btnImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportActionPerformed(evt);
            }
        });
        getContentPane().add(btnImport);
        btnImport.setBounds(110, 280, 140, 39);

        btnStaff.setBackground(new java.awt.Color(0, 238, 238));
        btnStaff.setText("Manage Staff");
        btnStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStaffActionPerformed(evt);
            }
        });
        getContentPane().add(btnStaff);
        btnStaff.setBounds(310, 280, 140, 40);

        btnApp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/funiture_system/img/account.jpg"))); // NOI18N
        btnApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAppActionPerformed(evt);
            }
        });
        getContentPane().add(btnApp);
        btnApp.setBounds(670, 30, 40, 40);

        btnProduct.setBackground(new java.awt.Color(0, 238, 238));
        btnProduct.setText("View Product");
        btnProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductActionPerformed(evt);
            }
        });
        getContentPane().add(btnProduct);
        btnProduct.setBounds(110, 210, 140, 40);

        btnBarChart.setBackground(new java.awt.Color(0, 238, 238));
        btnBarChart.setText("Import Statistics");
        btnBarChart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBarChartActionPerformed(evt);
            }
        });
        getContentPane().add(btnBarChart);
        btnBarChart.setBounds(510, 280, 140, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupplierActionPerformed
        View_Supplier viewSupp = new View_Supplier();
        this.dispose();
        viewSupp.show();
    }//GEN-LAST:event_btnSupplierActionPerformed

    private void btnWarehouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWarehouseActionPerformed
        View_Warehouse viewWare = new View_Warehouse();
        this.dispose();
        viewWare.show();
    }//GEN-LAST:event_btnWarehouseActionPerformed

    private void btnImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportActionPerformed
        View_Import_Products viewImport = new View_Import_Products();
        this.hide();
        viewImport.show();
    }//GEN-LAST:event_btnImportActionPerformed

    private void btnStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStaffActionPerformed
        StaffFrame staff = new StaffFrame();
        this.dispose();
        staff.show();
    }//GEN-LAST:event_btnStaffActionPerformed

    private void btnAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAppActionPerformed
        Main_App app = new Main_App();
        this.dispose();
        app.show();
    }//GEN-LAST:event_btnAppActionPerformed

    private void btnProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductActionPerformed
        Productmange pro = new Productmange();
        this.dispose();
        pro.show();
    }//GEN-LAST:event_btnProductActionPerformed

    private void btnBarChartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBarChartActionPerformed
        Import_Statistic chart = new Import_Statistic();
        chart.show();
    }//GEN-LAST:event_btnBarChartActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main_Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Manager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApp;
    private javax.swing.JButton btnBarChart;
    private javax.swing.JButton btnImport;
    private javax.swing.JButton btnProduct;
    private javax.swing.JToggleButton btnStaff;
    private javax.swing.JButton btnSupplier;
    private javax.swing.JButton btnWarehouse;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}