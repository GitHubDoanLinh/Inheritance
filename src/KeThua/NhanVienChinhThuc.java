package KeThua;

public class NhanVienChinhThuc extends NhanVien{
    // do constructor của class cha không đc phép kế thừa, vì vậy
    //  tại class này, phải định nghĩa lại constructor và
    // sử dụng super để gọi

    public NhanVienChinhThuc(){
        super();
    }
    public NhanVienChinhThuc(int ma, String ten){
        super(ma,ten);
    }

    @Override
    public void tinhLuong() {
        super.tinhLuong();// super gọi tới phương thức tính lương của class cha
        System.out.println("==>Đây là nhân viên chính thức");
    }
}
