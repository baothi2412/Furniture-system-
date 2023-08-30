/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main_manager.manage_supplier_1;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import funiture_system.MyConnection;

/**
 *
 * @author Duy Nguyen
 */
public class ManageSupplier_Process implements ManageSupplier {
    Connection conn = MyConnection.getConnection();
    Statement stm = null;
    ResultSet rs;
    String sql = null;
    
    @Override
    public List<Supplier> viewSupplier() {
        List<Supplier> list = new ArrayList<>();
        try {
            sql = "select * from Supplier";
            stm = conn.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()) {
                list.add(new Supplier(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4)));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return list;
    }

    @Override
    public void addSupplier(String id, String name, String address, String phone) {
        try {
            sql = "insert into Supplier(Supplier_ID, Supplier_Name, Address, Phone) values ("+id+",'"+name+"', '"+address+"', "+phone+")";
            stm = conn.createStatement();
            stm.executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    @Override
    public void updateSupplier(String id, String name, String address, String phone) {
        try {
            sql = "update Supplier set Supplier_Name = '"+name+"', Address = '"+address+"', Phone = "+phone+" where Supplier_ID = "+id+"";
            stm = conn.createStatement();
            stm.executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    @Override
    public void deleteSupplier(String id) {
        try {
            sql = "delete from Supplier where Supplier_ID = "+id+"";
            stm = conn.createStatement();
            stm.executeQuery(sql);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    @Override
    public List<Supplier> searchSupplier(String name) {
        List<Supplier> list = new ArrayList<>();
        try {
            sql = "select * from Supplier where Supplier_Name like '%"+name+"%'";
            stm = conn.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()) {
                list.add(new Supplier(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4)));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return list;
    }
    
    @Override
    public boolean checkID(String id) {
        Integer id2 = new Integer(id);
        try {
            sql = "select Supplier_ID from Supplier";
            stm = conn.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()) {
                if (id2.equals(rs.getInt("Supplier_ID"))) {
                    return false;
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return true;
    }
}
