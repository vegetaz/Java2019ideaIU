package AbstractClassDemo;

public class NhanVienVanPhong extends NhanVien {
    private float mucLuong;
    private int soNgayNghi;
    final float PHAT = 20000f;

    public NhanVienVanPhong() {
    }

    public NhanVienVanPhong(float mucLuong, int soNgayNghi) {
        this.mucLuong = mucLuong;
        this.soNgayNghi = soNgayNghi;
    }

    public NhanVienVanPhong(float mucLuong, int soNgayNghi, String hoTen, int namVaoLam) {
        super(hoTen, namVaoLam);
        this.mucLuong = mucLuong;
        this.soNgayNghi = soNgayNghi;
    }

    public float getMucLuong() {
        return mucLuong;
    }

    public int getSoNgayNghi() {
        return soNgayNghi;
    }

    public void setMucLuong(float mucLuong) {
        this.mucLuong = mucLuong;
    }

    public void setSoNgayNghi(int soNgayNghi) {
        this.soNgayNghi = soNgayNghi;
    }

    @Override
    public float tinhLuong() {
        float luong = 0f;
        luong = mucLuong - soNgayNghi * PHAT;
        return luong;
    }

}
