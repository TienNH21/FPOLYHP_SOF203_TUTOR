/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_10_Models;

/**
 *
 * @author dungna29
 */

public abstract class Nguoi {
    private int id;
    private String ten;
    private int gioiTinh;

    public Nguoi() {
    }

    public Nguoi(int id, String ten, int gioiTinh) {
        this.id = id;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    
    public abstract String InThongTin();
}
