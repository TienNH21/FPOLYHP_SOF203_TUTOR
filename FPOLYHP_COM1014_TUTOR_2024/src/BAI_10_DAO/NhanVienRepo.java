/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_10_DAO;

import BAI_10_Models.NhanVien;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dungna29
 */
public class NhanVienRepo implements INhanVienRepo {

    private List<NhanVien> _lstNhanViens;

    public NhanVienRepo() {
        _lstNhanViens = new ArrayList<>();
        FakeData();

    }

    private void FakeData() {
        _lstNhanViens.add(new NhanVien("DungNA", 1, 1, "Dũng", 1));
        _lstNhanViens.add(new NhanVien("TienNH", 2, 2, "Dũng", 1));
        _lstNhanViens.add(new NhanVien("NganCT4", 3, 2, "Dũng", 0));
        _lstNhanViens.add(new NhanVien("PhongTT35", 4, 3, "Dũng", 1));
        _lstNhanViens.add(new NhanVien("HungCV", 5, 3, "Dũng", 1));
    }

    @Override
    public boolean add(NhanVien nv) {
        //Validate data sau đó insert vào DB
        _lstNhanViens.add(nv);
        return true;

    }

    @Override
    public boolean update(NhanVien nv) {
        int temp = getIndexByID(nv.getId());
        if (temp == -1) {
            return false;
        }
        _lstNhanViens.get(temp).setTen(nv.getTen());
        _lstNhanViens.get(temp).setGioiTinh(nv.getGioiTinh());
        //Muốn sửa gì thì có thể bổ sung thêm
        return true;
    }

    public int getIndexByID(int ID) {
        for (int i = 0; i < _lstNhanViens.size(); i++) {
            if (ID == _lstNhanViens.get(i).getId()) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean delete(int id) {
        int temp = getIndexByID(id);
        if (temp == -1) {
            return false;
        }
        _lstNhanViens.remove(temp);
        //Muốn sửa gì thì có thể bổ sung thêm
        return true;
    }

    @Override
    public List<NhanVien> getAllNhanViens() {
      return _lstNhanViens;
    }

}
