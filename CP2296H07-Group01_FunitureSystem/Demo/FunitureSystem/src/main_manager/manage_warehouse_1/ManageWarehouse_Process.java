/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main_manager.manage_warehouse_1;

import java.util.ArrayList;
import java.util.List;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import funiture_system.MyConnection;
/**
 *
 * @author Duy Nguyen
 */
public class ManageWarehouse_Process implements ManageWarehouse {
    Connection conn = MyConnection.getConnection();
    String sql = null;
    String sql2 = null;
    Statement stm;
    ResultSet rs;
    @Override
    public List<Warehouse> viewWarehouse() {
        List<Warehouse> listWare = new ArrayList<>();
        try {
            sql = "select w.Warehouse_ID, w.Warehouse_Name, w.Address, sum(ip.Quantity) as Total_Products from Warehouse w full outer join Import_Product_Detail ipd\n" +
        "on w.Warehouse_ID = ipd.Warehouse_ID\n" +
        "full outer join Import_Product ip on ipd.Import_ID = ip.Import_ID group by w.Warehouse_ID, w.Warehouse_Name, w.Address";
            stm = conn.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()) {
                listWare.add(new Warehouse(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4)));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return listWare;
    }

    @Override
    public void addWarehouse(String id, String name, String address) {
        try {
            sql = "insert into Warehouse(Warehouse_ID, Warehouse_Name, Address) values ("+id+", '"+name+"', '"+address+"')";
            stm = conn.createStatement();
            stm.executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    @Override
    public void updateWarehouse(String id, String name, String address) {
        try {
            sql = "update Warehouse set Warehouse_ID = "+id+", Warehouse_Name = '"+name+"', Address = '"+address+"' where Warehouse_ID = "+id+"";
            stm = conn.createStatement();
            stm.executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    @Override
    public void deleteWarehouse(String id) {
        try {
            sql = "delete from Warehouse where Warehouse_ID = "+id+"";
            stm = conn.createStatement();
            stm.executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    
    @Override
    public boolean checkID(String id) {
        try {
            Integer id2 = new Integer(id);
            sql = "select Warehouse_ID from Warehouse";
            stm = conn.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()) {
                if (id2.equals(rs.getInt("Warehouse_ID"))) {
                    return false;
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return true;
    }  
}
