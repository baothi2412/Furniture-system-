/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main_manager.manage_import_products_1;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import main_manager.Main_Manager;

/**
 *
 * @author Duy Nguyen
 */
public class Add_Import_Products extends javax.swing.JFrame {
    Manage_Import_Products mnIP = new Manage_Import_Products_Process();
    /**
     * Creates new form Add_Import_Products
     */
    public Add_Import_Products() {
        initComponents();
        setLocationRelativeTo(null);
        List<Import_Products> list = mnIP.view();
        DefaultTableModel model = (DefaultTableModel)tbImport.getModel();
        for (Import_Products ip : list) {
            model.addRow(new Object[]{ip.getId(), ip.getProName(), ip.getQuantity(), ip.getSuppID(), ip.getWareID(), ip.getDate()});
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

        lbSupplier = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtIpDay = new javax.swing.JTextField();
        txtQuan = new javax.swing.JTextField();
        txtWareID = new javax.swing.JTextField();
        txtSuppID = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbImport = new javax.swing.JTable();
        txtName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(200, 100));
        setPreferredSize(new java.awt.Dimension(885, 570));
        setResizable(false);
        setSize(new java.awt.Dimension(885, 570));
        getContentPane().setLayout(null);

        lbSupplier.setFont(new java.awt.Font("Candara", 0, 25)); // NOI18N
        lbSupplier.setText("Manage Import Products");
        getContentPane().add(lbSupplier);
        lbSupplier.setBounds(290, 20, 280, 32);

        jLabel3.setText("Import ID");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(110, 260, 130, 16);

        jLabel4.setText("Quantity:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(110, 340, 50, 16);

        jLabel6.setText("Import Day:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(110, 460, 90, 16);

        txtIpDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIpDayActionPerformed(evt);
            }
        });
        getContentPane().add(txtIpDay);
        txtIpDay.setBounds(250, 450, 259, 30);
        getContentPane().add(txtQuan);
        txtQuan.setBounds(250, 330, 259, 30);

