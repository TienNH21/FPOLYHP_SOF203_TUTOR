/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_10_Models;

/**
 *
 * @author dungna29
 */
public class ChucVu {
    private int id;
    private String maCv;
    private String tenCv;

    public ChucVu() {
    }

    public ChucVu(int id, String maCv, String tenCv) {
        this.id = id;
        this.maCv = maCv;
        this.tenCv = tenCv;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaCv() {
        return maCv;
    }

    public void setMaCv(String maCv) {
        this.maCv = maCv;
    }

    public String getTenCv() {
        return tenCv;
    }

    public void setTenCv(String tenCv) {
        this.tenCv = tenCv;
    }
    
}
