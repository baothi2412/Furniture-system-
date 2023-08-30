/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main_manager.manage_import_products_1;

/**
 *
 * @author Duy Nguyen
 */
public class Import_Products {
    private int id;
    private String proName;
    private int quantity;
    private int suppID;
    private int wareID;
    private String date;

    public Import_Products() {
    }

    public Import_Products(int id, String proName, int quantity, int suppID, int wareID, String date) {
        this.id = id;
        this.proName = proName;
        this.quantity = quantity;
        this.suppID = suppID;
        this.wareID = wareID;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getSuppID() {
        return suppID;
    }

    public void setSuppID(int suppID) {
        this.suppID = suppID;
    }

    public int getWareID() {
        return wareID;
    }

    public void setWareID(int wareID) {
        this.wareID = wareID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
}
