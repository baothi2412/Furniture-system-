package main_staff.manage_customer_2;

import java.sql.*;
import java.sql.Connection;
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
import main_staff.Main_Staff;
import funiture_system.MyConnection;

public class CustomerFrame extends javax.swing.JFrame {

    private Connection connection;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;

    final String header[] = {"Customer_ID", "Customer_Name", "Address", "Phone", "Email", "Username", "Password"};
    final DefaultTableModel tb = new DefaultTableModel(header, 0);
    Connection conn = MyConnection.getConnection();

    public CustomerFrame() {
        initComponents();
        loadBang();
        setLocationRelativeTo(null);
    }

    public void loadBang() {
        try {
            conn = MyConnection.getConnection();
            int number;
            Vector row;
            String sql = "select * from Customer";
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
                customerTable.setModel(tb);
            }
            st.close();
            rs.close();
            conn.close();
        } catch (Exception e) {
            customerTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                public void valueChanged(ListSelectionEvent e) {
                    if (customerTable.getSelectedRow() >= 0) {
                        fullnameTxt.setText(customerTable.getValueAt(customerTable.getSelectedRow(), 1) + "");
                        addressTxt.setText(customerTable.getValueAt(customerTable.getSelectedRow(), 2) + "");
                        phoneTxt.setText(customerTable.getValueAt(customerTable.getSelectedRow(), 3) + "");
                        emailTxt.setText(customerTable.getValueAt(customerTable.getSelectedRow(), 4) + "");
                        useTxt.setText(customerTable.getValueAt(customerTable.getSelectedRow(), 5) + "");
                        pwdTxt.setText(customerTable.getValueAt(customerTable.getSelectedRow(), 6) + "");

                    }
                }
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        useTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        phoneTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        addressTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        delBtn = new javax.swing.JButton();
        pwdTxt = new javax.swing.JPasswordField();
        btnCancel = new javax.swing.JButton();
        fullnameTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        searchTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        updatebtn = new javax.swing.JButton();
        resetbtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        customerTable = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Customer management", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Candara", 0, 25))); // NOI18N
        jPanel1.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Candara", 0, 15)); // NOI18N
        jLabel1.setText("User name:");

        jLabel2.setFont(new java.awt.Font("Candara", 0, 15)); // NOI18N
        jLabel2.setText("Email");

        jLabel3.setFont(new java.awt.Font("Candara", 0, 15)); // NOI18N
        jLabel3.setText("Phone");

        phoneTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneTxtActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Candara", 0, 15)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Candara", 0, 15)); // NOI18N
        jLabel5.setText("Adress");

        addressTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTxtActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Candara", 0, 15)); // NOI18N
        jLabel6.setText("Password");

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

        pwdTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwdTxtActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(255, 0, 0));
        btnCancel.setFont(new java.awt.Font("Candara", 0, 15)); // NOI18N
        btnCancel.setText("Cannel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        fullnameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullnameTxtActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Candara", 0, 15)); // NOI18N
        jLabel7.setText("Cutomer name:");

        searchTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTxtActionPerformed(evt);
            }
        });
        searchTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchTxtKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTxtKeyReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Candara", 0, 15)); // NOI18N
        jLabel8.setText("Search:");

        updatebtn.setBackground(new java.awt.Color(0, 255, 255));
        updatebtn.setFont(new java.awt.Font("Candara", 0, 15)); // NOI18N
        updatebtn.setText("Update");
        updatebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updatebtnMouseClicked(evt);
            }
        });
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });

        resetbtn.setBackground(new java.awt.Color(255, 51, 51));
        resetbtn.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        resetbtn.setText("Reset");
        resetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(165, 165, 165)
                                .addComponent(fullnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1))
                                        .addGap(85, 85, 85))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(82, 82, 82)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(emailTxt)
                                    .addComponent(pwdTxt)
                                    .addComponent(useTxt)
                                    .addComponent(phoneTxt)
                                    .addComponent(addressTxt)
                                    .addComponent(searchTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(delBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(saveBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)))
                            .addComponent(updatebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(resetbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(saveBtn)
                    .addComponent(fullnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(updatebtn)
                                .addGap(18, 18, 18)
                                .addComponent(resetbtn))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(phoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(delBtn)
                        .addGap(145, 145, 145)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancel)
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(useTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pwdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(42, 42, 42))
        );

        customerTable.setModel(new javax.swing.table.DefaultTableModel(
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
        customerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(customerTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("Architecture of Application");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fullnameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullnameTxtActionPerformed

    }//GEN-LAST:event_fullnameTxtActionPerformed

    private void addressTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTxtActionPerformed

    }//GEN-LAST:event_addressTxtActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed

        conn = MyConnection.getConnection();
        try {
            boolean temp = true;

            String phone = phoneTxt.getText();
            for (char c : phone.toCharArray()) {
                if (!Character.isDigit(c)) {
                    JOptionPane.showMessageDialog(this, "Phone only accepts numbers, cannot contain characters!!", "Error", JOptionPane.ERROR_MESSAGE);
                    temp = false;
                    break;
                }
            }
            if (temp = true) {
                if (fullnameTxt.getText().equals("") || addressTxt.getText().equals("") || phoneTxt.getText().equals("") || emailTxt.getText().equals("") || useTxt.getText().equals("") || pwdTxt.getText().equals("")) {
                    JOptionPane.showMessageDialog(this, "Bạn cần nhập đủ dữ liệu");
                } else {
                    StringBuffer sb = new StringBuffer();
                    String sql_check_pk = "select Customer_Name from Customer where Customer_Name ='" + fullnameTxt.getText() + "'";
                    Statement st = conn.createStatement();
                    ResultSet rs = st.executeQuery(sql_check_pk);
                    if (rs.next()) {
                        sb.append("Tên này đã tồn tại");
                    }
                    if (sb.length() > 0) {
                        JOptionPane.showMessageDialog(this, sb.toString());
                    } else {
                        String sql = "Insert into Customer values('" + fullnameTxt.getText() + "','" + addressTxt.getText() + "', '" + phoneTxt.getText() + "', '" + emailTxt.getText() + "', '" + useTxt.getText() + "', '" + pwdTxt.getText() + "')";
                        st = conn.createStatement();
                        int kq = st.executeUpdate(sql);
                        if (kq > 0) {
                            JOptionPane.showMessageDialog(this, "Thêm mới thành công");

                            loadBang();
                        }
                    }
                    st.close();
                }
                conn.close();
            }

        } catch (Exception e) {
            e.printStackTrace(); // In ra thông tin lỗi trong console
            JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi khi thực hiện thao tác trên cơ sở dữ liệu");
        }

    }//GEN-LAST:event_saveBtnActionPerformed

    private void delBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delBtnActionPerformed
        // TODO add your handling code here:
        conn = MyConnection.getConnection();
        try {
            String sql = "Delete Customer where Customer_Name='" + fullnameTxt.getText() + "'";
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

    private void customerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerTableMouseClicked

        int x = customerTable.getSelectedRow();
        if (customerTable.getSelectedRow() >= 0) {
            fullnameTxt.setText(customerTable.getValueAt(customerTable.getSelectedRow(), 1) + "");
            addressTxt.setText(customerTable.getValueAt(customerTable.getSelectedRow(), 2) + "");
            phoneTxt.setText(customerTable.getValueAt(customerTable.getSelectedRow(), 3) + "");
            emailTxt.setText(customerTable.getValueAt(customerTable.getSelectedRow(), 4) + "");
            useTxt.setText(customerTable.getValueAt(customerTable.getSelectedRow(), 5) + "");
            pwdTxt.setText(customerTable.getValueAt(customerTable.getSelectedRow(), 6) + "");
        }
    }//GEN-LAST:event_customerTableMouseClicked

    private void pwdTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwdTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwdTxtActionPerformed

    private void searchTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTxtKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_searchTxtKeyPressed

    private void searchTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTxtActionPerformed

    private void searchTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTxtKeyReleased

        DefaultTableModel obj = (DefaultTableModel) customerTable.getModel();
        TableRowSorter<DefaultTableModel> obj1 = new TableRowSorter<>(obj);
        customerTable.setRowSorter(obj1);
        obj1.setRowFilter(RowFilter.regexFilter(searchTxt.getText()));
    }//GEN-LAST:event_searchTxtKeyReleased

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        Main_Staff main = new Main_Staff();
        this.dispose();
        main.show();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void phoneTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneTxtActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_phoneTxtActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_updatebtnActionPerformed

    private void updatebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatebtnMouseClicked
        // TODO add your handling code here:
        conn = MyConnection.getConnection();
        try {
            if (fullnameTxt.getText().equals("") || addressTxt.getText().equals("") || phoneTxt.getText().equals("") || emailTxt.getText().equals("") || useTxt.getText().equals("") || pwdTxt.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Bạn cần nhập đủ dữ liệu");
            } else {
                for (char c : phoneTxt.getText().toCharArray()) {
                    if (!Character.isDigit(c)) {
                        JOptionPane.showMessageDialog(this, "Điện thoại phải là số, không được chứa chữ cái ");
                        return;
                    }
                }
                Statement st = conn.createStatement();
                String sql = "Update Customer set Address='" + addressTxt.getText() + "',Phone='" + phoneTxt.getText() + "',Email='" + emailTxt.getText() + "',Username='" + useTxt.getText() + "',Password='" + pwdTxt.getText() + "'where Customer_Name='" + fullnameTxt.getText() + "'";
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
    }//GEN-LAST:event_updatebtnMouseClicked

    private void resetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbtnActionPerformed
        fullnameTxt.setText("");
        addressTxt.setText("");
        phoneTxt.setText("");
        emailTxt.setText("");
        useTxt.setText("");
        pwdTxt.setText("");
    }//GEN-LAST:event_resetbtnActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTxt;
    private javax.swing.JButton btnCancel;
    private javax.swing.JTable customerTable;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField phoneTxt;
    private javax.swing.JPasswordField pwdTxt;
    private javax.swing.JButton resetbtn;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField searchTxt;
    private javax.swing.JButton updatebtn;
    private javax.swing.JTextField useTxt;
    // End of variables declaration//GEN-END:variables
}
