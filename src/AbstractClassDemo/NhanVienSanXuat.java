package AbstractClassDemo;

public class NhanVienSanXuat extends NhanVien {
    private int sanPham;
    final float TIEN = 20000;

    public NhanVienSanXuat() {
    }

    public NhanVienSanXuat(int sanPham, String hoTen, int namVaoLam) {
        super(hoTen, namVaoLam);
        this.sanPham = sanPham;
    }

    public int getSanPham() {
        return sanPham;
    }

    public void setSanPham(int sanPham) {
        this.sanPham = sanPham;
    }

    @Override
    public float tinhLuong() {
        float luong = 0f;
        luong = sanPham * TIEN;
        return luong;
    }
}
