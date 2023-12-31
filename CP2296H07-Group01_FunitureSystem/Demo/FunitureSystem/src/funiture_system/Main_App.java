/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package funiture_system;

import javax.swing.UIManager;
import main_customer.login_customer.LoginCustomer;
import main_manager.LoginManager;
import main_staff.login_staff.LoginStaff;

/**
 *
 * @author Duy Nguyen
 */
public class Main_App extends javax.swing.JFrame {

    /**
     * Creates new form Main_App
     */
    public Main_App() {
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

        btnManager = new javax.swing.JToggleButton();
        btnStaff = new javax.swing.JToggleButton();
        btnCustomer = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 200));
        setPreferredSize(new java.awt.Dimension(500, 280));
        setResizable(false);
        setSize(new java.awt.Dimension(500, 280));
        getContentPane().setLayout(null);

        btnManager.setText("Manager");
        btnManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagerActionPerformed(evt);
            }
        });
        getContentPane().add(btnManager);
        btnManager.setBounds(70, 100, 110, 40);

        btnStaff.setText("Staff");
        btnStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStaffActionPerformed(evt);
            }
        });
        getContentPane().add(btnStaff);
        btnStaff.setBounds(200, 100, 110, 40);

        btnCustomer.setText("Customer");
        btnCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerActionPerformed(evt);
            }
        });
        getContentPane().add(btnCustomer);
        btnCustomer.setBounds(330, 100, 110, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagerActionPerformed
        LoginManager logM = new LoginManager();
        this.dispose();
        logM.show();
    }//GEN-LAST:event_btnManagerActionPerformed

    private void btnStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStaffActionPerformed
        LoginStaff logS = new LoginStaff();
        this.dispose();
        logS.show();
    }//GEN-LAST:event_btnStaffActionPerformed

    private void btnCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerActionPerformed
        LoginCustomer logC = new LoginCustomer();
        this.dispose();
        logC.show();
    }//GEN-LAST:event_btnCustomerActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnCustomer;
    private javax.swing.JToggleButton btnManager;
    private javax.swing.JToggleButton btnStaff;
    // End of variables declaration//GEN-END:variables
}
