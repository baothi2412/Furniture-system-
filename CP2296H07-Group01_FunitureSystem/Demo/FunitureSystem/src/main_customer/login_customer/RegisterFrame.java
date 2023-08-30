package main_customer.login_customer;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;
import funiture_system.MyConnection;

public class RegisterFrame extends javax.swing.JFrame {

    Connection conn = MyConnection.getConnection();
//static Connection con;
//static Statement stmt;
//static void connect()
//{
//    try{
//        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//        con=(Connection) DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=FunitureSystem;encrypt=true;trustServerCertificate=true;");
//        stmt=con.createStatement();
//    }catch (Exception e){
//        JOptionPane.showMessageDialog(null,e);
//    }
//}

    public RegisterFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }
    Statement st;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        useTxt = new javax.swing.JTextField();
        emailTxt = new javax.swing.JTextField();
        registerBtn = new javax.swing.JButton();
        loginBtn = new javax.swing.JButton();
        pwdTxt = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        fullTxt = new javax.swing.JTextField();
        addressTxt = new javax.swing.JTextField();
        phoneTxt = new javax.swing.JTextField();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 150));

        jLabel1.setFont(new java.awt.Font("Candara", 0, 25)); // NOI18N
        jLabel1.setText("REGISTER SCREEN");

        jLabel2.setFont(new java.awt.Font("Candara", 0, 15)); // NOI18N
        jLabel2.setText("Email:");

        jLabel3.setFont(new java.awt.Font("Candara", 0, 15)); // NOI18N
        jLabel3.setText("User Name:");

        jLabel4.setFont(new java.awt.Font("Candara", 0, 15)); // NOI18N
        jLabel4.setText("Password:");

        useTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useTxtActionPerformed(evt);
            }
        });

        registerBtn.setBackground(new java.awt.Color(0, 255, 255));
        registerBtn.setFont(new java.awt.Font("Candara", 0, 15)); // NOI18N
        registerBtn.setText("Register");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        loginBtn.setBackground(new java.awt.Color(0, 255, 255));
        loginBtn.setFont(new java.awt.Font("Candara", 0, 15)); // NOI18N
        loginBtn.setText("Open Login Screen");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Candara", 0, 15)); // NOI18N
        jLabel6.setText("Phone:");

        jLabel7.setFont(new java.awt.Font("Candara", 0, 15)); // NOI18N
        jLabel7.setText("Address:");

        jLabel8.setFont(new java.awt.Font("Candara", 0, 15)); // NOI18N
        jLabel8.setText("Full name:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel7)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pwdTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                            .addComponent(useTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                            .addComponent(emailTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                            .addComponent(fullTxt)
                            .addComponent(addressTxt)
                            .addComponent(phoneTxt)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(registerBtn)
                        .addGap(90, 90, 90)
                        .addComponent(loginBtn)))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(fullTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(addressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(phoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(useTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pwdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerBtn)
                    .addComponent(loginBtn))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void useTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_useTxtActionPerformed

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        String full, add, phone, email, use, pass;
        full = fullTxt.getText();
        add = addressTxt.getText();
        phone = phoneTxt.getText();
        email = emailTxt.getText();
        use = useTxt.getText();
        pass = pwdTxt.getText();
        if (fullTxt.getText().isEmpty() || addressTxt.getText().isEmpty() || phoneTxt.getText().isEmpty() || emailTxt.getText().isEmpty() || useTxt.getText().isEmpty() || pwdTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không để trống thông tin ");
            return;
        } else {
            for (char c : phone.toCharArray()) {
                if (!Character.isDigit(c)) {
                    JOptionPane.showMessageDialog(this, "Điện thoại phải là số, không được chứa chữ cái ");
                    return;
                }
            }
            String sql = "insert into Customer values('" + full + "','" + add + "','" + phone + "','" + email + "','" + use + "','" + pass + "')";
            try {
                st = conn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(rootPane, "SignUp successful");
                LoginCustomer login = new LoginCustomer();
                this.dispose();
                login.show();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
//        int dk = JOptionPane.showConfirmDialog(this, "Bạn có muốn đăng kí", "Confirm", JOptionPane.YES_NO_CANCEL_OPTION);
//        if (dk != JOptionPane.YES_OPTION) {
//         
//        
//        try {
//            Class.forName(driver);
//            Connection con = DriverManager.getConnection(url, user, pwd);
//
//
//            String sql = "INSERT INTO Customer VALUES (?, ?, ?, ?, ?, ?)";
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setString(1, fullTxt.getText());
//            ps.setString(2, addressTxt.getText());
//            ps.setString(3, phoneTxt.getText()); // đổi kiểu dữ liệu varchar
//            ps.setString(4, emailTxt.getText());
//            ps.setString(5, useTxt.getText());
//            ps.setString(6, pwdTxt.getText());
//
//            int n = ps.executeUpdate();
//            if (n != 0) {
//                JOptionPane.showMessageDialog(this, "Đăng kí thành công ");
//            } else {
//                JOptionPane.showMessageDialog(this, "Đăng kí thất bại ");
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        }
//        int dk = JOptionPane.showConfirmDialog(this, "bạn có muốn đăng kí", "Password", JOptionPane.YES_NO_CANCEL_OPTION);
//        if (dk != JOptionPane.YES_OPTION) {
//            return;
//        }
//        try {
//            Class.forName(driver);
//            Connection con=DriverManager.getConnection(url, user, pwd);
//            String sql = "insert into Customer values (?,?,?,?,?,?)";
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setString(1, fullTxt.getText());
//            ps.setString(2, addressTxt.getText());
//            ps.setString(3, phoneTxt.getText());
//            ps.setString(4, emailTxt.getText());
//            ps.setString(5, useTxt.getText());
//            ps.setString(6, pwdTxt.getText());
//           
//            int n = ps.executeUpdate();
//            if (fullTxt.getText().equals("") | addressTxt.getText().equals("") | phoneTxt.getText().equals("") | emailTxt.getText().equals("") | useTxt.getText().equals("") | pwdTxt.getText().equals("")) {
//                JOptionPane.showMessageDialog(this, "Không để trống thông tin ");
//
//            } else if (n!=0) {
//                JOptionPane.showMessageDialog(this, "đăng kí thành công ");
//            } else {
//                JOptionPane.showMessageDialog(this, "đăng kí thất bại ");
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//            String full,add,phone,email,use,pass;
//            full=fullTxt.getText();
//            add=addressTxt.getText();
//            phone=phoneTxt.getText();
//            email=emailTxt.getText();
//            use=useTxt.getText();
//            pass=pwdTxt.getText();
//            String sql="insert into Customer values('"+full+"','"+add+"' ,'"+phone+"','"+email+"','"+use+"','"+pass+"')";
//            try {
//                stmt.executeUpdate(sql);
//                JOptionPane.showConfirmDialog(rootPane,"SignUp Successful :");
//            }catch (Exception e) {
//                JOptionPane.showConfirmDialog(rootPane,e);
//            }
    }//GEN-LAST:event_registerBtnActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        LoginCustomer login = new LoginCustomer();
        this.dispose();
        login.show();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }//GEN-LAST:event_loginBtnActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTxt;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JTextField fullTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton loginBtn;
    private javax.swing.JTextField phoneTxt;
    private javax.swing.JPasswordField pwdTxt;
    private javax.swing.JButton registerBtn;
    private javax.swing.JTextField useTxt;
    // End of variables declaration//GEN-END:variables
}
