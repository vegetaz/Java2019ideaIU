package AbstractClassDemo;
import java.util.Calendar;

public abstract class NhanVien {
    private String hoTen;
    private int namVaoLam;
    final float BASE = 100000f;
    final float RATE = 200000f;

    public NhanVien() {
    }

    public NhanVien(String hoTen, int namVaoLam) {
        this.hoTen = hoTen;
        this.namVaoLam = namVaoLam;
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getNamVaoLam() {
        return namVaoLam;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNamVaoLam(int namVaoLam) {
        this.namVaoLam = namVaoLam;
    }

    public abstract float tinhLuong();

    public float tinhThuong() {
        //B1. Lay nam hien tai
        /*Date d = new Date();
        int nht = d.getYear();
        int namLamViec = nht - namVaoLam;*/
        Calendar cd = Calendar.getInstance();
        int nht = cd.get(Calendar.YEAR);
        int namLamViec = nht - namVaoLam;
        float thuong;
        thuong = BASE + namLamViec * RATE;
        return thuong;
    }
}
