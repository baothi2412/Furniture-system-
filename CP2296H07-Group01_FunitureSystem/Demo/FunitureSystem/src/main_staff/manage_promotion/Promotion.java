/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main_staff.manage_promotion;

import java.sql.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import main_staff.Main_Staff;
import funiture_system.MyConnection;

/**
 *
 * @author BAOTHI
 */
public class Promotion extends javax.swing.JFrame {

    final String header[] = {"Promotion_ID", "PromotionName", "PromotionType", "Promotion_Detail_ID", "Promotion_ID", "StartDay", "EndDay", "Status"};
    final DefaultTableModel tb = new DefaultTableModel(header, 0);
    Connection conn = MyConnection.getConnection();

    /**
     * Creates new form Promotion
     */
    public Promotion() {
        initComponents();
        loadBang();
        setLocationRelativeTo(null);

    }

    public void loadBang() {
        try {
            conn = MyConnection.getConnection();
            int number;
            Vector row;
            String sql = " SELECT *FROM Promotion JOIN Promotion_Detail ON Promotion.Promotion_ID = Promotion_Detail.Promotion_ID";
                 
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            ResultSetMetaData metadata = rs.getMetaData();
            number = metadata.getColumnCount();
            tb.setRowCount(0);
            while (rs.next()) {
                row = new Vector();
                for (int i = 1; i <= number; i++) {
                    row.addElement(rs.getString(i));
                }
                tb.addRow(row);
                dgvPromotion.setModel(tb);
            }
            st.close();
            rs.close();
            conn.close();
        } catch (Exception e) {
        }
        dgvPromotion.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (dgvPromotion.getSelectedRow() >= 0) {
                    txtID.setText(dgvPromotion.getValueAt(dgvPromotion.getSelectedRow(), 0) + "");
                    txtName.setText(dgvPromotion.getValueAt(dgvPromotion.getSelectedRow(), 1) + "");
                    cboType.setSelectedItem(dgvPromotion.getValueAt(dgvPromotion.getSelectedRow(), 2) + "");
                    txtStart.setText(dgvPromotion.getValueAt(dgvPromotion.getSelectedRow(), 5) + "");
                    txtEnd.setText(dgvPromotion.getValueAt(dgvPromotion.getSelectedRow(), 6) + "");
                    txtStatus.setText(dgvPromotion.getValueAt(dgvPromotion.getSelectedRow(), 7) + "");
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnHome = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dgvPromotion = new javax.swing.JTable();
        Add = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        cboType = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtStart = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEnd = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/funiture_system/img/home.png"))); // NOI18N
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N
        jLabel1.setText("Promotion");

        jLabel2.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel2.setText("ID:");

        jLabel3.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel3.setText("Promotion Name:");

        txtID.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N

        txtName.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel4.setText("Type:");

        dgvPromotion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(dgvPromotion);

        Add.setBackground(new java.awt.Color(0, 255, 255));
        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        Delete.setBackground(new java.awt.Color(0, 255, 255));
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        Update.setBackground(new java.awt.Color(0, 255, 255));
        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        Reset.setBackground(new java.awt.Color(255, 0, 0));
        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        cboType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Giam 50%", "Giam 100%", "Giam 25%" }));

        jLabel5.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel5.setText("StartDay:");

        txtStart.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        txtStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStartActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel6.setText("EndDay:");

        txtEnd.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel7.setText("Status:");

        txtStatus.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 70, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtStart, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel7)
                .addGap(24, 24, 24)
                .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(321, 321, 321)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtName)
                            .addComponent(txtID)
                            .addComponent(cboType, 0, 466, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(Add)
                        .addGap(81, 81, 81)
                        .addComponent(Delete)
                        .addGap(112, 112, 112)
                        .addComponent(Update)
                        .addGap(111, 111, 111)
                        .addComponent(Reset))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cboType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtStart, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Add)
                    .addComponent(Delete)
                    .addComponent(Update)
                    .addComponent(Reset))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
//       
       conn = MyConnection.getConnection();
