/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_10_Models;

/**
 *
 * @author dungna29
 */
public class NhanVien extends Nguoi{
    private String maNv;
    private int idChucVu;

    public NhanVien() {
    }

    public NhanVien(String maNv, int idChucVu, int id, String ten, int gioiTinh) {
        super(id, ten, gioiTinh);
        this.maNv = maNv;
        this.idChucVu = idChucVu;
    }

    public String getMaNv() {
        return maNv;
    }

    public void setMaNv(String maNv) {
        this.maNv = maNv;
    }

    public int getIdChucVu() {
        return idChucVu;
    }

    public void setIdChucVu(int idChucVu) {
        this.idChucVu = idChucVu;
    }
    

    @Override
    public String InThongTin() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
