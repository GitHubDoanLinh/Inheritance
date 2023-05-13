package KeThua;

public class TestNhanVien {
    public static void main(String[] args) {
        NhanVienChinhThuc Linh = new NhanVienChinhThuc(1,"Doan Huu Linh");
        NhanVienThoiVu An = new NhanVienThoiVu(2,"Nguyen Van An");

        Linh.tinhLuong();
        An.tinhLuong();

    }
}
