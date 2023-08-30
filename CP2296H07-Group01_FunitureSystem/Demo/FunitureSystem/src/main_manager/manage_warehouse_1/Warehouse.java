/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main_manager.manage_warehouse_1;

/**
 *
 * @author Duy Nguyen
 */
public class Warehouse {
    private int id;
    private String name;
    private String address;
    private int numPro;

    public Warehouse() {
    }

    public Warehouse(int id, String name, String address, int numPro) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.numPro = numPro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumPro() {
        return numPro;
    }

    public void setNumPro(int numPro) {
        this.numPro = numPro;
    }
    
}
