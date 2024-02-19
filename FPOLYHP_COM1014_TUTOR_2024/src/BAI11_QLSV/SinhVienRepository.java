package BAI11_QLSV;

import java.util.ArrayList;

// B1:
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SinhVienRepository {
    // B2:
    private Connection conn;
    
    public SinhVienRepository()
    {
        try {
            this.conn = DBContext.getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    /**
     * Lấy ra toàn bộ dữ liệu trong DB
     */
    public ArrayList<SinhVien> findAll()
    {
        ArrayList<SinhVien> dssv = new ArrayList<>();
        
        // B3: Viết truy vấn và khởi tạo PreparedStatement
        String sql = "SELECT * FROM SinhVien";
        try {
            PreparedStatement ps = this.conn.prepareStatement(sql);
            
            // B4: Truyền tham số cho truy vấn và thực thi truy vấn.
            ps.execute();
            
            // B5: Lấy dữ liệu trả về từ ResultSet
            /**
             * Chỉ có các truy vấn SELECT mới có dữ liệu trả về qua ResultSet
             */
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                String maSV = rs.getString("MaSV");
                String hoTen = rs.getString("HoTen");
                String cNganh = rs.getString("ChuyenNganh");
                String gioiTinh = rs.getString("GioiTinh");
                SinhVien sv = new SinhVien(maSV, hoTen, cNganh, gioiTinh);
                dssv.add(sv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return dssv;
    }
    
    public void create(SinhVien sv) {
        /**
         * Dấu ? đại diện cho các giá trị cần truyền vào trong câu truy vấn,
         * được gọi là tham số của câu truy vấn.
         */
        String query = "INSERT INTO SinhVien(MaSV, HoTen, ChuyenNganh, GioiTinh)"
            + " VALUES (?, ?, ?, ?)";
        
        try {
            PreparedStatement ps = this.conn.prepareStatement(query);
            
            /**
             * Khi truyền tham số cho câu truy vấn:
             * Lưu ý thứ tự và kiểu dữ liệu của tham số
             * Câu truy vấn có bao nhiêu dấu ? thì cần truyền đủ bấy nhiêu giá trị cho câu truy vấn.
             */
            ps.setString(1, sv.getMaSV());
            ps.setString(2, sv.getHoTen());
            ps.setString(3, sv.getChuyenNganh());
            ps.setString(4, sv.getGioiTinh());
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void update(SinhVien sv)
    {
        String query = "UPDATE SinhVien SET HoTen = ?, ChuyenNganh = ?, GioiTinh = ? "
            + " WHERE MaSV = ?";
        
        try {
            PreparedStatement ps = this.conn.prepareStatement(query);
            ps.setString(1, sv.getHoTen());
            ps.setString(2, sv.getChuyenNganh());
            ps.setString(3, sv.getGioiTinh());
            ps.setString(4, sv.getMaSV());
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void delete(SinhVien sv)
    {
        String query = "DELTE FROM SinhVien WHERE MaSV = ?";
        
        try {
            PreparedStatement ps = this.conn.prepareStatement(query);
            ps.setString(1, sv.getMaSV());
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
