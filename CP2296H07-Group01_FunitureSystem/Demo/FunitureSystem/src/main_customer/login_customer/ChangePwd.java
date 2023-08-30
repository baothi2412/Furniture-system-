package main_customer.login_customer;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import funiture_system.MyConnection;
public class ChangePwd extends javax.swing.JFrame {
    Connection conn = MyConnection.getConnection();
    Statement stm;
    ResultSet rs;
    public ChangePwd() {
        initComponents();
        setLocationRelativeTo(null);
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtuse = new javax.swing.JLabel();
        txtold = new javax.swing.JLabel();
        txtnewpass = new javax.swing.JLabel();
        txtcnfpass = new javax.swing.JLabel();
        usetxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        oldpassTxt = new javax.swing.JPasswordField();
        newpassTxt = new javax.swing.JPasswordField();
        cnpassTxt = new javax.swing.JPasswordField();
        lbluid = new javax.swing.JLabel();
        lbloldpass = new javax.swing.JLabel();
        lblcnfpass = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(450, 150));

        jLabel1.setFont(new java.awt.Font("Candara", 0, 25)); // NOI18N
        jLabel1.setText("Change Password");

        txtuse.setFont(new java.awt.Font("Candara", 0, 15)); // NOI18N
        txtuse.setText("User name:");

        txtold.setFont(new java.awt.Font("Candara", 0, 15)); // NOI18N
        txtold.setText("Old Pass:");

        txtnewpass.setFont(new java.awt.Font("Candara", 0, 15)); // NOI18N
        txtnewpass.setText("New Pass:");

        txtcnfpass.setFont(new java.awt.Font("Candara", 0, 15)); // NOI18N
        txtcnfpass.setText("Confirm Pass:");

        usetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usetxtActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 255, 255));
        jButton1.setFont(new java.awt.Font("Candara", 0, 15)); // NOI18N
        jButton1.setText("Change");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 51, 51));
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtuse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtold, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcnfpass, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtnewpass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usetxt)
                            .addComponent(oldpassTxt)
                            .addComponent(lbloldpass, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblcnfpass, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbluid, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newpassTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cnpassTxt))
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(65, 65, 65))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtuse)
                    .addComponent(usetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbluid)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtold)
                    .addComponent(oldpassTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbloldpass, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newpassTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnewpass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cnpassTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcnfpass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblcnfpass, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usetxtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String user = usetxt.getText();
        String oldP = oldpassTxt.getText();
        String newP = newpassTxt.getText();
        String cfP = cnpassTxt.getText();
        if (user.isEmpty() || oldP.isEmpty() || newP.isEmpty() || cfP.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter information to change password!");
        } else {
            try {
                String sql1 = "select * from Customer where Username = '"+user+"'";
                stm = conn.createStatement();
                rs = stm.executeQuery(sql1);
                while(rs.next()) {
                    if (!oldP.equals(rs.getString("Password"))) {
                        JOptionPane.showMessageDialog(this, "Password is not correct!");
                    } else if (!newP.equals(cfP)){
                        JOptionPane.showMessageDialog(this, "2 mat khau khong khop!");
                    } else {
                        String sql2 = "update Customer set Password = '"+newP+"' where Username = '"+user+"'";
                        stm.executeUpdate(sql2);
                        JOptionPane.showMessageDialog(this, "Change password successfully!");
                        this.dispose();
                        LoginCustomer login = new LoginCustomer();
                        login.show();
                    }
                }
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        LoginCustomer login = new LoginCustomer();
        this.dispose();
        login.show();
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePwd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField cnpassTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblcnfpass;
    private javax.swing.JLabel lbloldpass;
    private javax.swing.JLabel lbluid;
    private javax.swing.JPasswordField newpassTxt;
    private javax.swing.JPasswordField oldpassTxt;
    private javax.swing.JLabel txtcnfpass;
    private javax.swing.JLabel txtnewpass;
    private javax.swing.JLabel txtold;
    private javax.swing.JLabel txtuse;
    private javax.swing.JTextField usetxt;
    // End of variables declaration//GEN-END:variables
}
