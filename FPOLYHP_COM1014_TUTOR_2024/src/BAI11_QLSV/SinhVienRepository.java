package BAI11_QLSV;

import java.util.ArrayList;

public class SinhVienRepository {
    private ArrayList<SinhVien> listSV;
    
    public SinhVienRepository()
    {
        this.listSV = new ArrayList<>();
        this.listSV.add(new SinhVien("PH00100", "Ng Van A", "UDPM", 1));
        this.listSV.add(new SinhVien("PH00101", "Ng Thi B", "UDPM", 0));
        this.listSV.add(new SinhVien("PH00102", "Tr Thi C", "CNTT", 0));
    }

    public ArrayList<SinhVien> getListSV() {
        return listSV;
    }

    public void setListSV(ArrayList<SinhVien> listSV) {
        this.listSV = listSV;
    }
    
    public void create(SinhVien sv) {
        this.listSV.add(sv);
    }
    
    public void update(SinhVien newSV)
    {
        // UPDATE SinhVien SET ... WHERE maSV = ?
        for (int i = 0; i < this.listSV.size(); i++) {
            SinhVien x = this.listSV.get(i);
            if (x.getMaSV().equals(newSV.getMaSV())) {
                this.listSV.set(i, newSV);
            }
        }
    }
    
    public void delete(SinhVien svXoa)
    {
        // DELETE FROM SinhVien WHERE MaSV = ?
        for (int i = 0; i < this.listSV.size(); i++) {
            SinhVien x = this.listSV.get(i);
            if (x.getMaSV().equals(svXoa.getMaSV())) {
                this.listSV.remove(i);
            }
        }
    }
}
