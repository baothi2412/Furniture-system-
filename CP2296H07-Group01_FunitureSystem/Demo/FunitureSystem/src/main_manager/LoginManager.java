/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main_manager;

import funiture_system.Main_App;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Hp
 */
public class LoginManager extends javax.swing.JFrame {
private JTextField codeField;
    private JButton loginButton;
    /**
     * Creates new form NewJFrame6
     */
    public LoginManager() {
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
        jLabel2 = new javax.swing.JLabel();
        txtLoginCode = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnApp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setLocation(new java.awt.Point(450, 250));
        setResizable(false);
        setSize(new java.awt.Dimension(445, 250));
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Candara", 0, 25)); // NOI18N
        jLabel1.setText("Login Manager");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(142, 19, 180, 32);

        jLabel2.setFont(new java.awt.Font("Candara", 0, 15)); // NOI18N
        jLabel2.setText("Login code:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(24, 90, 90, 19);
        getContentPane().add(txtLoginCode);
        txtLoginCode.setBounds(110, 80, 249, 30);

        jButton1.setBackground(new java.awt.Color(0, 238, 238));
        jButton1.setFont(new java.awt.Font("Candara", 0, 15)); // NOI18N
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(190, 140, 72, 26);

        btnApp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/funiture_system/img/account.jpg"))); // NOI18N
        btnApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAppActionPerformed(evt);
            }
        });
        getContentPane().add(btnApp);
        btnApp.setBounds(380, 10, 40, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         
        String defaultCode = "admin";
        if(defaultCode.equals(txtLoginCode.getText())){
            Main_Manager main = new Main_Manager();
            this.dispose();
            main.show();
        }else{
             JOptionPane.showMessageDialog(this, "Wrong password please check again");
        }
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAppActionPerformed
        Main_App app = new Main_App();
        this.dispose();
        app.show();
    }//GEN-LAST:event_btnAppActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
                new LoginManager().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApp;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtLoginCode;
    // End of variables declaration//GEN-END:variables
}