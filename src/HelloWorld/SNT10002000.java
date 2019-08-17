package HelloWorld;
/*
* https://vi.wikipedia.org/wiki/Số_nguyên_tố
* In ra màn hình các số nguyên tố từ 1000 tới 2000
 * */
public class SNT10002000 {
    public static void main(String[] args) {
        int k;
        int n;
        int dem;
        for (k = 1000; k <= 2000; k++) {
            dem = 0;
            for (n = 2; n <= k; n++) {
                if (k % n == 0) {
                    dem++;
                }
            }
            if (dem == 1) {
                System.out.println(k);
            }
        }
    }
}
