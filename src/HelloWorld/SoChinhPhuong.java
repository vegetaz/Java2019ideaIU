package HelloWorld;

import java.util.Scanner;

/*
* Số Chính Phương - Square Number
* Số chính phương hay còn gọi là số hình vuông là số tự nhiên có căn bậc 2 là một số tự nhiên, hay nói cách khác,
* số chính phương là bình phương (lũy thừa bậc 2) của một số tự nhiên.
* https://vi.wikipedia.org/wiki/S%E1%BB%91_ch%C3%ADnh_ph%C6%B0%C6%A1ng
* */
public class SoChinhPhuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int i;

        System.out.print("Nhập vào số nguyên dương: ");
        n = sc.nextInt();

        while (n < 0) {
            System.out.print("Nhập vào số nguyên dương: ");
            n = sc.nextInt();
        }

        i = (int)Math.sqrt(n);
        if (i * i == n) {
            System.out.printf("Số %d là số chính phương!\n", n);
        }
        else
            System.out.printf("Số %d không là số chính phương!\n", n);
    }

}
