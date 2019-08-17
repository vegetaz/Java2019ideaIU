package HelloWorld;
/*
* In ra màn hình 15 số nguyên tố đầu tiên
* Số nguyên tố là số tự nhiên khác 0 chỉ có hai ước số dương phân biệt là {\displaystyle 1} 1 và chính nó
* https://vi.wikipedia.org/wiki/S%E1%BB%91_nguy%C3%AAn_t%E1%BB%91
* */
public class SoNguyenToDauTien {
    public static void main(String[] args) {
        int k = 0;
        int n;
        int dem;
        int j = 0;
        while (j < 15) {
            k++;
            dem = 0;
            for (n = 2; n < k; n++) {
                if (k % n == 0) {
                    dem++;
                }
            }
            if (dem == 1) {
                System.out.println(k + " ");
                j++;
            }
        }
    }
}
