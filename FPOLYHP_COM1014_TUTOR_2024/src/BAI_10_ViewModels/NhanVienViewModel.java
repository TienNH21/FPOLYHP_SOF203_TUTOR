/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_10_ViewModels;

/**
 *
 * @author dungna29
 */
//ViewModels là nơi cấu hình hiển thị ra ngoài FE
public class NhanVienViewModel {
    private int stt;
    private int id;
    private String ten;
    private int gioiTinh;
    private String maNv;
    private int idChucVu;
    private String tenCV;

    public NhanVienViewModel() {
    }

    public NhanVienViewModel(int stt, int id, String ten, int gioiTinh, String maNv, int idChucVu, String tenCV) {
        this.stt = stt;
        this.id = id;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.maNv = maNv;
        this.idChucVu = idChucVu;
        this.tenCV = tenCV;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
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

    public String getTenCV() {
        return tenCV;
    }

    public void setTenCV(String tenCV) {
        this.tenCV = tenCV;
    }
    
}