try {
    if (txtID.getText().equals("") || txtName.getText().equals("") || txtStart.getText().equals("") || txtEnd.getText().equals("") || txtStatus.getText().equals("")) {
        JOptionPane.showMessageDialog(this, "Bạn cần nhập đủ dữ liệu");
    } else {
        int index = cboType.getSelectedIndex(); // Lấy chỉ số của mục được chọn trong combobox
        String sql = "INSERT INTO Promotion VALUES ('" + txtID.getText() + "','" + txtName.getText() + "','" + cboType.getItemAt(index) + "')";
        String sql1 = "INSERT INTO Promotion_Detail VALUES ('" + txtID.getText() + "','" + txtID.getText() + "','" + txtStart.getText() + "','" + txtEnd.getText() + "','" + txtStatus.getText() + "')";
        Statement st = conn.createStatement();
        int kq = st.executeUpdate(sql);
        int kq1 = st.executeUpdate(sql1);
        if (kq > 0 || kq1 > 0) {
            JOptionPane.showMessageDialog(this, "Thêm mới thành công");
            loadBang();
        } else {
            JOptionPane.showMessageDialog(this, "Thêm mới không thành công");
        }
        st.close();
    }
    conn.close();
} catch (SQLException e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi khi thực hiện thao tác trên cơ sở dữ liệu");
}



    }//GEN-LAST:event_AddActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        txtID.setText("");
        txtName.setText("");
        cboType.setSelectedItem("Giam 50%");
        txtStart.setText("");
        txtEnd.setText("");
        txtStatus.setText("");
        loadBang();
        txtID.setEnabled(true);
    }//GEN-LAST:event_ResetActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        conn = MyConnection.getConnection();
        try {
            if (txtID.getText().equals("") || txtName.getText().equals("") || txtStart.getText().equals("") || txtEnd.getText().equals("") || txtStatus.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Bạn cần nhập đủ dữ liệu");
            } else {
                Statement st = conn.createStatement();
                int index = cboType.getSelectedIndex(); // Lấy chỉ số của mục được chọn trong combobox
                String sql = "UPDATE Promotion SET Promotion_Name='" + txtName.getText() + "', Promotion_Type='" + cboType.getItemAt(index) + "' WHERE Promotion_ID='" + txtID.getText() + "'";
                String sql1 = "UPDATE Promotion_Detail SET Start_Day='" + txtStart.getText() + "', End_Day='" + txtEnd.getText() + "', Status='" + txtStatus.getText() + "' WHERE Promotion_ID='" + txtID.getText() + "'";

                int kq = st.executeUpdate(sql);
                int kq1 = st.executeUpdate(sql1);
                if (kq > 0 || kq1 > 0) {
                    JOptionPane.showMessageDialog(this, "Cập nhật thành công");
                    loadBang();
                }
                st.close();
            }
            conn.close();

        } catch (Exception e) {
            // Xử lý lỗi tại đây
            e.printStackTrace(); // In ra thông tin lỗi trong console
            JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi khi thực hiện thao tác trên cơ sở dữ liệu");
        }

    }//GEN-LAST:event_UpdateActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        conn = MyConnection.getConnection();
        try {
            String promotionDetailSql = "DELETE FROM Promotion_Detail WHERE Promotion_ID = ?";
            PreparedStatement stmt1 = conn.prepareStatement(promotionDetailSql);
            stmt1.setString(1, txtID.getText());
            stmt1.executeUpdate();

            String promotionSql = "DELETE FROM Promotion WHERE Promotion_ID = ?";
            PreparedStatement stmt = conn.prepareStatement(promotionSql);
            stmt.setString(1, txtID.getText());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(this, "Xóa thành công");
            loadBang();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }


    }//GEN-LAST:event_DeleteActionPerformed

    private void txtStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStartActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        Main_Staff main = new Main_Staff();
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
            java.util.logging.Logger.getLogger(Promotion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Promotion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Promotion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Promotion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Promotion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Reset;
    private javax.swing.JButton Update;
    private javax.swing.JButton btnHome;
    private javax.swing.JComboBox<String> cboType;
    private javax.swing.JTable dgvPromotion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtEnd;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtStart;
    private javax.swing.JTextField txtStatus;
    // End of variables declaration//GEN-END:variables
}
