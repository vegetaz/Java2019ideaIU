package HelloWorld;
/*
* In ra màn hình các số nhỏ hơn 100 và chia hết cho 3 và 7
* */
public class ChiaHetCho3Va7 {
    public static void main(String[] args) {
        int n = 100;
        int i;
        System.out.print("Các số nhỏ hơn 100 và chia hết cho 3 và 7 là: ");
        for (i = 0; i < n; i++) {
            if (i % 3 == 0 && i % 7 == 0) {
                System.out.printf(i + "\t");
            }
        }
    }
}
