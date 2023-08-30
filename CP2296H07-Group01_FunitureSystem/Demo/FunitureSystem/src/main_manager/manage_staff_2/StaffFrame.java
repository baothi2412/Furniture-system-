package main_manager.manage_staff_2;

import java.sql.*;

import java.sql.Connection;
import java.util.Random;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.LookAndFeel;
import javax.swing.RowFilter;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import main_manager.Main_Manager;
import funiture_system.MyConnection;


public class StaffFrame extends javax.swing.JFrame {

    private Connection connection;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;

    final String header[] = {"Staff_ID", "Staff_Name", "Address", "Phone", "Email", "Salary", "Username", "Password"};
    final DefaultTableModel tb = new DefaultTableModel(header, 0);
    Connection conn = MyConnection.getConnection();

    public StaffFrame() {
        initComponents();
        loadBang();
        setLocationRelativeTo(null);
    }

    public void loadBang() {
        try {
            conn = MyConnection.getConnection();
            int number;
            Vector row;
            String sql = "select * from Staff";
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
                staffTable.setModel(tb);
            }
            st.close();
            rs.close();
            conn.close();
        } catch (Exception e) {
            staffTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                public void valueChanged(ListSelectionEvent e) {
                    if (staffTable.getSelectedRow() >= 0) {
                        fullnameTxt.setText(staffTable.getValueAt(staffTable.getSelectedRow(), 1) + "");
                        addressTxt.setText(staffTable.getValueAt(staffTable.getSelectedRow(), 2) + "");
                        phoneTxt.setText(staffTable.getValueAt(staffTable.getSelectedRow(), 3) + "");
                        emailTxt.setText(staffTable.getValueAt(staffTable.getSelectedRow(), 4) + "");
                        salaryTxt.setText(staffTable.getValueAt(staffTable.getSelectedRow(), 5) + "");
                        useTxt.setText(staffTable.getValueAt(staffTable.getSelectedRow(), 6) + "");
                        pwdTxt.setText(staffTable.getValueAt(staffTable.getSelectedRow(), 7) + "");
                    }
                }
            });
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        delBtn = new javax.swing.JButton();
        fullnameTxt = new javax.swing.JTextField();
        addressTxt = new javax.swing.JTextField();
        phoneTxt = new javax.swing.JTextField();
        emailTxt = new javax.swing.JTextField();
        salaryTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        pwdTxt = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        useTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        searchTxt = new javax.swing.JTextField();
        updateBtn = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        staffTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Employee management", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Candara", 0, 25))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Candara", 0, 15)); // NOI18N
        jLabel1.setText("Staff_Name:");

        jLabel2.setFont(new java.awt.Font("Candara", 0, 15)); // NOI18N
        jLabel2.setText("Address:");

        jLabel3.setFont(new java.awt.Font("Candara", 0, 15)); // NOI18N
        jLabel3.setText("Phone:");

        jLabel4.setFont(new java.awt.Font("Candara", 0, 15)); // NOI18N
        jLabel4.setText("Email:");

        jLabel5.setFont(new java.awt.Font("Candara", 0, 15)); // NOI18N
        jLabel5.setText("Salary:");

        saveBtn.setBackground(new java.awt.Color(0, 255, 255));
        saveBtn.setFont(new java.awt.Font("Candara", 0, 15)); // NOI18N
        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        delBtn.setBackground(new java.awt.Color(0, 255, 255));
        delBtn.setFont(new java.awt.Font("Candara", 0, 15)); // NOI18N
        delBtn.setText("Delete");
        delBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delBtnActionPerformed(evt);
            }
        });

        fullnameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullnameTxtActionPerformed(evt);
            }
        });

        salaryTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salaryTxtActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Candara", 0, 15)); // NOI18N
        jLabel6.setText("Password:");

        btnCancel.setBackground(new java.awt.Color(255, 0, 0));
        btnCancel.setFont(new java.awt.Font("Candara", 0, 15)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Candara", 0, 15)); // NOI18N
        jLabel8.setText("Usename:");

        useTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useTxtActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Candara", 0, 15)); // NOI18N
        jLabel9.setText("Search:");

        searchTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTxtActionPerformed(evt);
            }
        });
        searchTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTxtKeyReleased(evt);
            }
        });

        updateBtn.setBackground(new java.awt.Color(0, 255, 255));
        updateBtn.setFont(new java.awt.Font("Candara", 0, 15)); // NOI18N
        updateBtn.setText("update");
        updateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateBtnMouseClicked(evt);
            }
        });
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(255, 51, 51));
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(84, 84, 84)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(jLabel8)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReset, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(pwdTxt)
                                    .addComponent(searchTxt)
                                    .addComponent(useTxt))
                                .addGap(35, 35, 35)
                                .addComponent(btnCancel))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(addressTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                                    .addComponent(fullnameTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(emailTxt)
                                    .addComponent(phoneTxt)
                                    .addComponent(salaryTxt))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(delBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                                        .addComponent(saveBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(updateBtn, javax.swing.GroupLayout.Alignment.TRAILING))))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(saveBtn)
                    .addComponent(fullnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(delBtn)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(addressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(updateBtn)
                    .addComponent(phoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(salaryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(useTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pwdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(5, 5, 5)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(btnCancel)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        staffTable.setModel(new javax.swing.table.DefaultTableModel(
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
        staffTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                staffTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(staffTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        
        conn = MyConnection.getConnection();
        try {
            
            String phone = phoneTxt.getText();
            for (char c : phone.toCharArray()) {
                if (!Character.isDigit(c)) {
                    JOptionPane.showMessageDialog(this, "Điện thoại phải là số, không được chứa chữ cái ");
                    return;
                }}
            if (fullnameTxt.getText().equals("") || addressTxt.getText().equals("") || phoneTxt.getText().equals("") || emailTxt.getText().equals("") || salaryTxt.getText().equals("") || useTxt.getText().equals("") || pwdTxt.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Bạn cần nhập đủ dữ liệu");
                return;
            } else {
                StringBuffer sb = new StringBuffer();
                String sql_check_pk = "select Staff_Name from Staff where Staff_Name ='" + fullnameTxt.getText() + "'";
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(sql_check_pk);
                if (rs.next()) {
                    sb.append("Tên này đã tồn tại");
                }
                if (sb.length() > 0) {
                    JOptionPane.showMessageDialog(this, sb.toString());
                } else {
                    Random  id = new Random();
                    String sql = "Insert into Staff values('" + fullnameTxt.getText() + "','" + addressTxt.getText() + "', '" + phoneTxt.getText() + "', '" + emailTxt.getText() + "','" + salaryTxt.getText() + "', '" + useTxt.getText() + "', '" + pwdTxt.getText() + "')";
           
                    st = conn.createStatement();
                    int kq = st.executeUpdate(sql);
                    if (kq > 0) {
                        JOptionPane.showMessageDialog(this, "Thêm mới thành công");
                        
                        loadBang();
                    }
                }
                st.close();
            conn.close();
            }
        } catch (Exception e) {
            e.printStackTrace(); // In ra thông tin lỗi trong console
            JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi khi thực hiện thao tác trên cơ sở dữ liệu");
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void fullnameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullnameTxtActionPerformed
        
    }//GEN-LAST:event_fullnameTxtActionPerformed

    private void delBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delBtnActionPerformed
        
        conn = MyConnection.getConnection();
        try {
            String sql = "Delete Staff where Staff_Name='" + fullnameTxt.getText() + "'";
            Statement st = conn.createStatement();
            int chk = JOptionPane.showConfirmDialog(this, "Bạn chắc chắn xóa chứ?", "Thông báo!", JOptionPane.YES_NO_OPTION);
            if (chk == JOptionPane.YES_OPTION) {
                st.executeUpdate(sql);
                loadBang();
                JOptionPane.showMessageDialog(this, "Xóa thành công");
            }

        } catch (Exception e) {

        }
    }//GEN-LAST:event_delBtnActionPerformed

    private void salaryTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salaryTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salaryTxtActionPerformed

    private void useTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_useTxtActionPerformed

    private void searchTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTxtActionPerformed

    private void staffTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_staffTableMouseClicked
        // TODO add your handling code here:
        int x = staffTable.getSelectedRow();
        if (staffTable.getSelectedRow() >= 0) {
            fullnameTxt.setText(staffTable.getValueAt(staffTable.getSelectedRow(), 1) + "");
            addressTxt.setText(staffTable.getValueAt(staffTable.getSelectedRow(), 2) + "");
            phoneTxt.setText(staffTable.getValueAt(staffTable.getSelectedRow(), 3) + "");
            emailTxt.setText(staffTable.getValueAt(staffTable.getSelectedRow(), 4) + "");
            salaryTxt.setText(staffTable.getValueAt(staffTable.getSelectedRow(), 5) + "");
            useTxt.setText(staffTable.getValueAt(staffTable.getSelectedRow(), 6) + "");
            pwdTxt.setText(staffTable.getValueAt(staffTable.getSelectedRow(), 7) + "");
        }
    }//GEN-LAST:event_staffTableMouseClicked

    private void searchTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTxtKeyReleased
        // TODO add your handling code here:
        DefaultTableModel obj = (DefaultTableModel) staffTable.getModel();
        TableRowSorter<DefaultTableModel> obj1 = new TableRowSorter<>(obj);
        staffTable.setRowSorter(obj1);
        obj1.setRowFilter(RowFilter.regexFilter(searchTxt.getText()));
    }//GEN-LAST:event_searchTxtKeyReleased

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateBtnActionPerformed

    private void updateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateBtnMouseClicked
        // TODO add your handling code here:
        conn = MyConnection.getConnection();
        try {
            if (fullnameTxt.getText().equals("") || addressTxt.getText().equals("") || phoneTxt.getText().equals("") || salaryTxt.getText().equals("")|| emailTxt.getText().equals("") || useTxt.getText().equals("") || pwdTxt.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Bạn cần nhập đủ dữ liệu");
            } else {
                Statement st = conn.createStatement();
                String sql = "Update Staff set Address='" +addressTxt.getText()+"',Phone='" +phoneTxt.getText()+"',Salary='" +salaryTxt.getText()+"',Email='" +emailTxt.getText()+"',Username='" +useTxt.getText()+"',Password='"  +pwdTxt.getText()+"'where Staff_Name='" + fullnameTxt.getText() + "'";
                st = conn.createStatement();
                int kq = st.executeUpdate(sql);
                if (kq > 0) {
                    JOptionPane.showMessageDialog(this, "Cập nhật thành công");
                    loadBang();
                }
                st.close();
            }
            conn.close();

        } catch (Exception e) {
        }
    }//GEN-LAST:event_updateBtnMouseClicked

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        Main_Manager main = new Main_Manager();
        this.dispose();
        main.show();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
            fullnameTxt.setText("");
            addressTxt.setText("");
            phoneTxt.setText("");
            emailTxt.setText("");
            salaryTxt.setText("");
            useTxt.setText("");
            pwdTxt.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StaffFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTxt;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton delBtn;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JTextField fullnameTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField phoneTxt;
    private javax.swing.JPasswordField pwdTxt;
    private javax.swing.JTextField salaryTxt;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField searchTxt;
    private javax.swing.JTable staffTable;
    private javax.swing.JButton updateBtn;
    private javax.swing.JTextField useTxt;
    // End of variables declaration//GEN-END:variables
}
