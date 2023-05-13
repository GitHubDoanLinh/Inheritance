package OverloadingMethod;
// overloading method xảy ra trong cùng 1 lớp với các phương thức cùng tên
// nhưng khác nhau về tham số, đối số.
public class SinhVien {
    private int ma;
    private String ten;
    private double diem;

    public SinhVien(){}
    public SinhVien(int ma){
        this();
        this.ma = ma;
    }
    public SinhVien(int ma, String ten){
        this(ma);
        this.ten = ten;
    }
    public SinhVien (int ma, String ten, double diem){
        this(ma, ten);
        this.diem = diem;
    }
/*---------------------------------------------------------------------------------------------------*/
    // 3 hàm xetTN cung ten nhưng khác nhau signature trong cùng 1 lớp(đây là 3 hàm overloding method)
    // signature: số lượng đối số, thứ tự đối số, kiểu dl đối số
    public void xetTotNghiep(){
        if(this.diem>=5){
            System.out.println("Được phép tốt nghiệp");
        }
        else {
            System.out.println("Chưa đủ điều kiện tốt nghiệp");
        }
    }
    public void xetTotNghiep(double diem){
        System.out.println("Bạn có điểm "+ diem);
    }
    public void xetTotNghiep(double diem, int vungUuTien){
        System.out.println("Bạn có điểm "+ diem+", vùng ưu tiên= "+vungUuTien);
    }
/*---------------------------------------------------------------------------*/
    public  void dangKyHocPhan(int m1){

    }
    public void dangKyHocPhan(String m1){

    }

}
