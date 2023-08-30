/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package main_manager.manage_import_products_1;

import java.util.List;

/**
 *
 * @author Duy Nguyen
 */
public interface Manage_Import_Products {
    public List<Import_Products> view();
    public void add(String id, String name, String quantity, String suppID, String wareID, String ipDay);    
    public void update(String id, String name, String quantity, String suppID, String wareID, String ipDay);
    public void delete(String id);
    public boolean checkID(String id);
    public boolean checkSuppID(String suppID);
    public boolean checkWareID(String wareID);
}
 