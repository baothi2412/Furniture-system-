package main_manager.import_statistics;

import funiture_system.MyConnection;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JList;
import main_manager.Main_Manager;

public class Import_Statistic extends JFrame {
    JFrame frame = new JFrame();
    public Import_Statistic() {
        setLocationRelativeTo(null);
        initUI();
    }

    private void initUI() {

        CategoryDataset dataset = createDataset();

        JFreeChart chart = createChart(dataset);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 100, 15));
        chartPanel.setBackground(Color.WHITE);
        add(chartPanel);

        pack();
        setTitle("Import Statistics");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
    }

    private CategoryDataset createDataset() {
        var dataset = new DefaultCategoryDataset();
        List<warehouse> list = new ArrayList<>();
        try {
            Connection conn = MyConnection.getConnection();
            Statement stm = conn.createStatement();
            String sql = "select w.Warehouse_Name as Warehouse_Name, sum(ip.Quantity) as Total from Import_Product_Detail ipd full outer join Warehouse w\n" +
                    "on ipd.Warehouse_ID = w.Warehouse_ID full outer join Import_Product ip\n" +
                    "on ipd.Import_ID = ip.Import_ID group by w.Warehouse_Name";
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                list.add(new warehouse(rs.getString("Warehouse_Name"), rs.getInt("Total")));
            }
            for (warehouse i : list) {
                String name = i.getName();
                dataset.setValue(i.getTotal(), "Warehouse", name);
            }
            
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return dataset;
    }

    private JFreeChart createChart(CategoryDataset dataset) {

        JFreeChart barChart = ChartFactory.createBarChart(
                "The bar chart shows the total imported products of each warehouse over the years.",
                "",
                "Total Imported Products",
                dataset,
                PlotOrientation.VERTICAL,
                false, true, false);

        return barChart;
    }

    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Import_Statistic().setVisible(true);
            }
        });
    }
}
