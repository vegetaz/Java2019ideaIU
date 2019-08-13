package DTHCN;

import java.util.Scanner;

public class DienTichHinhChuNhat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float chieuDai;
        float chieuRong;
        System.out.print("Mời nhập chiều rộng: ");
        chieuRong = sc.nextFloat();
        System.out.print("Mời nhập chiều dài: ");
        chieuDai = sc.nextFloat();
        HinhChuNhat hcn = new HinhChuNhat(chieuRong, chieuDai);
        System.out.println("Thông tin hình chữ nhật đã nhập!");
        System.out.println(hcn);
    }
}
