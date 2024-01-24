/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_10_DAO;

import BAI_10_Models.NhanVien;
import java.util.List;

/**
 *
 * @author dungna29
 */
//Tầng CRUD phía SQL đi theo từng bảng
public interface INhanVienRepo {
    public boolean add(NhanVien nv);
    public boolean update(NhanVien nv);
    public boolean delete(int id);
    public List<NhanVien> getAllNhanViens();
}
