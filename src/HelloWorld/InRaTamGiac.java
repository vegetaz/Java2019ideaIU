package HelloWorld;
/*
* In ra hình tam giác
* */
import java.util.Scanner;

public class InRaTamGiac {
    public static void main(String[] args) {
        int n;
        Scanner sn = new Scanner(System.in);
        System.out.print("Nhập vào số dòng: ");
        n = sn.nextInt();
        for (int i = 1; i<= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
