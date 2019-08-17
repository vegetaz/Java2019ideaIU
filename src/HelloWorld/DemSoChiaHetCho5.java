package HelloWorld;
/*
 * Trong các số tự nhiên nhỏ hơn 100, hãy đếm có bao nhiêu số
 * - Chia hết cho 5
 * - Chia 5 dư 1
 * - Chia 5 dư 2
 * - Chia 5 dư 3
 */
public class DemSoChiaHetCho5 {
    public static void main(String[] args) {
        int d0 = 0;
        int d1 = 0;
        int d2 = 0;
        int d3 = 0;
        for (int i = 5; i <= 100; i++) {
            switch (i % 5) {
                case 0:
                    d0++;
                case 1:
                    d1++;
                case 2:
                    d2++;
                case 3:
                    d3++;
            }
        }
        System.out.println("Số chia hết cho 5: " + d0 + " số.");
        System.out.println("Số chia cho 5 du 1: " + d1 + " số.");
        System.out.println("Số chia cho 5 du 2: " + d2 + " số.");
        System.out.println("Số chia cho 5 du 3: " + d3 + " số.");
    }
}
