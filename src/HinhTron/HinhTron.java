package HinhTron;

public class HinhTron {
    private float r;

    public HinhTron(){}
    public HinhTron(float r) {
        this.r = r;
    }

    public float getR() {
        return this.r;
    }

    public void setR(float r) {
        this.r = r;
    }

    public double chuVi() {
        return r * 2 * Math.PI;
    }

    public double dienTich() {
        return Math.pow(r, 2) * Math.PI;
    }

    @Override
    public String toString() {
        return "Bán kính: " + r + "\nChu vi: " + chuVi() + "\nDiện tích: " + dienTich();
    }
}
