/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_10_Services;

import BAI_10_DAO.INhanVienRepo;
import BAI_10_DAO.NhanVienRepo;
import BAI_10_Models.ChucVu;
import BAI_10_Models.NhanVien;
import BAI_10_ViewModels.NhanVienViewModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dungna29
 */
public class QLNhanVienService implements IQLNhanVienService {

    INhanVienRepo _iNhanVienRepo;

    public QLNhanVienService() {
        _iNhanVienRepo = new NhanVienRepo();
    }

    @Override
    public String add(NhanVienViewModel nv) {
        //Validate trước đẩy dữ liệu sang DAO
        _iNhanVienRepo.add(new NhanVien(nv.getMaNv(), nv.getIdChucVu(), nv.getId(), nv.getTen(), nv.getGioiTinh()));
        return "Thêm Thành Công";
    }

    @Override
    public String update(NhanVienViewModel nvv) {
        //Map lại dữ liệu từ ViewModel với Model
        NhanVien nv = new NhanVien();
        nv.setId(nvv.getId());
        nv.setTen(nvv.getTen());
        if (_iNhanVienRepo.update(nv)) {
            return "Sửa Thành Công";
        }
        return "Sửa thất bại";
    }

    @Override
    public String delete(int idNV) {
        if (_iNhanVienRepo.delete(idNV)) {
            return "Xoá Thành Công";
        }
        return "Xoá thất bại";
    }

    @Override
    public List<NhanVienViewModel> getLstNhanViens() {
        //Đây là nơi sẽ code câu lệnh join 2 bảng chức vụ và nhân viên sau đó gán data lại cho ListNhanVienViewModel

        List<NhanVienViewModel> lstNVs = new ArrayList<>();
        //Giả sử mình call đến Repo của chức vụ đã có data
        List<ChucVu> lst = new ArrayList<>();
        lst.add(new ChucVu(1, "GĐ", "Giám Đốc"));
        int stt = 1;
        for (NhanVien x : _iNhanVienRepo.getAllNhanViens()) {
            lstNVs.add(new NhanVienViewModel(stt, x.getId(), x.getTen(), x.getGioiTinh(), x.getMaNv(), x.getIdChucVu(), "GĐ"));
            stt++;
        }
        return lstNVs;
    }

    @Override
    public List<NhanVienViewModel> getLstNhanViens(String tenNV) {
       var lstTemp = new ArrayList<NhanVienViewModel>();
        for (NhanVienViewModel x : getLstNhanViens()) {
            if (x.getTen().toLowerCase().contains(tenNV.toLowerCase())) {
                lstTemp.add(x);
            }
        }
        return lstTemp;
    }

}
