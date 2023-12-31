/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main_manager.manage_warehouse_1;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import main_manager.Main_Manager;

/**
 *
 * @author Duy Nguyen
 */
public class Update_Warehouse extends javax.swing.JFrame {
    ManageWarehouse mnWare = new ManageWarehouse_Process();
    /**
     * Creates new form Update_Staff
     */
    public Update_Warehouse() {
        initComponents();
        setLocationRelativeTo(null);
        List<Warehouse> listWare = mnWare.viewWarehouse();
        DefaultTableModel model = (DefaultTableModel)tbWarehouse.getModel();
        for (Warehouse w : listWare) {
            model.addRow(new Object[]{w.getId(), w.getName(), w.getAddress(), w.getNumPro()});
        }
        txtID.setEditable(false);
        txtName.setEditable(false);
        txtAddress.setEditable(false);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbWarehouse = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(200, 100));
        setPreferredSize(new java.awt.Dimension(885, 540));
        setResizable(false);
        setSize(new java.awt.Dimension(885, 540));
        getContentPane().setLayout(null);

        lbSupplier.setFont(new java.awt.Font("Candara", 0, 25)); // NOI18N
        lbSupplier.setText("Manage Warehouse");
        getContentPane().add(lbSupplier);
        lbSupplier.setBounds(310, 20, 230, 32);

        jLabel2.setText("Warehouse ID:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(140, 320, 90, 16);

        jLabel3.setText("Warehouse Name:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(140, 360, 110, 16);

        jLabel4.setText("Address:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(140, 400, 50, 16);

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        getContentPane().add(txtID);
        txtID.setBounds(250, 310, 259, 30);
        getContentPane().add(txtName);
        txtName.setBounds(250, 350, 259, 30);
        getContentPane().add(txtAddress);
        txtAddress.setBounds(250, 390, 260, 30);

        btnAdd.setBackground(new java.awt.Color(0, 238, 238));
        btnAdd.setText("Add Warehouse");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd);
        btnAdd.setBounds(620, 300, 140, 40);

        btnEdit.setBackground(new java.awt.Color(0, 238, 238));
        btnEdit.setText("Update Warehouse");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        getContentPane().add(btnEdit);
        btnEdit.setBounds(620, 360, 140, 40);

        btnDelete.setBackground(new java.awt.Color(0, 238, 238));
        btnDelete.setText("Delete Warehouse");
        btnDelete.setRequestFocusEnabled(false);
        btnDelete.setRolloverEnabled(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(620, 420, 140, 40);

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
        btnSave.setBounds(290, 430, 72, 30);

        btnCancel.setBackground(new java.awt.Color(255, 51, 51));
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel);
        btnCancel.setBounds(400, 430, 72, 30);

        tbWarehouse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Warehouse ID", "Warehouse Name", "Address", "Total Products"
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
        tbWarehouse.setPreferredSize(new java.awt.Dimension(300, 200));
        tbWarehouse.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        tbWarehouse.setShowGrid(true);
        tbWarehouse.setSurrendersFocusOnKeystroke(true);
        tbWarehouse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbWarehouseMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbWarehouse);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(100, 70, 660, 210);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        this.hide();
        Add_Warehouse addWare= new Add_Warehouse();
        addWare.show();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        this.hide();
        Update_Warehouse updateWare = new Update_Warehouse();
        updateWare.show();
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        this.hide();
        Delete_Warehouse deleteWare = new Delete_Warehouse();
        deleteWare.show();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        DefaultTableModel model = (DefaultTableModel)tbWarehouse.getModel();
        String id = txtID.getText();
        String name = txtName.getText();
        String address = txtAddress.getText();
        if (id.isEmpty() || name.isEmpty() || address.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please choose a row to update warehouse!!");
        } else {
            boolean temp = true;
            for (char c : id.toCharArray()) {
                if (!Character.isDigit(c)) {
                    JOptionPane.showMessageDialog(this, "Warehouse ID only accepts numbers, cannot contain characters!!","Error", JOptionPane.ERROR_MESSAGE);
                    temp = false;
                    break;
                }
            }

            if (temp) {
                boolean checkID = mnWare.checkID(id);
                if (checkID) {
                    JOptionPane.showMessageDialog(this, "Error! Warehouse ID must exist in the table to update.","Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    mnWare.updateWarehouse(id, name, address);
                    JOptionPane.showMessageDialog(this, "Update Warehouse Successfully!");
                    Update_Warehouse updateWare = new Update_Warehouse();
                    this.dispose();
                    updateWare.show();
                }
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        View_Warehouse view = new View_Warehouse();
        this.dispose();
        view.show();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void tbWarehouseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbWarehouseMouseClicked
        DefaultTableModel model = (DefaultTableModel)tbWarehouse.getModel();
        String id = model.getValueAt(tbWarehouse.getSelectedRow(), 0).toString();
        String name = model.getValueAt(tbWarehouse.getSelectedRow(), 1).toString();
        String address = model.getValueAt(tbWarehouse.getSelectedRow(), 2).toString();
        String total = model.getValueAt(tbWarehouse.getSelectedRow(), 3).toString();
        txtID.setText(id);
        txtName.setText(name);
        txtAddress.setText(address);
        
        //Enable to edit after selected a row
        txtName.setEditable(true);
        txtAddress.setEditable(true);
    }//GEN-LAST:event_tbWarehouseMouseClicked

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
            java.util.logging.Logger.getLogger(Update_Warehouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update_Warehouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update_Warehouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update_Warehouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update_Warehouse().setVisible(true);
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbSupplier;
    private javax.swing.JTable tbWarehouse;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
