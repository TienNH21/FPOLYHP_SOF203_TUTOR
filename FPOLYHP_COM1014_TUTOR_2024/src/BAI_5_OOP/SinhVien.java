/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_5_OOP;

/**
 *
 * @author dungna29
 */
//Class => Lớp => Tạo đối tượng bắt buộc phải viết hoa chữ cái đầu.
public class SinhVien {
    //Phần 1: Liệt kê các thuộc tính mà đối tượng cần
    private int temp1;
    private String temp2;
    private int temp3;
    private double temp4;
    private String truong = "FPOLY";
    
    //Phần 2: Contructor
       //Phần 2 Contructor và sẽ có 2 loại có tham số và không tham số
    /*
        - Tên Contructor phải giống với tên class và có từ khóa public
        - Khi khởi tạo đối tượng thì Contructor luôn là thành phần chạy đầu tiên trong class đối tượng đó.
        - Contructor không tham số dùng để khởi tạo đối tượng ko có giá trị ban đầu
        - Contructor có tham số  để khởi tạo đối tượng có ngay giá trị
        - Nếu khi khởi tạo đối tượng mà đối tượng không có contructor nào thì chương trình sẽ tự động khởi tạo cho đối tượng đó 1 contructor mặc định đó là contructor không tham số.
 */
 
  //2.1 Contructor không tham số: Alt + insert hoặc chuột phải chọn Insert code.->Contructor

    public SinhVien() {
        System.out.println("Contructor không tham số");
    }
   
     //2.2 Contructor có tham số: Alt + insert hoặc chuột phải chọn Insert code.->Contructor - Select All

    public SinhVien(int temp12, String temp2, int temp3, double temp4) {
        temp1 = temp12;
        this.temp2 = temp2;
        this.temp3 = temp3;
        this.temp4 = temp4;
        
        //This?: Dùng để tham chiếu đến thuộc tính và phương thức của lớp hiện tại
    }
    
    
  //Phần 3:Getter và Setter Vì khi thuộc tính bị Private muốn lấy và gán giá trị cho nó thì phải sử dụng
  // Alt + Insert chọn Getter và Setter -> Select All

    public int getTemp1() {
        return temp1;
    }

    public void setTemp1(int temp1) {
        this.temp1 = temp1;
    }

    public String getTemp2() {
        return temp2;
    }

    public void setTemp2(String temp2) {
        this.temp2 = temp2;
    }

    public int getTemp3() {
        return temp3;
    }

    public void setTemp3(int temp3) {
        this.temp3 = temp3;
    }

    public double getTemp4() {
        return temp4;
    }

    public void setTemp4(double temp4) {
        this.temp4 = temp4;
    }

    public String getTruong() {
        return truong;
    }

    public void setTruong(String truong) {
        System.out.println("Bạn chưa trình để gán giá trị");
      
    }

    //Phần 4: Triển khai các hành động của đối tượng
    public void inRaManHinh(){
        System.out.println("In ra gì đó");
    }
}
