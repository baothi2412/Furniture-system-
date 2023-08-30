/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main_manager.manage_import_products_1;

import funiture_system.MyConnection;
import java.util.ArrayList;
import java.util.List;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Duy Nguyen
 */
public class Manage_Import_Products_Process implements Manage_Import_Products {
    Connection conn = MyConnection.getConnection();
    String sql = null;
    Statement stm = null;
    ResultSet rs = null;
    @Override
    public List<Import_Products> view() {
        List<Import_Products> listImport = new ArrayList<>();
        try {
            sql = "select ip.*, ipd.Warehouse_ID, ipd.Import_day from Import_Product ip join Import_Product_Detail ipd\n" +
                    "on ip.Import_ID = ipd.Import_ID";
            stm = conn.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()) {
                listImport.add(new Import_Products(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getString(6)));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return listImport;
    }

    @Override
    public void add(String id, String name, String quantity, String suppID, String wareID, String ipDay) {
        try {
            String sql1 = "insert into Import_Product(Import_ID, Import_Product_Name, Quantity, Supplier_ID) values ("+id+",'"+name+"', "+quantity+", "+suppID+")";
            String sql2 = "insert into Import_Product_Detail (Import_ID, Warehouse_ID, Import_day) values ("+id+", "+wareID+", '"+ipDay+"')";
            stm = conn.createStatement();
            stm.executeUpdate(sql1);
            stm.executeUpdate(sql2);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    @Override
    public void update(String id, String name, String quantity, String suppID, String wareID, String ipDay) {
        try {
            String sql1 = "update Import_Product set Import_Id = "+id+", Import_Product_Name = '"+name+"', Quantity = "+quantity+", Supplier_ID = "+suppID+" where Import_ID = "+id+"";
            String sql2 = "update Import_Product_Detail set Import_ID = "+id+", Warehouse_ID = "+wareID+", Import_day = '"+ipDay+"' where Import_ID = "+id+"";
            stm = conn.createStatement();
            stm.executeUpdate(sql1);
            stm.executeUpdate(sql2);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    @Override
    public void delete(String id) {
        try {
            String sql1 = "delete from Import_Product_Detail where Import_ID = "+id+"";
            String sql2 = "delete from Import_Product where Import_ID = "+id+"";
            stm = conn.createStatement();
            stm.executeUpdate(sql1);
            stm.executeUpdate(sql2);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    
    @Override
    public boolean checkID(String id) {
        try {
            Integer id2 = new Integer(id);
            sql = "select Import_ID from Import_Product";
            stm = conn.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()) {
                if (id2.equals(rs.getInt("Import_ID"))) {
                    return false;
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return true;
    }
    
    @Override
    public boolean checkSuppID(String suppID) {
        try {
            Integer suppID2 = new Integer(suppID);
            sql = "select Supplier_ID from Supplier";
            stm = conn.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()) {
                if (suppID2.equals(rs.getInt("Supplier_ID"))) {
                    return true;
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return false;
    }
    
    @Override
    public boolean checkWareID(String wareID) {
        try {
            Integer wareID2 = new Integer(wareID);
            sql = "select Warehouse_ID from Warehouse";
            stm = conn.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()) {
                if (wareID2.equals(rs.getInt("Warehouse_ID"))) {
                    return true;
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return false;
    }
}
 