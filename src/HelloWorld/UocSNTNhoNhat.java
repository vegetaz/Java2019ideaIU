package HelloWorld;
/*
 * Ước số nguyên tố nhỏ nhất của n
 * Trong toán học, nếu số nguyên a chia hết cho số nguyên b thì số b được gọi là ước của số nguyên a, a được gọi là bội của b.
 * Số nguyên dương b lớn nhất là ước của cả hai số nguyên a, b được gọi là ước số chung lớn nhất (ƯCLN) của a và b.
 * Trong trường hợp cả hai số nguyên a và b đều bằng 0 thì chúng không có ƯCLN vì khi đó mọi số tự nhiên khác không đều là ước chung của a và b.
 * Nếu chỉ một trong hai số a hoặc b bằng 0, số kia khác 0 thì ƯCLN của chúng bằng giá trị tuyệt đối của số khác 0.
 */
public class UocSNTNhoNhat {
    public static void main(String[] args) {
        int n = 40;
        for (int i = 2; i <= n; i++) {
            int c = 0;
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    c++;
                }
            }
            if ((n % i == 0) && (c == 1)) {
                System.out.print("Ước số nguyên tố nhỏ nhất: " + i);
                break;
            }
        }
        System.out.println("");
    }
}
