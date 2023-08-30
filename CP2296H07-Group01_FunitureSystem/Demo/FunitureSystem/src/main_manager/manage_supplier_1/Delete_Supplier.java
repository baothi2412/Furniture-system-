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
public class Delete_Supplier extends javax.swing.JFrame {
    ManageSupplier mnSupp = new ManageSupplier_Process();
    /**
     * Creates new form Delete_Supplier1
     */
    public Delete_Supplier() {
        initComponents();
        setLocationRelativeTo(null);
        ManageSupplier mnSupp = new ManageSupplier_Process();
        List<Supplier> listSupp = mnSupp.viewSupplier();
        DefaultTableModel model = (DefaultTableModel)tbSupplier.getModel();
        for (Supplier s : listSupp) {
            model.addRow(new Object[]{s.getSuppID(), s.getSuppName(), s.getAddress(), s.getPhone()});
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

        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        btnDeleteAccept = new javax.swing.JButton();
        lbSupplier = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbSupplier = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(200, 100));
        setPreferredSize(new java.awt.Dimension(885, 540));
        setResizable(false);
        setSize(new java.awt.Dimension(885, 540));
        getContentPane().setLayout(null);

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
        btnHome.setBounds(16, 11, 42, 40);

        btnDeleteAccept.setBackground(new java.awt.Color(0, 238, 238));
        btnDeleteAccept.setText("Delete");
        btnDeleteAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteAcceptActionPerformed(evt);
            }
        });
        getContentPane().add(btnDeleteAccept);
        btnDeleteAccept.setBounds(290, 400, 72, 30);

        lbSupplier.setFont(new java.awt.Font("Candara", 0, 25)); // NOI18N
        lbSupplier.setText("Manage Supplier");
        getContentPane().add(lbSupplier);
        lbSupplier.setBounds(340, 20, 190, 32);

        tbSupplier.setAutoCreateRowSorter(true);
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
        tbSupplier.setFillsViewportHeight(true);
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
        jLabel2.setBounds(170, 370, 70, 16);

        btnCancel.setBackground(new java.awt.Color(255, 51, 51));
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel);
        btnCancel.setBounds(410, 400, 72, 30);

        btnSearch.setBackground(new java.awt.Color(0, 238, 238));
        btnSearch.setText("Search Supplier");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch);
        btnSearch.setBounds(620, 450, 130, 40);

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        getContentPane().add(txtID);
        txtID.setBounds(260, 360, 259, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void btnDeleteAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteAcceptActionPerformed
        String id = txtID.getText();
        boolean temp = true;
        if (id.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please choose a row to delete!");
        } else {
            for (char c : id.toCharArray()) {
                if (!Character.isDigit(c)) {
                    JOptionPane.showMessageDialog(this, "Supplier ID only accepts numbers, cannot contain characters!!","Error", JOptionPane.ERROR_MESSAGE);
                    temp = false;
                }
            }
            if (temp) {
                boolean checkID = mnSupp.checkID(id);
                if (checkID) {
                    JOptionPane.showMessageDialog(this, "Error! Supplier ID must exist in the table to delete.", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    mnSupp.deleteSupplier(id);
                    JOptionPane.showMessageDialog(this, "Delete Supplier Successfully!");
                    Delete_Supplier delete = new Delete_Supplier();
                    this.dispose();
                    delete.show();
                }
            }
        }
    }//GEN-LAST:event_btnDeleteAcceptActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        View_Supplier view = new View_Supplier();
        this.dispose();
        view.show();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

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

    private void tbSupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbSupplierMouseClicked
        DefaultTableModel model = (DefaultTableModel)tbSupplier.getModel();
        String tbID = model.getValueAt(tbSupplier.getSelectedRow(), 0).toString();
        txtID.setText(tbID);
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
            java.util.logging.Logger.getLogger(Delete_Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Delete_Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Delete_Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Delete_Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Delete_Supplier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDeleteAccept;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbSupplier;
    private javax.swing.JTable tbSupplier;
    private javax.swing.JTextField txtID;
    // End of variables declaration//GEN-END:variables
}