/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_10_Services;

import BAI_10_ViewModels.NhanVienViewModel;
import java.util.List;

/**
 *
 * @author dungna29
 */
public interface IQLNhanVienService {
    /*
        1. Phương thức trong interface không có body code
        2. Không dùng được private
        3. Các method mặc định là public
    */
    String add(NhanVienViewModel nv);
    String update(NhanVienViewModel nv);
    String delete(int idNV);
    List<NhanVienViewModel> getLstNhanViens();
    List<NhanVienViewModel> getLstNhanViens(String tenNV);
}
