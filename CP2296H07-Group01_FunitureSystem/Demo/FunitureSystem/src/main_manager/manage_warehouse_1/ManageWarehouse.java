/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package main_manager.manage_warehouse_1;

import java.util.List;

/**
 *
 * @author Duy Nguyen
 */
public interface ManageWarehouse {
    public List<Warehouse> viewWarehouse();
    public void addWarehouse(String id, String name, String address);
    public boolean checkID(String id);
    public void updateWarehouse(String id, String name, String address);
    public void deleteWarehouse(String id);
}
