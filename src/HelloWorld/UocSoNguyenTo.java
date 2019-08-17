package HelloWorld;
/*
 * In ra màn hình tất cả các ước số nguyên tố của n
 */
public class UocSoNguyenTo {
    public static void main(String[] args) {
        int n = 1027;
        for (int i = 1; i <= n; i++) {
            int c = 0;
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    c++;
                }
            }
            if ((c == 1) && (n % i == 0)) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }
}
