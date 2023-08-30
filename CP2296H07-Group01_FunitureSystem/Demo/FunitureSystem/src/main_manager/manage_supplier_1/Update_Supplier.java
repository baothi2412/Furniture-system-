/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main_manager.manage_supplier_1;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import main_manager.Main_Manager;

/**
 *
 * @author Duy Nguyen
 */
public class Update_Supplier extends javax.swing.JFrame {
    ManageSupplier mnSupp = new ManageSupplier_Process();
    /**
     * Creates new form Edit_Supplier1
     */
    public Update_Supplier() {
        initComponents();
        setLocationRelativeTo(null);
        ManageSupplier mnSupp = new ManageSupplier_Process();
        List<Supplier> listSupp = mnSupp.viewSupplier();
        DefaultTableModel model = (DefaultTableModel)tbSupplier.getModel();
        for (Supplier s : listSupp) {
            model.addRow(new Object[]{s.getSuppID(), s.getSuppName(), s.getAddress(), s.getPhone()});
        }
        txtID.setEditable(false);
        txtName.setEditable(false);
        txtAddress.setEditable(false);
        txtPhone.setEditable(false);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tbSupplier = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(200, 100));
        setPreferredSize(new java.awt.Dimension(885, 540));
        setResizable(false);
        setSize(new java.awt.Dimension(885, 540));
        getContentPane().setLayout(null);

        lbSupplier.setFont(new java.awt.Font("Candara", 0, 25)); // NOI18N
        lbSupplier.setText("Manage Supplier");
        getContentPane().add(lbSupplier);
        lbSupplier.setBounds(340, 20, 190, 32);

        tbSupplier.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        tbSupplier.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Supplier ID", "Supplier Name", "Address", "Phone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbSupplier.setDragEnabled(true);
        tbSupplier.setFillsViewportHeight(true);
        tbSupplier.setFocusCycleRoot(true);
        tbSupplier.setInheritsPopupMenu(true);
        tbSupplier.setPreferredSize(new java.awt.Dimension(300, 600));
        tbSupplier.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        tbSupplier.setShowGrid(true);
        tbSupplier.setSurrendersFocusOnKeystroke(true);
        tbSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbSupplierMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbSupplier);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(70, 70, 730, 215);

        jLabel2.setText("Supplier ID:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(150, 310, 70, 16);

        jLabel3.setText("Supplier Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(150, 350, 90, 16);

        jLabel4.setText("Address:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(150, 390, 50, 16);

        jLabel6.setText("Phone:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(150, 430, 49, 16);

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        getContentPane().add(txtID);
        txtID.setBounds(250, 302, 259, 30);
        getContentPane().add(txtName);
        txtName.setBounds(250, 340, 259, 30);

        txtPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneActionPerformed(evt);
            }
        });
        getContentPane().add(txtPhone);
        txtPhone.setBounds(250, 422, 260, 30);
        getContentPane().add(txtAddress);
        txtAddress.setBounds(250, 382, 260, 30);

        btnAdd.setBackground(new java.awt.Color(0, 238, 238));
        btnAdd.setText("Add Supplier");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd);
        btnAdd.setBounds(620, 300, 130, 40);

        btnEdit.setBackground(new java.awt.Color(0, 238, 238));
        btnEdit.setText("Update Supplier");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        getContentPane().add(btnEdit);
        btnEdit.setBounds(620, 350, 130, 40);

        btnDelete.setBackground(new java.awt.Color(0, 238, 238));
        btnDelete.setText("Delete Supplier");
        btnDelete.setRequestFocusEnabled(false);
        btnDelete.setRolloverEnabled(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(620, 400, 130, 40);

        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/funiture_system/img/home.png"))); // NOI18N
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        getContentPane().add(btnHome);
        btnHome.setBounds(20, 20, 42, 40);

        btnSave.setBackground(new java.awt.Color(0, 238, 238));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave);
        btnSave.setBounds(290, 460, 72, 30);

        btnCancel.setBackground(new java.awt.Color(255, 51, 51));
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel);
        btnCancel.setBounds(400, 460, 72, 30);

        btnSearch.setBackground(new java.awt.Color(0, 238, 238));
        btnSearch.setText("Search Supplier");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch);
        btnSearch.setBounds(620, 450, 130, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        this.hide();
        Add_Supplier addSupp = new Add_Supplier();
        addSupp.show();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        this.hide();
        Delete_Supplier deleteSupp = new Delete_Supplier();
        deleteSupp.show();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String id = txtID.getText();
        String name = txtName.getText();
        String address = txtAddress.getText();
        String phone = txtPhone.getText();
        if (id.isEmpty() || name.isEmpty() || address.isEmpty() || phone.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please choose a row to update supplier!!");
        } else {
            //Check ID
            boolean temp = true;
            for (char c : id.toCharArray()) {
                if (!Character.isDigit(c)) {
                    JOptionPane.showMessageDialog(this, "Supplier ID only accepts numbers, cannot contain characters!!","Error", JOptionPane.ERROR_MESSAGE);
                    temp = false;
                    break;
                }
            }
            
            for (char c : phone.toCharArray()) {
                if (!Character.isDigit(c)) {
                    JOptionPane.showMessageDialog(this, "Phone only accepts numbers, cannot contain characters!!","Error", JOptionPane.ERROR_MESSAGE);
                    temp = false;
                    break;
                }
            }
               
            if (temp) {
                boolean checkID = mnSupp.checkID(id);
                if (checkID) {
                    JOptionPane.showMessageDialog(this, "Error! Supplier ID must exist in the table to update.","Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    mnSupp.updateSupplier(id, name, address, phone);
                    JOptionPane.showMessageDialog(this, "Update Supplier Successfully!");
                    Update_Supplier update = new Update_Supplier();
                    this.dispose();
                    update.show();
                }
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        this.hide();
        Update_Supplier updateSupp = new Update_Supplier();
        updateSupp.show();
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        this.hide();
        Search_Supplier searchSupp = new Search_Supplier();
        searchSupp.show();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        View_Supplier view = new View_Supplier();
        this.dispose();
        view.show();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void tbSupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbSupplierMouseClicked
        DefaultTableModel model = (DefaultTableModel)tbSupplier.getModel();
        String suppID = model.getValueAt(tbSupplier.getSelectedRow(), 0).toString();
        String suppName = model.getValueAt(tbSupplier.getSelectedRow(), 1).toString();
        String address = model.getValueAt(tbSupplier.getSelectedRow(), 2).toString();
        String phone = model.getValueAt(tbSupplier.getSelectedRow(), 3).toString();
        txtID.setText(suppID);
        txtName.setText(suppName);
        txtAddress.setText(address);
        txtPhone.setText(phone);
         
        //Enable to edit after selected a row
        txtName.setEditable(true);
        txtAddress.setEditable(true);
        txtPhone.setEditable(true);
        
    }//GEN-LAST:event_tbSupplierMouseClicked

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
            java.util.logging.Logger.getLogger(Update_Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update_Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update_Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update_Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update_Supplier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbSupplier;
    private javax.swing.JTable tbSupplier;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
