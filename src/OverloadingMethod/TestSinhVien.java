package OverloadingMethod;

public class TestSinhVien {
    public static void main(String[] args) {
        SinhVien teo = new SinhVien(1,"Nguyen Van Teo",9);
        //gọi phương thức theo đối số
        teo.xetTotNghiep();
        teo.xetTotNghiep(4);
        teo.xetTotNghiep(9,1);
        // => tiết kiệm tên hàm, các hàm có chung mục đích nhg có nhiều tình huống khác nhau
    }
}
