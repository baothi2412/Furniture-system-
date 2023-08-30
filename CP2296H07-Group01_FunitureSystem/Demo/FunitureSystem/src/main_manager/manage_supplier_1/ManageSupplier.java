/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package main_manager.manage_supplier_1;

import java.util.List;

/**
 *
 * @author Duy Nguyen
 */
public interface ManageSupplier {
    public List<Supplier> viewSupplier();
    public void addSupplier(String id, String name, String address, String phone);
    public void updateSupplier(String id, String name, String address, String phone);
    public void deleteSupplier(String id);
    public List<Supplier> searchSupplier(String name);
    public boolean checkID(String id);
}