        txtWareID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWareIDActionPerformed(evt);
            }
        });
        getContentPane().add(txtWareID);
        txtWareID.setBounds(250, 410, 260, 30);
        getContentPane().add(txtSuppID);
        txtSuppID.setBounds(250, 370, 260, 30);

        btnAdd.setBackground(new java.awt.Color(0, 238, 238));
        btnAdd.setText("Add Import");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd);
        btnAdd.setBounds(620, 260, 130, 40);

        btnUpdate.setBackground(new java.awt.Color(0, 238, 238));
        btnUpdate.setText("Update Import");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(620, 320, 130, 40);

        btnDelete.setBackground(new java.awt.Color(0, 238, 238));
        btnDelete.setText("Delete Import");
        btnDelete.setRequestFocusEnabled(false);
        btnDelete.setRolloverEnabled(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(620, 380, 130, 40);

        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/funiture_system/img/home.png"))); // NOI18N
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        getContentPane().add(btnHome);
        btnHome.setBounds(20, 20, 40, 40);

        btnSave.setBackground(new java.awt.Color(0, 238, 238));
        btnSave.setText("Add");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave);
        btnSave.setBounds(290, 490, 72, 30);

        btnCancel.setBackground(new java.awt.Color(255, 51, 51));
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel);
        btnCancel.setBounds(400, 490, 72, 30);

        btnSearch.setBackground(new java.awt.Color(0, 238, 238));
        btnSearch.setText("Search Import");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch);
        btnSearch.setBounds(620, 440, 130, 40);

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        getContentPane().add(txtID);
        txtID.setBounds(250, 250, 259, 30);

        jLabel7.setText("Supplier ID:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(110, 380, 70, 16);

        jLabel8.setText("Warehouse ID:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(110, 420, 90, 16);

        tbImport.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Import ID", "Import Product Name", "Quantity", "Supplier ID", "Warehouse ID", "Import Day"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbImport.setPreferredSize(new java.awt.Dimension(450, 600));
        tbImport.setShowGrid(true);
        tbImport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbImportMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbImport);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(80, 60, 730, 170);

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtName);
        txtName.setBounds(250, 290, 259, 30);

        jLabel5.setText("Import Product Name:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(110, 300, 130, 16);
    }// </editor-fold>//GEN-END:initComponents

    private void txtIpDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIpDayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIpDayActionPerformed

    private void txtWareIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWareIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWareIDActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        this.hide();
        Add_Import_Products addImport = new Add_Import_Products();
        addImport.show();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        this.hide();
        Update_Import_Products updateImport = new Update_Import_Products();
        updateImport.show();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        this.hide();
        Delete_Import_Products deleteImport = new Delete_Import_Products();
        deleteImport.show();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String id = txtID.getText();
        String name = txtName.getText();
        String quantity = txtQuan.getText();
        String suppID = txtSuppID.getText();
        String wareID = txtWareID.getText();
        String ipDay = txtIpDay.getText();
        
        if (id.isEmpty() || name.isEmpty() || quantity.isEmpty() || suppID.isEmpty() || wareID.isEmpty() || ipDay.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter full information to add import product!!");
        } else {
            boolean temp = true;
            for (char c : id.toCharArray()) {
                if (!Character.isDigit(c)) {
                    JOptionPane.showMessageDialog(this, "Import ID only accepts numbers, cannot contain characters!!","Error", JOptionPane.ERROR_MESSAGE);
                    temp = false;
                    break;
                }
            }
            
            for (char c : quantity.toCharArray()) {
                if (!Character.isDigit(c)) {
                    JOptionPane.showMessageDialog(this, "Quantity only accept numbers, cannot contain characters!!","Error", JOptionPane.ERROR_MESSAGE);
                    temp = false;
                    break;
                }
            }
            
            //Check Supplier ID
            for (char c : suppID.toCharArray()) {
                if (!Character.isDigit(c)) {
                    JOptionPane.showMessageDialog(this, "Supplier ID only accept numbers, cannot contain characters!!","Error", JOptionPane.ERROR_MESSAGE);
                    temp = false;
                    break;
                }
            }
            boolean checkSuppID = mnIP.checkSuppID(suppID);
            if (!checkSuppID) {
                JOptionPane.showMessageDialog(this, "Error! Supplier ID not found.", "Error", JOptionPane.ERROR_MESSAGE);
                temp = false;
            }
            
            //Check Warehouse ID
            for (char c : wareID.toCharArray()) {
                if (!Character.isDigit(c)) {
                    JOptionPane.showMessageDialog(this, "Warehouse ID only accept numbers, cannot contain characters!!","Error", JOptionPane.ERROR_MESSAGE);
                    temp = false;
                    break;
                }
            }
            boolean checkWareID = mnIP.checkWareID(wareID);
            if (!checkWareID) {
                JOptionPane.showMessageDialog(this, "Error! Warehouse ID not found.", "Error", JOptionPane.ERROR_MESSAGE);
                temp = false;
            }
            
            //Check import day
            Pattern pattern = Pattern.compile("(^(((0[1-9]|1[0-9]|2[0-8])[\\/](0[1-9]|1[012]))|((29|30|31)[\\/](0[13578]|1[02]))|((29|30)[\\/](0[4,6,9]|11)))[\\/](19|[2-9][0-9])\\d\\d$)|(^29[\\/]02[\\/](19|[2-9][0-9])(00|04|08|12|16|20|24|28|32|36|40|44|48|52|56|60|64|68|72|76|80|84|88|92|96)$)");
            Matcher matcher = pattern.matcher(ipDay);
            if (!matcher.matches()) {
                JOptionPane.showMessageDialog(this, "Import Day must match the format 'dd/MM/yyyy'","Error", JOptionPane.ERROR_MESSAGE);
                temp = false;
            }
            
            if (temp) {
                boolean check = mnIP.checkID(id);
                if (!check) {
                    JOptionPane.showMessageDialog(this, "Error! Import ID is duplicate.", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    mnIP.add(id, name, quantity, suppID, wareID, ipDay);
                    JOptionPane.showMessageDialog(this, "Add New Import Product Successfully!");
                    Add_Import_Products addImport = new Add_Import_Products();
                    this.dispose();
                    addImport.show();
                }
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        View_Import_Products view = new View_Import_Products();
        this.dispose();
        view.show();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        this.hide();
        Search_Import_Product searchImport = new Search_Import_Product();
        searchImport.show();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void tbImportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbImportMouseClicked

    }//GEN-LAST:event_tbImportMouseClicked

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        Main_Manager main = new Main_Manager();
        this.dispose();
        main.show();
    }//GEN-LAST:event_btnHomeActionPerformed

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
            java.util.logging.Logger.getLogger(Add_Import_Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Import_Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Import_Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Import_Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Import_Products().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbSupplier;
    private javax.swing.JTable tbImport;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtIpDay;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtQuan;
    private javax.swing.JTextField txtSuppID;
    private javax.swing.JTextField txtWareID;
    // End of variables declaration//GEN-END:variables
}