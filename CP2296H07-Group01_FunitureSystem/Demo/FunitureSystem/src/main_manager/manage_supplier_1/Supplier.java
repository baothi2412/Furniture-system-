/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main_manager.manage_supplier_1;

/**
 *
 * @author Duy Nguyen
 */
public class Supplier {
    private int SuppID;
    private String SuppName;
    private String address;
    private int phone;

    public Supplier() {
    }

    public Supplier(int SuppID, String SuppName, String address, int phone) {
        this.SuppID = SuppID;
        this.SuppName = SuppName;
        this.address = address;
        this.phone = phone;
    }

    public int getSuppID() {
        return SuppID;
    }

    public void setSuppID(int SuppID) {
        this.SuppID = SuppID;
    }

    public String getSuppName() {
        return SuppName;
    }

    public void setSuppName(String SuppName) {
        this.SuppName = SuppName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
    
}
