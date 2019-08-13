package HinhTron;

import java.util.Scanner;

public class TTHinhTron {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập vào bán kính: ");
        float bk = sc.nextFloat();
        HinhTron ht = new HinhTron(bk);
        if (bk >= 0) {
            System.out.println("Thông tin hình tròn đã nhập!");
            System.out.println(ht);
        } else {
            System.out.println("Bán kính hình tròn không phù hợp!");
        }
    }
}
