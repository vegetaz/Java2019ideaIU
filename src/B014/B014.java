package B014;

public class B014 {
    public static void main(String[] args) {
        CNKSP cn1 = new CNKSP();
        cn1.nhapThongTin();
        cn1.setSoSanPham(1150);
        cn1.setDonGiaSP(5000);
        cn1.tinhLuong();
        cn1.inThongTin();
        CNTCN cn2 = new CNTCN();
        cn2.nhapThongTin();
        cn2.setHeSoLuong(3.5f);
        cn2.setLuongCoBan(1000000);
        cn2.setSoNNgayCong(25);
        cn2.tinhLuong();
        cn2.inThongTin();
    }
}
