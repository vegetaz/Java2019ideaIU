package HelloWorld;
/*
* In ra các số chia hết cho 3, 5, 7 và nằm trong khoảng [1000, 2000]
* */
public class SoChiaHetCho357 {
    public static void main(String[] args) {
        int i;
        int n = 2000;
        System.out.print("Các số chia hết cho 3, 5, 7 và nằm trong khoảng [1000, 2000]: ");
        for (i = 1000; i <= n; i++) {
            if ((i % 3 == 0) && (i % 5 == 0) && (i % 7 == 0)) {
                System.out.printf(i + "\t");
            }
        }
    }
}
