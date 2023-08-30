package main_staff.manage_product_3;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.Image;
import java.sql.DriverManager;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import main_staff.Main_Staff;
import funiture_system.MyConnection;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;

import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author BAOTHI
 */
public class Product extends javax.swing.JFrame {

    final String header[] = {"Product_ID", "Product_Name", "CategoryID", "Price", "Quantity", "Color", "Size", "Image", "Description"};
    final DefaultTableModel tb = new DefaultTableModel(header, 0);
    JFileChooser fileChooser = new JFileChooser();
    int returnValue;
    String imgurl;

    Connection conn = MyConnection.getConnection();
    Cloudinary cloudinary = new Cloudinary(ObjectUtils.asMap(
            "cloud_name", "dyetbks6g",
            "api_key", "271339192833531",
            "api_secret", "zkdgWWLb0LG1iPDYn8NMSIH8Q24"));

    public Product() {
        initComponents();
        setCategory();
        loadBang();
        setSize();
         updateTable();
        setImage("https://www.generationsforpeace.org/wp-content/uploads/2018/03/empty-300x240.jpg");
        setLocationRelativeTo(null);
       

        search.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateTable();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateTable();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateTable();
            }
        });
    }

    public void updateTable() {
        try {
            Connection conn = MyConnection.getConnection();
            int number;
            Vector row;
            String sql = "SELECT * FROM Product WHERE Product_Name LIKE '%" + search.getText()
                    + "%'  OR  Price LIKE '%" + search.getText()
                    + "%'  OR  Color LIKE '%" + search.getText() + "%'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            ResultSetMetaData metadata = rs.getMetaData();
            number = metadata.getColumnCount();
            tb.setRowCount(0);
            while (rs.next()) {
                row = new Vector();
                for (int i = 1; i <= number; i++) {
                    if (i == 3) {
                        String sqlsearch = "SELECT c.Category_Name FROM Category c WHERE  Category_ID = ? ";
                        try ( PreparedStatement stmt = conn.prepareStatement(sqlsearch)) {
                            stmt.setString(1, rs.getString(i));
                            try ( ResultSet rss = stmt.executeQuery()) {
                                if (rss.next()) {
                                    String categoryName = rss.getString("Category_Name");
                                    row.addElement(categoryName);
                                }
                            }
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    } else {
                        row.addElement(rs.getString(i));
                    }
                }

                tb.addRow(row);
                dgvProduct.setModel(tb);
            }
            st.close();
            rs.close();
            conn.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void loadBang() {
        try {
            conn = MyConnection.getConnection();
            int number;
            Vector row;
//            String sql = "select * from Product";
            String sql = "SELECT * FROM Product ";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            ResultSetMetaData metadata = rs.getMetaData();
            number = metadata.getColumnCount();
            tb.setRowCount(0);
            while (rs.next()) {
                row = new Vector();
                for (int i = 1; i <= number; i++) {
                    if (i == 3) {
                        String sqlsearch = "SELECT c.Category_Name FROM Category c WHERE  Category_ID = ? ";
                        try ( PreparedStatement stmt = conn.prepareStatement(sqlsearch)) {
                            stmt.setString(1, rs.getString(i));
                            try ( ResultSet rss = stmt.executeQuery()) {
                                if (rss.next()) {
                                    String categoryName = rss.getString("Category_Name");
                                    row.addElement(categoryName);
                                }
                            }
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    } else {
                        row.addElement(rs.getString(i));
                    }
                }

                tb.addRow(row);
                dgvProduct.setModel(tb);
            }
            st.close();
            rs.close();
            conn.close();
        } catch (Exception e) {

        }

        dgvProduct.getSelectionModel().addListSelectionListener(e -> {
            int selectedRow = dgvProduct.getSelectedRow();
            if (selectedRow >= 0) {
                txtID.setText(dgvProduct.getValueAt(selectedRow, 0).toString());
                txtName.setText(dgvProduct.getValueAt(selectedRow, 1).toString());
                cboCategory.setSelectedItem(dgvProduct.getValueAt(selectedRow, 2).toString());
                txtprice.setText(dgvProduct.getValueAt(selectedRow, 3).toString());
                txtquantity.setText(dgvProduct.getValueAt(selectedRow, 4).toString());
                txtcolor.setText(dgvProduct.getValueAt(selectedRow, 5).toString());
                cboSize.setSelectedItem(dgvProduct.getValueAt(selectedRow, 6).toString().trim());
                imgurl = dgvProduct.getValueAt(selectedRow, 7).toString();
                setImage(imgurl);
//                txtimage.setText(dgvProduct.getValueAt(selectedRow, 7).toString().trim());
                txtdescription.setText(dgvProduct.getValueAt(selectedRow, 8).toString());
            }
        });

    }

    public void setCategory() {

        try {
            conn = MyConnection.getConnection();
            int number;

            String sql = "select * from Category";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            ResultSetMetaData metadata = rs.getMetaData();
            number = metadata.getColumnCount();
            tb.setRowCount(0);
            while (rs.next()) {
                cboCategory.addItem(rs.getString("Category_Name"));
            }
            st.close();
            rs.close();
            conn.close();
        } catch (Exception e) {
        }

    }

    public void setSize() {
        // Khởi tạo mảng chứa danh sách các kích thước
        String[] sizes = {"Lon", "Vua", "Nho"};

// Xóa tất cả các item cũ trong cboSize (nếu có)
        cboSize.removeAllItems();

// Thêm các kích thước vào cboSize
        for (String size : sizes) {
            cboSize.addItem(size);
        }

// Đặt giá trị mặc định cho cboSize (nếu có)
        if (sizes.length > 0) {
            cboSize.setSelectedIndex(0);
        }
    }

    public void setImage(String imageUrl) {
        try {
            URL url = new URL(imageUrl);
// Tạo một đối tượng ImageIcon từ URL
            ImageIcon icon = new ImageIcon(url);
// Lấy kích thước hiện thời của hình ảnh
            int width = icon.getIconWidth();
            int height = icon.getIconHeight();
// Kích thước khung JLabel
            int labelWidth = image.getWidth();
            int labelHeight = image.getHeight();

// Kiểm tra kích thước của hình ảnh và khung JLabel để xác định xem có cần điều chỉnh kích thước hay không
            if (width > labelWidth || height > labelHeight) {
                // Tính tỉ lệ co giãn của hình ảnh để phù hợp với khung JLabel
                double scaleFactor = Math.min((double) labelWidth / width, (double) labelHeight / height);
                // Tính toán kích thước mới của hình ảnh
                int scaledWidth = (int) (width * scaleFactor);
                int scaledHeight = (int) (height * scaleFactor);
                // Thay đổi kích thước của hình ảnh
                Image scaledImage = icon.getImage().getScaledInstance(scaledWidth, scaledHeight, Image.SCALE_SMOOTH);
                // Tạo một đối tượng ImageIcon mới từ hình ảnh đã được điều chỉnh kích thước
                icon = new ImageIcon(scaledImage);
            }

// Đặt hình ảnh đã được điều chỉnh kích thước cho JLabel
            image.setIcon(icon);

        } catch (IOException e) {
            e.printStackTrace();
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

        btnHome = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dgvProduct = new javax.swing.JTable();
        txtID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtcolor = new javax.swing.JTextField();
        txtprice = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtquantity = new javax.swing.JTextField();
        txtdescription = new javax.swing.JTextField();
        cboCategory = new javax.swing.JComboBox<>();
        Add = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        chooseimage = new javax.swing.JButton();
        cboSize = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        Barchart = new javax.swing.JButton();
        image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/funiture_system/img/home.png"))); // NOI18N
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Candara", 0, 36)); // NOI18N
        jLabel1.setText("Products");

        jLabel2.setText("ID:");

        jLabel3.setText("Name:");

        jLabel4.setText("CategoryID:");

        jLabel5.setText("Color:");

        jLabel6.setText("Size:");

        jLabel7.setText("Price:");

        dgvProduct.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(dgvProduct);

        jLabel9.setText("Quantity:");

        jLabel10.setText("Description:");

        Add.setBackground(new java.awt.Color(51, 255, 255));
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

        chooseimage.setText("Choose image");
        chooseimage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseimageActionPerformed(evt);
            }
        });

        cboSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lon", "Vua", "Nho" }));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Search:");

        Barchart.setText("Bar Chart");
        Barchart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BarchartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(307, 307, 307))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(cboCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(122, 122, 122)
                                .addComponent(Barchart, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtdescription, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtprice, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cboSize, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtcolor, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtquantity, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(202, 202, 202)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chooseimage, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(jLabel5)
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtcolor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtquantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(txtdescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cboCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Update, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Barchart, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(search)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(chooseimage)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed

        conn = MyConnection.getConnection();
        try {
            int index = cboCategory.getSelectedIndex(); // Lấy chỉ số của mục được chọn trong combobox

            if (txtID.getText().equals("") || txtName.getText().equals("") || index == -1) {
                JOptionPane.showMessageDialog(this, "Bạn cần nhập đủ dữ liệu");
            } else {
                StringBuffer sb = new StringBuffer();
                String sql_check_pk = "SELECT Product_Name FROM Product WHERE Product_Name = '" + txtName.getText() + "'";
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(sql_check_pk);
                if (rs.next()) {
                    sb.append("Mã này đã tồn tại");
                }
                if (sb.length() > 0) {
                    JOptionPane.showMessageDialog(this, sb.toString());
                } else {
                    if (returnValue == JFileChooser.APPROVE_OPTION) {
                        try {
                            File selectedFile = fileChooser.getSelectedFile();
                            Map url = new HashMap();

                            String publicId = "image/" + cboCategory.getItemAt(index) + "/" + txtName.getText().trim();
                            url.put("overwrite", true);
                            url.put("resource_type", "image");
                            Map r = cloudinary.uploader().upload(selectedFile, url);
                            imgurl = (String) r.get("secure_url");
                        } catch (IOException ex) {
                            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                    int intCategory = 0;
                    String sqlsearch = "SELECT c.Category_ID FROM Category c WHERE  Category_Name = ? ";
                    try ( PreparedStatement stmt = conn.prepareStatement(sqlsearch)) {
                        stmt.setString(1, cboCategory.getItemAt(index));
                        try ( ResultSet rss = stmt.executeQuery()) {
                            if (rss.next()) {
                                intCategory = rss.getInt("Category_ID");
                            }
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    String selectedSize = cboSize.getSelectedItem().toString();
                    System.out.println(imgurl);
                    String sql = "INSERT INTO Product VALUES ('" + txtID.getText() + "','" + txtName.getText() + "','" + intCategory + "','" + txtprice.getText() + "','" + txtquantity.getText() + "','" + txtcolor.getText() + "','" + selectedSize + "','" + imgurl + "','" + txtdescription.getText() + "')";
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

        } catch (Exception e) {
            // Xử lý lỗi tại đây
            e.printStackTrace(); // In ra thông tin lỗi trong console
            JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi khi thực hiện thao tác trên cơ sở dữ liệu");
        }

    }//GEN-LAST:event_AddActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        txtID.setText("");
        txtName.setText("");
        cboCategory.setSelectedItem("1");
        txtprice.setText("");
        txtquantity.setText("");
        txtcolor.setText("");

        cboSize.setSelectedItem("Lon");

        txtdescription.setText("");
        loadBang();
        txtID.setEnabled(true);
    }//GEN-LAST:event_ResetActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        conn = MyConnection.getConnection();
        try {

            String sql = "DELETE FROM Product WHERE Product_ID ='" + txtID.getText() + "'";

            Statement st = conn.createStatement();
            int chk = JOptionPane.showConfirmDialog(this, "Bạn chắc chắn xóa chứ?", "Thông báo!", JOptionPane.YES_NO_OPTION);
            if (chk == JOptionPane.YES_OPTION) {
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(this, "Xóa thành công");

                int intCategory = 0;
                String sql1 = "SELECT c.Category_ID FROM Category c WHERE  Category_Name = ? ";

            }
            loadBang();
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed

        conn = MyConnection.getConnection();
        int index = cboCategory.getSelectedIndex(); // Lấy chỉ số của mục được chọn trong combobox
        try {
            if (txtName.getText().equals("") || txtID.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Bạn cần nhập đủ dữ liệu");
            } else {
                if (returnValue == fileChooser.APPROVE_OPTION) {
                    try {
                        File selectedFile = fileChooser.getSelectedFile();
                        if (selectedFile != null) {
                            Map<String, Object> params = new HashMap<>();
                            String publicId = "image/" + cboCategory.getItemAt(index) + "/" + txtName.getText().trim();
                            params.put("overwrite", true);
                            params.put("resource_type", "auto");
                            Map<?, ?> result = cloudinary.uploader().upload(selectedFile, params);
                            imgurl = (String) result.get("secure_url");
                        }
                    } catch (IOException ex) {
                        Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                int intCategory = 0;
                String sqlsearch = "SELECT c.Category_ID FROM Category c WHERE Category_Name = ? ";
                try ( PreparedStatement stmt = conn.prepareStatement(sqlsearch)) {
                    stmt.setString(1, cboCategory.getItemAt(index));
                    try ( ResultSet rss = stmt.executeQuery()) {
                        if (rss.next()) {
                            intCategory = rss.getInt("Category_ID");
                        }
                    }
                }
                String selectedSize = cboSize.getSelectedItem().toString();
                String sql = "UPDATE Product SET Product_Name='" + txtName.getText() + "',Category_ID= '" + intCategory + "',Price='" + txtprice.getText() + "',Quantity='" + txtquantity.getText() + "',Color='" + txtcolor.getText() + "',Size='" + selectedSize + "',Image='" + imgurl + "',Description='" + txtdescription.getText() + "' WHERE Product_ID='" + txtID.getText() + "'";

                Statement st = conn.createStatement();
                int kq = st.executeUpdate(sql);

                if (kq > 0) {
                    JOptionPane.showMessageDialog(this, "Cập nhật thành công");
                    loadBang();
                }
                st.close();
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi khi thực hiện thao tác trên cơ sở dữ liệu");
        }

    }//GEN-LAST:event_UpdateActionPerformed


    private void chooseimageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseimageActionPerformed

        try {
            try {
                // Thiết lập Look and Feel thành Windows
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            } catch (UnsupportedLookAndFeelException ex) {
                Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }

        fileChooser = new JFileChooser();
        returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            try {
                File selectedFile = fileChooser.getSelectedFile();
                Map url = new HashMap();
                url.put("public_id", "review");
                url.put("overwrite", true);
                url.put("resource_type", "image");
                Map r = cloudinary.uploader().upload(selectedFile, url);
                String imgurl = (String) r.get("secure_url");
                System.out.println(imgurl);
                setImage(imgurl);
            } catch (IOException ex) {

            }
        }
    }//GEN-LAST:event_chooseimageActionPerformed

    private void BarchartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BarchartActionPerformed

        conn = MyConnection.getConnection();
        String sql = "SELECT Category_ID, COUNT(*) AS count FROM Product GROUP BY Category_ID";

        try {
            // Kết nối cơ sở dữ liệu

            PreparedStatement statement = conn.prepareStatement(sql);

            // Thực thi truy vấn SQL
            ResultSet resultSet = statement.executeQuery();

            // Tạo dataset cho biểu đồ
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            while (resultSet.next()) {
                String category = resultSet.getString("Category_ID");
                int count = resultSet.getInt("count");
                dataset.addValue(count, "Số lượng", category);
            }

            // Tạo biểu đồ Bar Chart 3D
            JFreeChart chart = ChartFactory.createBarChart3D(
                    "Thống kê sản phẩm", // Tiêu đề biểu đồ
                    "Category ID", // Trục x - Tên danh mục
                    "Số lượng", // Trục y - Số lượng sản phẩm
                    dataset, // Dataset
                    PlotOrientation.VERTICAL, // Hướng biểu đồ
                    true, // Hiển thị legend
                    true, // Hiển thị tooltips
                    false // Hiển thị URLs
            );
            chart.setBackgroundPaint(Color.YELLOW);

            CategoryPlot plot = (CategoryPlot) chart.getPlot();
            plot.setForegroundAlpha(0.7f);
            plot.setRangeGridlinePaint(Color.black);

            // Hiển thị biểu đồ
            ChartFrame frame = new ChartFrame("Bar Chart 3D", chart);
            frame.setVisible(true);
            frame.setSize(600, 500);

            // Đóng kết nối cơ sở dữ liệu
            resultSet.close();
            statement.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_BarchartActionPerformed

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
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Product().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton Barchart;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Reset;
    private javax.swing.JButton Update;
    private javax.swing.JButton btnHome;
    private javax.swing.JComboBox<String> cboCategory;
    private javax.swing.JComboBox<String> cboSize;
    private javax.swing.JButton chooseimage;
    private javax.swing.JTable dgvProduct;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField search;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtcolor;
    private javax.swing.JTextField txtdescription;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtquantity;
    // End of variables declaration//GEN-END:variables

}
